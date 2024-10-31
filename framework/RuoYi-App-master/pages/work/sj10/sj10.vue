<template>
	<view>
		<view class="title">
			Sj10列表
			<navigator url="addSj10" hover-class="navigator-hover">
				<button type="default" class="userbtn">添加Sj10数据</button>
			</navigator>
		</view><!-- view 相当于div-->

		<hr>
		<!-- <uni-list-chat v-for="item in sj10List" 
		    :avatar-circle="true" :title="item.name"
			avatar="" 
			:note="'温度:'+item.wendu+' 湿度：'+item.shidu"
			:time="item.createdate"></uni-list-chat>
		<hr> -->
		<!-- <uni-list-chat v-for="item in sj10List" :avatar-circle="true" :title="item.sgdw" avatar=""
			:note="'施工单位: ' + item.sgdw + ' 合同号: ' + item.hth "
			:time="item.sgsj ? item.sgsj : item.createdate">
		</uni-list-chat> -->
		<uni-list-chat v-for="item in sj10List" :avatar-circle="true" :title="item.gcmc" avatar="" :note="'施工单位: ' + item.sgdw + 
		           ' 合同号: ' + item.hth + 
		           ' 监理单位: ' + item.jldw + 
		           ' 编号: ' + item.bh + 
		           ' 施工时间: ' + (item.sgsj ? item.sgsj : item.createdate) + 
		           ' 工程部位: ' + item.gcbw + 
		           ' 网的长度设计值: ' + item.wdcdsjz + 
		           ' 网的长度检验结果: ' + item.wdcdjyjg + 
		           ' 网的宽度设计值: ' + item.wdkdsjz + 
		           ' 网的宽度检验结果: ' + item.wdkdjyjg + 
		           ' 铺设表土厚度设计值: ' + item.psbthd + 
		           ' 铺设表土厚度检验结果: ' + item.psbthdjyjg + 
		           ' 铺设表土PH: ' + item.psbtph + 
		           ' 草籽喷种量: ' + item.czpzl + 
		           ' 草成活率: ' + item.cchl + 
		           ' 草高: ' + item.cg + 
		           ' 网横向搭接长度: ' + item.whxtjcd + 
		           ' 网纵向搭接长度: ' + item.wzxdjcd + 
		           ' U型钉或J型钉: ' + item.uhjxd + 
		           ' 外观检查: ' + item.wgjc" :time="item.sgsj ? item.sgsj : item.createdate">
		</uni-list-chat>
		<hr>
	</view>
</template>

<script>
	import {
		getSj10s
	} from '@/api/system/sj10';
	export default {
		// data() {
		// 	return {
		// 		sj10List: [{
		// 			id: 1,
		// 			name: "天津Sj10",
		// 			shidu: "12%",
		// 			wendu: "23",
		// 			createdate: '2024-10-30 15:17:13'
		// 		}]
		// 	}
		// },
		data() {
		    return {
		        sj10List: [{
		            id: 1,
		            sgdw: "天津施工单位", // 施工单位
		            hth: "合同001",       // 合同号
		            jldw: "监理单位A",     // 监理单位
		            bh: "编号001",        // 编号
		            gcmc: "天津工程",      // 工程名称
		            sgsj: '2024-10-30',   // 施工时间（只保留日期）
		            gcbw: "工程部位A",     // 工程部位
		            wdcdsjz: 100.0,       // 网的长度设计值
		            wdcdjyjg: "合格",      // 网的长度检验结果
		            wdkdsjz: 50.0,        // 网的宽度设计值
		            wdkdjyjg: "合格",      // 网的宽度检验结果
		            psbthd: 20.0,         // 铺设表土厚度设计值
		            psbthdjyjg: "合格",    // 铺设表土厚度检验结果
		            psbtph: "6.5",        // 铺设表土PH
		            czpzl: "5kg",         // 草籽喷种量
		            cchl: "90%",          // 草成活率
		            cg: "30cm",           // 草高
		            whxtjcd: "2m",        // 网横向搭接长度
		            wzxdjcd: "3m",        // 网纵向搭接长度
		            uhjxd: "U型钉",       // U型钉或J型钉
		            wgjc: "合格"          // 外观检查（支撑情况等）
		        }]
		    }
		},

		onLoad() {
			this.getTrs(1);
		},
		onPullDownRefresh() {
			console.log("向下拉一下");
			// this.getSj10s(1); // 更新第一页
			// // 定时器，2000毫秒调用里面的事件
			// setTimeout(function() {
			// 	uni.stopPullDownRefresh();// 关闭刷新
			// }, 2000)
		},
		// 触底时候调用该事件
		onReachBottom() {
			console.log("已经触底了");
			// const request =  uni.request({
			// 	url: "/api/user/getUsers",
			// 	data: {
			// 		pageIndex: 2,
			// 		pageSize: 15
			// 	},
			// 	method: "get",
			// 	success: res => {
			// 		console.log(res.data.data);
			// 		this.userList=[...this.userList, ...res.data.data];
			// 	}
			// })
		},
		methods: {
			getTrs(page) {
				getSj10s(1, 20).then(res => {
					console.log(44);
					console.log(res);
					this.sj10List = res.data.list;
				})
				// const request = uni.request({
				// 	url: "/api/user/getUsers",
				// 	data: {
				// 		pageIndex: page,
				// 		pageSize: 15
				// 	},
				// 	method: "get",
				// 	success: res => {
				// 		console.log(res.data);
				// 		this.userList = res.data.data
				// 	}
				// })
				// console.log(request);
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