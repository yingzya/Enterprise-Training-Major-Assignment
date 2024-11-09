<template>
	<view>
		<view class="title">
			Sj10列表
			<!-- <navigator url="addSj10" hover-class="navigator-hover">
				<button type="default" class="userbtn">添加Sj10数据</button>
			</navigator> -->
			
				<navigator url="addSj10" hover-class="navigator-hover" style=" margin-bottom: 10px;">
					<button type="default" class="userbtn">添加表单数据</button>
				</navigator>
		</view><!-- view 相当于div-->

		<!-- 		<hr> -->

		<view v-for="item in sj10List"
			style="margin-top: 10px;display: flex;background-color: #FFFAE8;margin: 18rpx;border-radius: 10rpx;">
			<view style="width: 70%;margin-left: 30rpx;">
				<view>编号:{{item.bh}}</view>
				<view>施工单位:{{item.sgdw}}</view>
				<view>监理单位:{{item.jldw}}</view>
				<view>合同号:{{item.hth}}</view>
			</view>
			<view
				style="width: 25%;display: flex; flex-direction: column; justify-content: flex-end;margin-left: 40px;margin-bottom: 30rpx;margin-right: 15rpx;">
				<button type="primary" size="mini" @click="see(item.id)">查看详情</button>
			</view>
		</view>
		
		<!-- <view class="bottom">
			<navigator url="addSj10" hover-class="navigator-hover">
				<button type="default" class="userbtn">添加表单数据</button>
			</navigator>
		</view> -->

	</view>
</template>

<script>
	import {
		getSj10s
	} from '@/api/system/sj10';
	export default {
		data() {
			return {
				sj10List: [{
					id: 1,
					sgdw: "天津施工单位", // 施工单位
					hth: "合同001", // 合同号
					jldw: "监理单位A", // 监理单位
					bh: "编号001", // 编号
					gcmc: "天津工程", // 工程名称
					sgsj: '2024-10-30', // 施工时间（只保留日期）
					gcbw: "工程部位A", // 工程部位
					wdcdsjz: 100.0, // 网的长度设计值
					wdcdjyjg: "合格", // 网的长度检验结果
					wdkdsjz: 50.0, // 网的宽度设计值
					wdkdjyjg: "合格", // 网的宽度检验结果
					psbthd: 20.0, // 铺设表土厚度设计值
					psbthdjyjg: "合格", // 铺设表土厚度检验结果
					psbtph: "6.5", // 铺设表土PH
					czpzl: "5kg", // 草籽喷种量
					cchl: "90%", // 草成活率
					cg: "30cm", // 草高
					whxtjcd: "2m", // 网横向搭接长度
					wzxdjcd: "3m", // 网纵向搭接长度
					uhjxd: "U型钉", // U型钉或J型钉
					wgjc: "合格" // 外观检查（支撑情况等）
				}]
			}
		},

		onLoad() {
			this.getTrs(1);
		},
		onPullDownRefresh() {
			console.log("向下拉一下");
		},
		// 触底时候调用该事件
		onReachBottom() {
			console.log("已经触底了");
		},
		methods: {
			getTrs(page) {
				getSj10s(1, 20).then(res => {
					console.log(44);
					console.log(res);
					this.sj10List = res.data.list;
				})
			},
			see(id) {
				console.log(id);
				uni.navigateTo({
					url: '/pages/work/sj10/item?id=' + id,
				})
			}
		}
	}
</script>

<style>
	.title {
		font-size: 20px;
		margin: 0px;
		color: green;
		width: 100%;
		padding-left: 3px;
		padding-top: 8px;
		padding-bottom: 15px;
		padding-right: 8px;
	}

	.userbtn {
		width: 100px;
		font-size: 12px;
		background-color: aqua;
	}

	uni-navigator {
		display: inline-block;
		float: right;
		margin-right: 8px;
	}
</style>