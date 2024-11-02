<template>
	<table id='sj10Table' width="792.17" border="0" cellpadding="0" cellspacing="0"
		style='width:475.30pt;border-collapse:collapse;table-layout:fixed;'>
		<col width="39.42" class="xl70" style='mso-width-source:userset;mso-width-alt:1153;' />
		<col width="65.25" class="xl70" style='mso-width-source:userset;mso-width-alt:1908;' />
		<col width="102.42" class="xl71" style='mso-width-source:userset;mso-width-alt:2996;' />
		<col width="216.00" class="xl71" style='mso-width-source:userset;mso-width-alt:6319;' />
		<col width="75.42" class="xl71" style='mso-width-source:userset;mso-width-alt:2206;' />
		<col width="135" class="xl70" style='mso-width-source:userset;mso-width-alt:3949;' />
		<col width="158.67" class="xl70" style='mso-width-source:userset;mso-width-alt:4641;' />
		<tr height="25" class="xl68" style='height:15.00pt;mso-height-source:userset;mso-height-alt:300;'>
			<td class="xl72" height="25" width="792.17" colspan="7"
				style='height:15.00pt;width:475.30pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				记录表SJ10</td>
		</tr>
		<tr height="33.75" class="xl69" style='height:20.25pt;mso-height-source:userset;mso-height-alt:405;'>
			<td class="xl73" height="33.75" colspan="7"
				style='height:20.25pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'></td>
		</tr>
		<tr height="33.75" class="xl69" style='height:20.25pt;mso-height-source:userset;mso-height-alt:405;'>
			<td class="xl73" height="33.75" colspan="7"
				style='height:20.25pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				三维网客土喷播草种现场检查记录表</td>
		</tr>
		<tr height="40" class="xl68" style='height:24.00pt;mso-height-source:userset;mso-height-alt:480;'>
			<td class="xl74" height="40" colspan="2"
				style='height:24.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				施工单位：</td>
			<td class="xl75" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.sgdw}}</td>
			<td class="xl74">合同号：</td>
			<td class="xl76" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.hth}}</td>
		</tr>
		<tr height="42.50" class="xl68" style='height:25.50pt;mso-height-source:userset;mso-height-alt:510;'>
			<td class="xl77" height="42.50" colspan="2"
				style='height:25.50pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				监理单位：</td>
			<td class="xl78" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.jldw}}</td>
			<td class="xl74">编<span style='mso-spacerun:yes;'>&nbsp; </span>号：</td>
			<td class="xl79" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.bh}}</td>
		</tr>
		<tr height="50" class="xl68" style='height:30.00pt;mso-height-source:userset;mso-height-alt:600;'>
			<td class="xl80" height="50" colspan="3"
				style='height:30.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				工程名称</td>
			<td class="xl81">{{form.gcmc}}</td>
			<td class="xl80" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>施工时间</td>
			<td class="xl82">{{form.sgsj}}</td>
		</tr>
		<tr height="50" class="xl68" style='height:30.00pt;mso-height-source:userset;mso-height-alt:600;'>
			<td class="xl83" height="50" colspan="3"
				style='height:30.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				工程部位<br />（桩号、墩台号、孔号）</td>
			<td class="xl84" colspan="4"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.gcbw}}</td>
		</tr>
		<tr height="53.75" class="xl68" style='height:32.25pt;mso-height-source:userset;mso-height-alt:645;'>
			<td class="xl80" height="53.75" style='height:32.25pt;'>项次</td>
			<td class="xl80" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>检验项目</td>
			<td class="xl80">规定值或允许偏差</td>
			<td class="xl80" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>检验结果</td>
			<td class="xl80">检查方法和频率</td>
		</tr>
		<tr height="36.25" style='height:21.75pt;mso-height-source:userset;mso-height-alt:435;'>
			<td class="xl80" height="73.75" rowspan="2"
				style='height:44.25pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:num>1
			</td>
			<td class="xl80" colspan="2" rowspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>网的长度（cm）</td>
			<td class="xl85">允许偏差：±10</td>
			<td class="xl84" colspan="2" rowspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.wdcdjyjg}}
			</td>
			<td class="xl80" rowspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>每200m检查4处</td>
		</tr>
		<tr height="37.50" class="xl68" style='height:22.50pt;mso-height-source:userset;mso-height-alt:450;'>
			<td class="xl85">设计值：</td>
		</tr>
		<tr height="38.75" style='height:23.25pt;mso-height-source:userset;mso-height-alt:465;'>
			<td class="xl80" height="71.25" rowspan="2"
				style='height:42.75pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:num>2
			</td>
			<td class="xl80" colspan="2" rowspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>网的宽度(cm)</td>
			<td class="xl85">设计值：</td>
			<td class="xl84" colspan="2" rowspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.wdkdjyjg}}
			</td>
			<td class="xl80" rowspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>每200m检查4处</td>
		</tr>
		<tr height="32.50" class="xl68" style='height:19.50pt;mso-height-source:userset;mso-height-alt:390;'>
			<td class="xl85">允许偏差：±10</td>
		</tr>
		<tr height="36.25" style='height:21.75pt;mso-height-source:userset;mso-height-alt:435;'>
			<td class="xl80" height="68.75" rowspan="2"
				style='height:41.25pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;' x:num>3
			</td>
			<td class="xl80" colspan="2" rowspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>铺设表土厚度(cm)</td>
			<td class="xl85">设计值：</td>
			<td class="xl84" colspan="2" rowspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				{{form.psbthdjyjg}}
			</td>
			<td class="xl80" rowspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>每1000m2检查8处</td>
		</tr>
		<tr height="32.50" class="xl68" style='height:19.50pt;mso-height-source:userset;mso-height-alt:390;'>
			<td class="xl85">允许偏差：±2</td>
		</tr>
		<tr height="76.25" class="xl68" style='height:45.75pt;mso-height-source:userset;mso-height-alt:915;'>
			<td class="xl80" height="76.25" style='height:45.75pt;' x:num>4</td>
			<td class="xl80" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>铺设表土的PH值</td>
			<td class="xl80">6～8</td>
			<td class="xl84" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.psbtph}}</td>
			<td class="xl80">每1000m2检查4处</td>
		</tr>
		<tr height="76.25" class="xl68" style='height:45.75pt;mso-height-source:userset;mso-height-alt:915;'>
			<td class="xl80" height="76.25" style='height:45.75pt;' x:num>5</td>
			<td class="xl80" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				<font class="font6">草籽喷种量(g/m</font>
				<font class="font28"><sup>2</sup></font>
				<font class="font6">)</font>
			</td>
			<td class="xl80">符合设计要求</td>
			<td class="xl84" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.czpzl}}</td>
			<td class="xl80">每1000m2检查8处</td>
		</tr>
		<tr height="76.25" class="xl68" style='height:45.75pt;mso-height-source:userset;mso-height-alt:915;'>
			<td class="xl80" height="76.25" style='height:45.75pt;' x:num>6</td>
			<td class="xl80" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>草成活率(%)</td>
			<td class="xl80">≥90</td>
			<td class="xl84" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.cchl}}</td>
			<td class="xl80">每1000m2检查8处</td>
		</tr>
		<tr height="76.25" class="xl68" style='height:45.75pt;mso-height-source:userset;mso-height-alt:915;'>
			<td class="xl80" height="76.25" style='height:45.75pt;' x:num>7</td>
			<td class="xl80" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>草高(cm)</td>
			<td class="xl80">≥10</td>
			<td class="xl84" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.cg}}</td>
			<td class="xl80">每1000m2检查8处</td>
		</tr>
		<tr height="76.25" class="xl68" style='height:45.75pt;mso-height-source:userset;mso-height-alt:915;'>
			<td class="xl80" height="76.25" style='height:45.75pt;' x:num>8</td>
			<td class="xl80" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>网横向搭接长度(cm）</td>
			<td class="xl80">≥10</td>
			<td class="xl84" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.whxtjcd}}</td>
			<td class="xl80">每200m检查4处</td>
		</tr>
		<tr height="76.25" class="xl68" style='height:45.75pt;mso-height-source:userset;mso-height-alt:915;'>
			<td class="xl80" height="76.25" style='height:45.75pt;' x:num>9</td>
			<td class="xl80" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>网纵向搭接长度(cm)</td>
			<td class="xl80">≥15</td>
			<td class="xl84" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.wzxdjcd}}</td>
			<td class="xl80">每200m检查4处</td>
		</tr>
		<tr height="63.17" class="xl68" style='height:37.90pt;mso-height-source:userset;mso-height-alt:758;'>
			<td class="xl80" height="63.17" style='height:37.90pt;' x:num>10</td>
			<td class="xl80" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				<font class="font6">U型钉或J型钉<br />(根/m</font>
				<font class="font28"><sup>2</sup></font>
				<font class="font6">)</font>
			</td>
			<td class="xl80">符合设计要求</td>
			<td class="xl84" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>{{form.uhjxd}}</td>
			<td class="xl80">每1000m2检查8处</td>
		</tr>
		<tr height="28.75" style='height:17.25pt;mso-height-source:userset;mso-height-alt:345;'>
			<td class="xl85" height="28.75" colspan="7"
				style='height:17.25pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				外观检查（支撑情况等）</td>
		</tr>
		<tr height="115" class="xl68" style='height:69.00pt;mso-height-source:userset;mso-height-alt:1380;'>
			<td class="xl84" height="115" colspan="7"
				style='height:69.00pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				{{form.wgjc}}
			</td>
		</tr>
		<tr height="22.50" style='height:13.50pt;mso-height-source:userset;mso-height-alt:270;'>
			<td class="xl88" height="22.50" style='height:13.50pt;'></td>
			<td class="xl88"></td>
			<td class="xl89"></td>
			<td class="xl89"></td>
			<td class="xl89"></td>
			<td class="xl88"></td>
			<td class="xl88"></td>
		</tr>
		<tr height="22.50" style='height:13.50pt;mso-height-source:userset;mso-height-alt:270;'>
			<td class="xl88" height="22.50" colspan="2"
				style='height:13.50pt;border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>
				施工员：</td>
			<td class="xl89"></td>
			<td class="xl89"></td>
			<td class="xl88" colspan="2"
				style='border-right:.5pt solid windowtext;border-bottom:.5pt solid windowtext;'>专业工程师：</td>
			<td class="xl88"></td>
		</tr>
		<tr width="0" style='display:none;'>
			<td width="39" style='width:24;'></td>
			<td width="65" style='width:39;'></td>
			<td width="102" style='width:61;'></td>
			<td width="216" style='width:130;'></td>
			<td width="75" style='width:45;'></td>
			<td width="135" style='width:81;'></td>
			<td width="159" style='width:95;'></td>
		</tr>
	</table>
	   <!-- <el-button link type="primary" @click="genExcel()">生成excel</el-button> -->
		
		<el-col :span="1.5">
			<el-button link type="primary" @click="genExcel()">生成excel</el-button>
		</el-col>
</template>

<script>
	import {
		getSj10,
		addSj10,
		editSj10
	} from "@/api/system/sj10";

	import $ from 'jquery';

	export default {
		data() {
			return {
				form: {
					//id: undefined,
					sgdw: "",
					hth: "",
					jldw: "",
					bh: "",
					gcmc: "",
					sgsj: "",
					gcbw: "",
					wdcdsjz: 0,
					wdcdjyjg: "",
					wdkdsjz: 0,
					wdkdjyjg: "",
					psbthd: 0,
					psbthdjyjg: "",
					psbtph: "",
					czpzl: "",
					cchl: "",
					cg: "",
					whxtjcd: "",
					wzxdjcd: "",
					uhjxd: "",
					wgjc: ""
				}
			};
		},

		created() {
			var id = location.search.split("=")[1];
			// console.log(location.search);
			console.log("ID是：" + id);
			if (typeof id == undefined)
				id = 1
			this.handleSet(id);
			console.log(111);
		},

		methods: {
			handleSet(id) {
				getSj10(id).then(response => {
					console.log(response.data);
					this.form = response.data;
				});
			},

			submitForm() {
				if (this.form.id !== undefined) {
					editSj10(this.form).then(response => {
						this.$modal.msgSuccess("修改成功");
						this.getList();
					});
				} else {
					addSj10(this.form).then(response => {
						this.$modal.msgSuccess("新增成功");
						this.getList();
					});
				}
			},

			getList() {
				console.log("获取列表");
			},
			genExcel() {
				$('#sj10Table').table2excel({
					name: "三维网客土喷播草种现场检查记录表",
					filename: "三维网客土喷播草种现场检查记录表",
					exclude_img: true,
					exclude_links: true,
					exclude_inputs: true
				})
			}
		}
	};
</script>

<style>
	table {
		border-collapse: collapse;
		width: 70%;
		margin: 100px;
	}

	th,
	td {
		border: 1px solid black;
		padding: 8px;
		text-align: center;
	}

	th {
		background-color: #4caf50;
		color: white;
		text-align: left;
	}
</style>