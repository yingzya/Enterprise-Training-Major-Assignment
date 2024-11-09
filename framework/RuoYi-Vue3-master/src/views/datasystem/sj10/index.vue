<template>
	<div class="app-container">
		<el-row :gutter="24">
			<!--用户数据-->
			<el-col :span="24" :xs="24">
				<el-form :model="queryParams" ref="queryRef" :inline="true" v-show="showSearch" label-width="68px">
					<el-form-item label="编号" prop="bh">
						<el-input v-model="queryParams.bh" placeholder="请输入编号" clearable style="width: 240px"
							@keyup.enter="handleQuery" />
					</el-form-item>
					<el-form-item>
						<el-button type="primary" icon="Search" @click="handleQuery">搜索</el-button>
						<el-button icon="Refresh" @click="resetQuery">重置</el-button>
					</el-form-item>
				</el-form>

				<el-row :gutter="10" class="mb8">
					<el-col :span="1.5">
						<el-button type="primary" plain icon="Plus" @click="handleAdd"
							v-hasPermi="['system:user:add']">新增</el-button>
					</el-col>
					<el-col :span="1.5">
						<el-button type="success" plain icon="Edit" :disabled="single" @click="handleUpdate"
							v-hasPermi="['system:user:edit']">修改</el-button>
					</el-col>
					<el-col :span="1.5">
						<el-button type="danger" plain icon="Delete" :disabled="multiple" @click="handleDelete"
							v-hasPermi="['system:user:remove']">删除</el-button>
					</el-col>
					<el-col :span="1.5">
						<el-button type="info" plain icon="Upload" @click="handleImport"
							v-hasPermi="['system:user:import']">导入</el-button>
					</el-col>
					
					<el-col :span="1.5">
						<el-button type="warning" plain icon="Download" @click="handleExport"
							v-hasPermi="['system:user:export']">导出</el-button>
					</el-col>

					
					<right-toolbar v-model:showSearch="showSearch" @queryTable="getList"
						:columns="columns"></right-toolbar>
				</el-row>

				<el-table v-loading="loading" :data="userList" @selection-change="handleSelectionChange">
					<el-table-column type="selection" width="50" align="center" />
					<el-table-column label="最后操作时间" align="center" key="time" prop="time" />
					<el-table-column label="施工单位" align="center" key="sgdw" prop="sgdw" />
					<el-table-column label="合同号" align="center" key="hth" prop="hth" />
					<el-table-column label="监理单位" align="center" key="jldw" prop="jldw" />
					<el-table-column label="编号" align="center" key="bh" prop="bh" />
					<el-table-column label="工程名称" align="center" key="gcmc" prop="gcmc" />
					<el-table-column label="施工时间" align="center" key="sgsj" prop="sgsj" />
					<el-table-column label="工程部位" align="center" key="gcbw" prop="gcbw" />
					<el-table-column label="网的长度设计值" align="center" key="wdcdsjz" prop="wdcdsjz" />
					<el-table-column label="网的长度检验结果" align="center" key="wdcdjyjg" prop="wdcdjyjg" />
					<el-table-column label="网的宽度设计值" align="center" key="wdkdsjz" prop="wdkdsjz" />
					<el-table-column label="网的宽度检验结果" align="center" key="wdkdjyjg" prop="wdkdjyjg" />
					<el-table-column label="铺设表土厚度设计值" align="center" key="psbthd" prop="psbthd" />
					<el-table-column label="铺设表土厚度检验结果" align="center" key="psbthdjyjg" prop="psbthdjyjg" />
					<el-table-column label="铺设表土PH" align="center" key="psbtph" prop="psbtph" />
					<el-table-column label="草籽喷种量" align="center" key="czpzl" prop="czpzl" />
					<el-table-column label="草成活率" align="center" key="cchl" prop="cchl" />
					<el-table-column label="草高" align="center" key="cg" prop="cg" />
					<el-table-column label="网横向搭接长度" align="center" key="whxtjcd" prop="whxtjcd" />
					<el-table-column label="网纵向搭接长度" align="center" key="wzxdjcd" prop="wzxdjcd" />
					<el-table-column label="U型钉或J型钉" align="center" key="uhjxd" prop="uhjxd" />
					<el-table-column label="外观检查（支撑情况等）" align="center" key="wgjc" prop="wgjc" />


					<el-table-column label="操作" align="center" width="150" class-name="small-padding fixed-width">
						<template #default="scope">
							
							<!-- <el-tooltip content="下载" placement="top">
								<el-button link type="primary" icon="Download" @click="genExcel()"
									v-hasPermi="['Details']"></el-button>
							</el-tooltip> -->
							
							<el-tooltip content="修改" placement="top">
								<el-button link type="primary" icon="Edit" @click="handleUpdate(scope.row)"
									v-hasPermi="['system:user:edit']"></el-button>
							</el-tooltip>
							<el-tooltip content="删除" placement="top">
								<el-button link type="primary" icon="Delete" @click="handleDelete(scope.row)"
									v-hasPermi="['system:user:remove']"></el-button>
							</el-tooltip>

							<el-tooltip content="查看详情" placement="top">
								<el-button link type="primary" icon="Edit" @click="Detail(scope.row)"
									v-hasPermi="['Details']"></el-button>
							</el-tooltip>

						</template>
					</el-table-column>
				</el-table>
				<pagination v-show="total > 0" :total="total" v-model:page="queryParams.pageNum"
					v-model:limit="queryParams.pageSize" @pagination="getList" />
			</el-col>
		</el-row>

		<!-- 添加或修改Sj10数据配置对话框 -->
		<el-dialog :title="title" v-model="open" width="1000px" append-to-body>
			<el-form :model="form" :rules="rules" ref="userRef" label-width="170px">
				<el-row>
					<el-col :span="12">
						<el-form-item label="施工单位" prop="sgdw">
							<el-input v-model="form.sgdw" placeholder="请输入施工单位" maxlength="30" />
						</el-form-item>
					</el-col>
					<el-col :span="12">
						<el-form-item label="合同号" prop="hth">
							<el-input v-model="form.hth" placeholder="请输入合同号" maxlength="30" />
						</el-form-item>
					</el-col>
					<el-col :span="12">
						<el-form-item label="监理单位" prop="jldw">
							<el-input v-model="form.jldw" placeholder="请输入监理单位" maxlength="30" />
						</el-form-item>
					</el-col>
					<el-col :span="12">
						<el-form-item label="编号" prop="bh">
							<el-input v-model="form.bh" placeholder="请输入编号" maxlength="30" />
						</el-form-item>
					</el-col>
					<el-col :span="12">
						<el-form-item label="工程名称" prop="gcmc">
							<el-input v-model="form.gcmc" placeholder="请输入工程名称" maxlength="30" />
						</el-form-item>
					</el-col>
					<el-col :span="12">
						<el-form-item label="施工时间" prop="sgsj">
							<el-date-picker v-model="form.sgsj" value-format="YYYY-MM-DD" type="date"
								style="width: 100%;"></el-date-picker>
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="工程部位" prop="gcbw">
							<el-input v-model="form.gcbw" placeholder="请输入工程部位" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="网的长度设计值" prop="wdcdsjz">
							<el-input v-model="form.wdcdsjz" placeholder="请输入网的长度设计值" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="网的长度检验结果" prop="wdcdjyjg">
							<el-input v-model="form.wdcdjyjg" placeholder="请输入网的长度检验结果" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="网的宽度设计值" prop="wdkdsjz">
							<el-input v-model="form.wdkdsjz" placeholder="请输入网的宽度设计值" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="网的宽度检验结果" prop="wdkdjyjg">
							<el-input v-model="form.wdkdjyjg" placeholder="请输入网的宽度检验结果" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="铺设表土厚度设计值" prop="psbthd">
							<el-input v-model="form.psbthd" placeholder="请输入铺设表土厚度设计值" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="铺设表土厚度检验结果" prop="psbthdjyjg">
							<el-input v-model="form.psbthdjyjg" placeholder="请输入铺设表土厚度检验结果" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="铺设表土PH" prop="psbtph">
							<el-input v-model="form.psbtph" placeholder="请输入铺设表土PH" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="草籽喷种量" prop="czpzl">
							<el-input v-model="form.czpzl" placeholder="请输入草籽喷种量" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="草成活率" prop="cchl">
							<el-input v-model="form.cchl" placeholder="请输入草成活率" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="草高" prop="cg">
							<el-input v-model="form.cg" placeholder="请输入草高" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="网横向搭接长度" prop="whxtjcd">
							<el-input v-model="form.whxtjcd" placeholder="请输入网横向搭接长度" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="网纵向搭接长度" prop="wzxdjcd">
							<el-input v-model="form.wzxdjcd" placeholder="请输入网纵向搭接长度" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="U型钉或J型钉" prop="uhjxd">
							<el-input v-model="form.uhjxd" placeholder="请输入U型钉或J型钉" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="外观检查（支撑情况等）" prop="wgjc">
							<el-input v-model="form.wgjc" placeholder="请输入外观检查结果" maxlength="30" />
						</el-form-item>
					</el-col>
				</el-row>
				<el-row>
					<el-col :span="24">
						<el-form-item label="最后操作时间" prop="time">
							<el-date-picker
							   v-model="form.time"
							   value-format="YYYY-MM-DD HH:mm:ss"
							   type="datetime"
							   style="width: 100%;"
							></el-date-picker>
						</el-form-item>
					</el-col>
				</el-row>
			</el-form>
			<template #footer>
				<div class="dialog-footer">
					<el-button type="primary" @click="submitForm">确 定</el-button>
					<el-button @click="cancel">取 消</el-button>
				</div>
			</template>
		</el-dialog>

		<!-- Sj10数据导入对话框 -->
		<el-dialog :title="upload.title" v-model="upload.open" width="400px" append-to-body>
			<el-upload ref="uploadRef" :limit="1" accept=".xlsx, .xls" :headers="upload.headers"
				:action="upload.url + '?updateSupport=' + upload.updateSupport" :disabled="upload.isUploading"
				:on-progress="handleFileUploadProgress" :on-success="handleFileSuccess" :auto-upload="false" drag>
				<el-icon class="el-icon--upload"><upload-filled /></el-icon>
				<div class="el-upload__text">将文件拖到此处，或<em>点击上传</em></div>
				<template #tip>
					<div class="el-upload__tip text-center">
						<div class="el-upload__tip">
							<el-checkbox v-model="upload.updateSupport" />是否更新已经存在的Sj10数据数据
						</div>
						<span>仅允许导入xls、xlsx格式文件。</span>
						<el-link type="primary" :underline="false" style="font-size:12px;vertical-align: baseline;"
							@click="importTemplate">下载模板</el-link>
					</div>
				</template>
			</el-upload>
			<template #footer>
				<div class="dialog-footer">
					<el-button type="primary" @click="submitFileForm">确 定</el-button>
					<el-button @click="upload.open = false">取 消</el-button>
				</div>
			</template>
		</el-dialog>
	</div>
</template>

<script setup name="User">
	import {
		getToken
	} from "@/utils/auth";
	import $ from 'jquery';
	import {
		getSj10s,
		getSj10,
		addSj10,
		editSj10,
		deleteSj10
	} from "@/api/system/sj10";

	const router = useRouter();
	const {
		proxy
	} = getCurrentInstance();

	const userList = ref([]);
	const open = ref(false);
	const loading = ref(true);
	const showSearch = ref(true);
	const ids = ref([]);
	const single = ref(true);
	const multiple = ref(true);
	const total = ref(0);
	const title = ref("");
	const dateRange = ref([]);
	const deptName = ref("");
	const deptOptions = ref(undefined);
	const initPassword = ref(undefined);
	const postOptions = ref([]);
	const roleOptions = ref([]);
	/*** Sj10数据导入参数 */
	const upload = reactive({
		// 是否显示弹出层（Sj10数据导入）
		open: false,
		// 弹出层标题（Sj10数据导入）
		title: "",
		// 是否禁用上传
		isUploading: false,
		// 是否更新已经存在的Sj10数据数据
		updateSupport: 0,
		// 设置上传的请求头部
		headers: {
			Authorization: "Bearer " + getToken()
		},
		// 上传的地址
		url: import.meta.env.VITE_APP_BASE_API + "/system/user/importData"
	});

	const data = reactive({
		form: {},
		queryParams: {
			pageNum: 1,
			pageSize: 10,
			name: undefined
		},
		rules: {
			userName: [{
				required: true,
				message: "Sj10数据名称不能为空",
				trigger: "blur"
			}, {
				min: 2,
				max: 20,
				message: "Sj10数据名称长度必须介于 2 和 20 之间",
				trigger: "blur"
			}],
			nickName: [{
				required: true,
				message: "Sj10数据昵称不能为空",
				trigger: "blur"
			}],
			password: [{
				required: true,
				message: "Sj10数据密码不能为空",
				trigger: "blur"
			}, {
				min: 5,
				max: 20,
				message: "Sj10数据密码长度必须介于 5 和 20 之间",
				trigger: "blur"
			}, {
				pattern: /^[^<>"'|\\]+$/,
				message: "不能包含非法字符：< > \" ' \\\ |",
				trigger: "blur"
			}],
			email: [{
				type: "email",
				message: "请输入正确的邮箱地址",
				trigger: ["blur", "change"]
			}],
			phonenumber: [{
				pattern: /^1[3|4|5|6|7|8|9][0-9]\d{8}$/,
				message: "请输入正确的手机号码",
				trigger: "blur"
			}]
		}
	});

	const {
		queryParams,
		form,
		rules
	} = toRefs(data);

	/** 通过条件过滤节点  */
	const filterNode = (value, data) => {
		if (!value) return true;
		return data.label.indexOf(value) !== -1;
	};

	/** 查询Sj10数据列表 */
	function getList() {
		loading.value = true;
		console.log(555);
		getSj10s(queryParams.value).then(res => {
			console.log(123);
			console.log(res);
			loading.value = false;
			userList.value = res.data.list;
			total.value = res.data.total;
		});
	};

	/** 节点单击事件 */
	function handleNodeClick(data) {
		queryParams.value.deptId = data.id;
		handleQuery();
	};

	/** 搜索按钮操作 */
	function handleQuery() {
		queryParams.value.pageNum = 1;
		getList();
	};

	/** 重置按钮操作 */
	function resetQuery() {
		//dateRange.value = [];
		proxy.resetForm("queryRef");
		//queryParams.value.deptId = undefined;
		//proxy.$refs.deptTreeRef.setCurrentKey(null);
		handleQuery();
	};

	/** 删除按钮操作 */
	function handleDelete(row) {
		const sj10Ids = row.id || ids.value;
		proxy.$modal.confirm('是否确认删除三维网客土喷播草种现场检查记录表编号为"' + sj10Ids + '"的数据项？').then(function() {
			return deleteSj10(sj10Ids);
		}).then(() => {
			getList();
			proxy.$modal.msgSuccess("删除成功");
		}).catch(() => {});
	};

	/** 导出按钮操作 */
	function handleExport() {
		proxy.download("exportExcel", {
			...queryParams.value,
		}, `user_${new Date().getTime()}.xlsx`);
	};

	// function genExcel(){
	// 	$('#sj10Table').table2excel({
	// 		name:"sj10表格",
	// 		filename:"sj10表格",
	// 		exclude_img:true,
	// 		exclude_links:true,
	// 		exclude_inputs:true
	// 	});
	// };
	/** 更多操作 */
	function handleCommand(command, row) {
		switch (command) {
			case "handleResetPwd":
				handleResetPwd(row);
				break;
			case "handleAuthRole":
				handleAuthRole(row);
				break;
			default:
				break;
		}
	};

	/** 选择条数  */
	function handleSelectionChange(selection) {
		ids.value = selection.map(item => item.id);
		single.value = selection.length != 1;
		multiple.value = !selection.length;
	};

	/** 导入按钮操作 */
	function handleImport() {
		upload.title = "三维网客土喷播草种现场检查记录表导入";
		upload.open = true;
	};

	/** 下载模板操作 */
	function importTemplate() {
		proxy.download("system/user/importTemplate", {}, `user_template_${new Date().getTime()}.xlsx`);
	};

	/**文件上传中处理 */
	const handleFileUploadProgress = (event, file, fileList) => {
		upload.isUploading = true;
	};

	const Detail = (row) => {
		console.log("debug"+row.id)
		router.push({
			path: "/detail",
			query: {
				id: row.id
			}
		})
	};

	/** 文件上传成功处理 */
	const handleFileSuccess = (response, file, fileList) => {
		upload.open = false;
		upload.isUploading = false;
		proxy.$refs["uploadRef"].handleRemove(file);
		proxy.$alert("<div style='overflow: auto;overflow-x: hidden;max-height: 70vh;padding: 10px 20px 0;'>" +
			response.msg + "</div>", "导入结果", {
				dangerouslyUseHTMLString: true
			});
		getList();
	};

	/** 提交上传文件 */
	function submitFileForm() {
		proxy.$refs["uploadRef"].submit();
	};

	/** 重置操作表单 */
	function reset() {
		form.value = {
			id: undefined,
			name: undefined,
			wendu: undefined,
			shidu: undefined,
			createdate: undefined
		};
		proxy.resetForm("userRef");
	};

	/** 取消按钮 */
	function cancel() {
		open.value = false;
		reset();
	};

	/** 新增按钮操作 */
	function handleAdd() {
		open.value = true;
		title.value = "添加三维网客土喷播草种现场检查记录表数据";
	};

	/** 修改按钮操作 */
	function handleUpdate(row) {
		reset();
		const id = row.id || ids.value;
		getSj10(id).then(response => {
			form.value = response.data;
			open.value = true;
			title.value = "修改三维网客土喷播草种现场检查记录表数据";
		});
	};

	/** 提交按钮 */
	function submitForm() {
		proxy.$refs["userRef"].validate(valid => {
			if (valid) {
				if (form.value.id != undefined) {
					editSj10(form.value).then(response => {
						proxy.$modal.msgSuccess("修改成功");
						open.value = false;
						getList();
					});
				} else {
					addSj10(form.value).then(response => {
						proxy.$modal.msgSuccess("新增成功");
						open.value = false;
						getList();
					});
				}
				reset()
			}
		});
	};

	getList();
</script>