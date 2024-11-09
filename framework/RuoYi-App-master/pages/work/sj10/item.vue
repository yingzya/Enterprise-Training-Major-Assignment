<template>
	<view style="margin-left: 15px;">
		<view class="example">
			<uni-forms ref="form" :model="sj10Data" labelWidth="100px" style="color:black">
				<!-- <uni-forms-item label="ID" name="id">
					<span style="color: red; font-size: 26px;">{{sj10Data.id}}</span>
				</uni-forms-item> -->
				<uni-forms-item label="施工单位" name="sgdw" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.sgdw" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="合同号" name="hth" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.hth" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="监理单位" name="jldw" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.jldw" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="编号" name="bh" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.bh" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="工程名称" name="gcmc" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.gcmc" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="操作时间" name="time" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.time" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="施工时间" name="sgsj" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.sgsj" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="工程部位" name="gcbw" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.gcbw" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="网的长度设计值" name="wdcdsjz" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.wdcdsjz" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="网的长度检验结果" name="wdcdjyjg" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.wdcdjyjg" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="网的宽度设计值" name="wdkdsjz" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.wdkdsjz" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="网的宽度检验结果" name="wdkdjyjg" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.wdkdjyjg" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="铺设表土厚度设计值" name="psbthd" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.psbthd" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="铺设表土厚度检验结果" name="psbthdjyjg" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.psbthdjyjg" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="铺设表土PH" name="psbtph" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.psbtph" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="草籽喷种量" name="czpzl" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.czpzl" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="草成活率" name="cchl" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.cchl" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="草高" name="cg" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.cg" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="网横向搭接长度" name="whxtjcd" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.whxtjcd" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="网纵向搭接长度" name="wzxdjcd" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.wzxdjcd" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="U型钉或J型钉" name="uhjxd" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.uhjxd" placeholder="" disabled/>
				</uni-forms-item>
				<uni-forms-item label="外观检查" name="wgjc" style="margin-right: 30rpx;">
					<uni-easyinput v-model="sj10Data.wgjc" placeholder="" disabled/>
				</uni-forms-item>
			</uni-forms>
			<view style="display: flex;justify-content: center;align-items: center;">
				<view style="width: 40%;"><button type="primary" @click="goBack">返回</button></view>
			</view>
		</view>
	</view>
</template>

<script>
	import {
		getSJ10
	} from '@/api/system/sj10'

	export default {
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
				    wgjc: '' ,			// 外观检查（支撑情况等）
					time: ''
				},
			}
		},
		onLoad(option) {
			console.log(option)
			this.reset()
			const id = option.id;
			getSJ10(id).then(response => {
				this.sj10Data = response.data;
				// console.log(this.sj10Data)	
			});
		},
		methods: {
			change(e) {
				this.single = e
				console.log('-change事件:', e);
			},
			/** 重置操作表单 */
			reset() {
				this.sj10Data = {
					id: undefined,
					sgdw: undefined,
					hth: undefined,
					jldw: undefined,
					bh: undefined,
					gcmc: undefined,
					time: undefined,
					sgsj: undefined,
					gcbw: undefined,
					wdcdsjz: undefined,
					wdcdjyjg: undefined,
					wdkdsjz: undefined,
					wdkdjyjg: undefined,
					psbthd: undefined,
					psbthdjyjg: undefined,
					psbtph: undefined,
					czpzl: undefined,
					cchl: undefined,
					cg: undefined,
					whxtjcd: undefined,
					wzxdjcd: undefined,
					uhjxd: undefined,
					wgjc: undefined
				};
			},
			goBack() {
				uni.navigateBack();
			}
		}
	}
</script>

<style lang="scss">
	page {
		background-color: #ff
