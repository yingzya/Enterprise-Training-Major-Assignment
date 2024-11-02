package com.ruoyi.system.service.impl;
import com.github.pagehelper.PageInfo;
import com.ruoyi.common.core.domain.Sj10;
import com.ruoyi.common.utils.PageUtils;
import com.ruoyi.system.mapper.Sj10Mapper;
import com.ruoyi.system.service.Sj10Service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Sj10
 *
 */
@Service
public class Sj10ServiceImpl implements Sj10Service {
    private static final Logger log = LoggerFactory.getLogger(Sj10ServiceImpl.class);

    @Autowired
    private Sj10Mapper sj10Mapper;

    /**
     * 根据条件分页查询土壤数据列表
     *
     * @param sj10 土壤数据信息
     * @return 土壤数据信息集合信息
     */
    @Override
    public PageInfo<Sj10> selectSj10List(Sj10 sj10, Integer pageNum,
                                             Integer pageSize){
        // 使用分页插件pagehelper 进行分页
        PageUtils.startPage();
        return new PageInfo<>(sj10Mapper.selectSj10List(sj10));
    }

    /**
     * 通过土壤数据ID查询土壤数据
     *
     * @param id 土壤数据ID
     * @return 土壤数据对象信息
     */
    @Override
    public Sj10 selectSj10ById(Long id) {
        return sj10Mapper.selectSj10ById(id);
    }

    /**
     * 新增保存土壤数据信息
     *
     * @param sj10 土壤数据信息
     * @return 结果
     */
    @Override
    @Transactional
    public int insertSj10(Sj10 sj10){
        // 新增土壤数据信息
        int rows = sj10Mapper.insertSj10(sj10);
        return rows;
    }

    /**
     * 修改保存土壤数据信息
     *
     * @param sj10 土壤数据信息
     * @return 结果
     */
    @Override
    @Transactional
    public int updateSj10(Sj10 sj10) {
        return sj10Mapper.updateSj10(sj10);
    }

    /**
     * 通过土壤数据ID删除土壤数据
     *
     * @param id 土壤数据ID
     * @return 结果
     */
    @Override
    @Transactional
    public int deleteSj10ById(Long id){
        return sj10Mapper.deleteSj10ById(id);
    }

    /**
     * 批量删除土壤数据信息
     *
     * @param ids 需要删除的土壤数据ID
     * @return 结果
     */
    @Override
    @Transactional
    public int deleteSj10ByIds(Long[] ids) {
        return sj10Mapper.deleteSj10ByIds(ids);
    }

}
