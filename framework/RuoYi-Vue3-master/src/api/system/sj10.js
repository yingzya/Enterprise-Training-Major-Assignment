import request from '@/utils/request'
import { parseStrEmpty } from "@/utils/ruoyi";


// //显示表格
// export function getSj10(id){
// 	return request({
// 		url:'getDetail'  ,
// 		method:'post',
// 		data:data
// 	})
// }
// 查询Sj10数据列表
export function getSj10s(query) {
  return request({
    url: '/getSj10s',
    method: 'get',
    params: query
  })
}

// 查询Sj10数据详细
export function getSj10(id) {
  return request({
    url: '/getSj10/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增Sj10数据
export function addSj10(data) {
  return request({
    url: '/addSj10',
    method: 'post',
    data: data
  })
}

// 修改Sj10数据
export function editSj10(data) {
  return request({
    url: '/editSj10',
    method: 'put',
    data: data
  })
}

// 删除Sj10数据
export function deleteSj10(id) {
  return request({
    url: '/deleteSj10/' + id,
    method: 'delete'
  })
}

export function exportExcel(data){
	return request({
		url:'/exoprt',
		method:'post',
	})
}

// Sj10数据头像上传
export function uploadAvatar(data) {
  return request({
    url: '//profile/avatar',
    method: 'post',
    headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
    data: data
  })
}