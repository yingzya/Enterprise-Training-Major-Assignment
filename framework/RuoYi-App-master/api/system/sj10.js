import upload from '@/utils/upload'
import request from '@/utils/request'

// 列表查询
export function getSj10s(pageNum, pageSize) {
  const data = {
    pageNum,
    pageSize
  }
  return request({
    url: '/getSj10s',
    method: 'get',
    params: data
  })
}

// 添加数据
export function addSj10(data) {
  return request({
    url: '/addSj10',
    method: 'post',
	data: data
  })
}
