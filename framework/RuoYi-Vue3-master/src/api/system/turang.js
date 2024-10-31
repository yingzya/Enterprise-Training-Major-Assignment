import request from '@/utils/request'
import { parseStrEmpty } from "@/utils/ruoyi";

// 查询土壤数据列表
export function getTurangs(query) {
  return request({
    url: '/getTurangs',
    method: 'get',
    params: query
  })
}

// 查询土壤数据详细
export function getTurang(id) {
  return request({
    url: '/getTurang/' + parseStrEmpty(id),
    method: 'get'
  })
}

// 新增土壤数据
export function addTurang(data) {
  return request({
    url: '/addTurang',
    method: 'post',
    data: data
  })
}

// 修改土壤数据
export function editTurang(data) {
  return request({
    url: '/editTurang',
    method: 'put',
    data: data
  })
}

// 删除土壤数据
export function deleteTurang(id) {
  return request({
    url: '/deleteTurang/' + id,
    method: 'delete'
  })
}

// 土壤数据头像上传
export function uploadAvatar(data) {
  return request({
    url: '//profile/avatar',
    method: 'post',
    headers: { 'Content-Type': 'application/x-www-form-urlencoded' },
    data: data
  })
}