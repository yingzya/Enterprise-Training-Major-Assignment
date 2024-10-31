<template>
	<view class="work-container">

		<!-- 宫格组件 -->
		<uni-section title="数据录入" type="line"></uni-section>
		<view class="grid-body">
			<uni-grid :column="4" :showBorder="false">
				<uni-grid-item>
					<view class="grid-item-box" @click="changeInputGrid">
						<uni-icons type="person-filled" size="30"></uni-icons>
						<text class="text">硬化后水泥混凝土性能试验检测报告</text>
					</view>
				</uni-grid-item>

				<uni-grid-item>
					<view class="grid-item-box" @click="toTurang">
						<uni-icons type="person-filled" size="30"></uni-icons>
						<text class="text">土壤数据</text>
					</view>
				</uni-grid-item>

				<uni-grid-item>
					<view class="grid-item-box" @click="toSj10">
						<uni-icons type="person-filled" size="30"></uni-icons>
						<text class="text">Sj10数据</text>
					</view>
				</uni-grid-item>
			</uni-grid>
		</view>

		<!-- 宫格组件 -->
		<uni-section title="数据查询" type="line"></uni-section>
		<view class="grid-body">
			<uni-grid :column="4" :showBorder="false" @change="changeQueryGrid">
				<uni-grid-item>
					<view class="grid-item-box">
						<uni-icons type="person-filled" size="30"></uni-icons>
						<text class="text">硬化后水泥混凝土性能试验检测报告</text>
					</view>
				</uni-grid-item>
			</uni-grid>
		</view>
	</view>
</template>

<script>
	export default {
		data() {
			return {
				current: 0,
				swiperDotIndex: 0,
				data: [{
						image: '/static/images/banner/banner01.jpg'
					},
					{
						image: '/static/images/banner/banner02.jpg'
					},
					{
						image: '/static/images/banner/banner03.jpg'
					}
				]
			}
		},
		methods: {
			clickBannerItem(item) {
				console.info(item)
			},
			changeSwiper(e) {
				this.current = e.detail.current
			},
			changeGrid(e) {
				this.$modal.showToast('模块建设中~')
			},
			changeInputGrid(e) {
				console.log(e.detail.index)
				// debugger
				//if (0 == e.detail.index) {
				this.$tab.navigateTo('/pages/business/demo/test_report_cb09/index')
				//}
			},
			changeQueryGrid(e) {
				console.log(e.detail.index)
				// debugger
				if (0 == e.detail.index) {
					this.$tab.navigateTo('/pages/business/demo/test_report_cb09/query')
				}
			},
			toTurang(e) {
				console.log(1111)

				this.$tab.navigateTo('/pages/work/turang/turang')

			},
			toSj10(e) {
				console.log(1111)

				this.$tab.navigateTo('/pages/work/sj10/sj10')

			}
		}
	}
</script>

<style lang="scss">
	/* #ifndef APP-NVUE */
	page {
		display: flex;
		flex-direction: column;
		box-sizing: border-box;
		background-color: #fff;
		min-height: 100%;
		height: auto;
	}

	view {
		font-size: 14px;
		line-height: inherit;
	}

	/* #endif */

	.text {
		text-align: center;
		font-size: 26rpx;
		margin-top: 10rpx;
	}

	.grid-item-box {
		flex: 1;
		/* #ifndef APP-NVUE */
		display: flex;
		/* #endif */
		flex-direction: column;
		align-items: center;
		justify-content: center;
		padding: 15px 0;
	}

	.uni-margin-wrap {
		width: 690rpx;
		width: 100%;
		;
	}

	.swiper {
		height: 300rpx;
	}

	.swiper-box {
		height: 150px;
	}

	.swiper-item {
		/* #ifndef APP-NVUE */
		display: flex;
		/* #endif */
		flex-direction: column;
		justify-content: center;
		align-items: center;
		color: #fff;
		height: 300rpx;
		line-height: 300rpx;
	}

	@media screen and (min-width: 500px) {
		.uni-swiper-dot-box {
			width: 400px;
			/* #ifndef APP-NVUE */
			margin: 0 auto;
			/* #endif */
			margin-top: 8px;
		}

		.image {
			width: 100%;
		}
	}
</style>