<template>
	<view>
		<uni-forms :modelValue="sj10Data" style="margin-top: 10px;" label-position="top">
			<uni-forms-item label="施工单位" name="sgdw">
			    <uni-easyinput type="text" v-model="sj10Data.sgdw" 
			    placeholder="请输入施工单位" />
			</uni-forms-item>
			<uni-forms-item label="合同号" name="hth">
			    <uni-easyinput type="text" v-model="sj10Data.hth" 
			    placeholder="请输入合同号" />
			</uni-forms-item>
			<uni-forms-item label="监理单位" name="jldw">
			    <uni-easyinput type="text" v-model="sj10Data.jldw" 
			    placeholder="请输入监理单位" />
			</uni-forms-item>
			<uni-forms-item label="编号" name="bh">
			    <uni-easyinput type="text" v-model="sj10Data.bh" 
			    placeholder="请输入编号" />
			</uni-forms-item>
			<uni-forms-item label="工程名称" name="gcmc">
			    <uni-easyinput type="text" v-model="sj10Data.gcmc" 
			    placeholder="请输入工程名称" />
			</uni-forms-item>
			<uni-forms-item label="施工时间" name="sgsj">
			    <uni-easyinput type="date" v-model="sj10Data.sgsj" 
			    placeholder="请选择施工时间" />
			</uni-forms-item>
			<uni-forms-item label="工程部位" name="gcbw">
			    <uni-easyinput type="text" v-model="sj10Data.gcbw" 
			    placeholder="请输入工程部位" />
			</uni-forms-item>
			<uni-forms-item label="网的长度设计值" name="wdcdsjz">
			    <uni-easyinput type="number" v-model="sj10Data.wdcdsjz" 
			    placeholder="请输入网的长度设计值" />
			</uni-forms-item>
			<uni-forms-item label="网的长度检验结果" name="wdcdjyjg">
			    <uni-easyinput type="text" v-model="sj10Data.wdcdjyjg" 
			    placeholder="请输入网的长度检验结果" />
			</uni-forms-item>
			<uni-forms-item label="网的宽度设计值" name="wdkdsjz">
			    <uni-easyinput type="number" v-model="sj10Data.wdkdsjz" 
			    placeholder="请输入网的宽度设计值" />
			</uni-forms-item>
			<uni-forms-item label="网的宽度检验结果" name="wdkdjyjg">
			    <uni-easyinput type="text" v-model="sj10Data.wdkdjyjg" 
			    placeholder="请输入网的宽度检验结果" />
			</uni-forms-item>
			<uni-forms-item label="铺设表土厚度设计值" name="psbthd">
			    <uni-easyinput type="number" v-model="sj10Data.psbthd" 
			    placeholder="请输入铺设表土厚度设计值" />
			</uni-forms-item>
			<uni-forms-item label="铺设表土厚度检验结果" name="psbthdjyjg">
			    <uni-easyinput type="text" v-model="sj10Data.psbthdjyjg" 
			    placeholder="请输入铺设表土厚度检验结果" />
			</uni-forms-item>
			<uni-forms-item label="铺设表土PH" name="psbtph">
			    <uni-easyinput type="text" v-model="sj10Data.psbtph" 
			    placeholder="请输入铺设表土PH" />
			</uni-forms-item>
			<uni-forms-item label="草籽喷种量" name="czpzl">
			    <uni-easyinput type="text" v-model="sj10Data.czpzl" 
			    placeholder="请输入草籽喷种量" />
			</uni-forms-item>
			<uni-forms-item label="草成活率" name="cchl">
			    <uni-easyinput type="text" v-model="sj10Data.cchl" 
			    placeholder="请输入草成活率" />
			</uni-forms-item>
			<uni-forms-item label="草高" name="cg">
			    <uni-easyinput type="text" v-model="sj10Data.cg" 
			    placeholder="请输入草高" />
			</uni-forms-item>
			<uni-forms-item label="网横向搭接长度" name="whxtjcd">
			    <uni-easyinput type="text" v-model="sj10Data.whxtjcd" 
			    placeholder="请输入网横向搭接长度" />
			</uni-forms-item>
			<uni-forms-item label="网纵向搭接长度" name="wzxdjcd">
			    <uni-easyinput type="text" v-model="sj10Data.wzxdjcd" 
			    placeholder="请输入网纵向搭接长度" />
			</uni-forms-item>
			<uni-forms-item label="U型钉或J型钉" name="uhjxd">
			    <uni-easyinput type="text" v-model="sj10Data.uhjxd" 
			    placeholder="请输入U型钉或J型钉" />
			</uni-forms-item>
			<uni-forms-item label="外观检查（支撑情况等）" name="wgjc">
			    <uni-easyinput type="text" v-model="sj10Data.wgjc" 
			    placeholder="请输入外观检查（支撑情况等）" />
			</uni-forms-item>

			<hr />
			<uni-forms-item label="创建日期" name="createdate">
				<!-- <uni-easyinput type="text" v-model="sj10Data.createdate" 
				placeholder="请输入创建日期" /> -->
				<uni-datetime-picker
								type="datetime"
								v-model="sj10Data.createdate"
								@change="changeLog"
							/>
			</uni-forms-item>
		</uni-forms>
		
		<button @click="addSj10">提交</button>
	</view>
</template>

<script>
	import { addSj10 } from '@/api/system/sj10';
	export default {
		// data() {
		// 	return {
		// 		sj10Data: {
		// 			name: '',
		// 			wendu: '',
		// 			shidu: '',
		// 			createdate: ''
		// 		},
		// 		rules: {}
		// 	}
		// },
		data() {
		    return {
		        sj10Data: {
		            sgdw: '',           // 施工单位
		            hth: '',            // 合同号
		            jldw: '',           // 监理单位
		            bh: '',             // 编号
		            gcmc: '',           // 工程名称
		            sgsj: '',           // 施工时间
		            gcbw: '',           // 工程部位
		            wdcdsjz: null,      // 网的长度设计值
		            wdcdjyjg: '',       // 网的长度检验结果
		            wdkdsjz: null,      // 网的宽度设计值
		            wdkdjyjg: '',       // 网的宽度检验结果
		            psbthd: null,       // 铺设表土厚度设计值
		            psbthdjyjg: '',      // 铺设表土厚度检验结果
		            psbtph: '',         // 铺设表土PH
		            czpzl: '',          // 草籽喷种量
		            cchl: '',           // 草成活率
		            cg: '',             // 草高
		            whxtjcd: '',        // 网横向搭接长度
		            wzxdjcd: '',        // 网纵向搭接长度
		            uhjxd: '',          // U型钉或J型钉
		            wgjc: ''            ,// 外观检查（支撑情况等）
		        },
		        rules: {}
		    }
		},
		methods: {
			change(e) {
							this.single = e;
							console.log("-change事件:", e);
						},
			addSj10 () {
				addSj10(this.sj10Data).then(res => {
					console.log(555);
					console.log(res);
					this.$modal.msgSuccess("添加成功！");
				})
				// console.log(this.userData);
				// const req = uni.request({
				// 	url: "/api/user/addUser",
				// 	data: JSON.stringify(this.userData),
				// 	method: "post",
				// 	header: { "Content-Type": "application/json" },
				// 	success: res => {
				// 		console.log(123);
				// 		console.log(res);
				// 	}
				// })
			}
		}
	}
</script>

<style>
	.uni-forms-item {
		margin-left: 10px;
		margin-right: 10px;
	}
</style>