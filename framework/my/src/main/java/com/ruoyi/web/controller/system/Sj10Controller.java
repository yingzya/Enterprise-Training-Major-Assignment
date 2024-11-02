package com.ruoyi.web.controller.system;

import com.ruoyi.common.core.domain.AjaxResult;
import com.ruoyi.common.core.domain.Sj10;
import com.ruoyi.system.service.Sj10Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

/**
 * 控制层
 */
@RestController
public class Sj10Controller
{
    @Autowired
    private Sj10Service sj10Service;

    /**
     *  分页查询
     */
    @GetMapping("/getSj10s")
    public AjaxResult getSj10s(Sj10 sj10, Integer pageNum,
                                 Integer pageSize)
    {   // AjaxResult 诺依包装返回指定数据格式给前端的处理类
        AjaxResult ajax = AjaxResult.success(
                sj10Service.selectSj10List(sj10, pageNum, pageSize));
        ajax.put("code", 0);
        ajax.put("msg", "查询成功");
        return ajax;
    }
    /**
     * 单个查询
     */
    @GetMapping("/getSj10/{id}")
    public AjaxResult getSj10(@PathVariable("id") Long id)
    {
        AjaxResult ajax = AjaxResult.success(
                sj10Service.selectSj10ById(id)
        );
        ajax.put("code",0);
        ajax.put("msg","查询成功");
        return ajax;
    }
    /**
     *  添加
     */
    @PostMapping("/addSj10")
    public AjaxResult addSj10(@RequestBody Sj10 sj10)
    {   // AjaxResult 诺依包装返回指定数据格式给前端的处理类
        AjaxResult ajax = AjaxResult.success(sj10Service.insertSj10(sj10));
        ajax.put("code", 0);
        ajax.put("msg", "插入成功");
        return ajax;
    }

    /**
     *  修改
     */
    @PutMapping("/editSj10")
    public AjaxResult editSj10(@RequestBody Sj10 sj10)
    {   // AjaxResult 诺依包装返回指定数据格式给前端的处理类
        AjaxResult ajax = AjaxResult.success(sj10Service.updateSj10(sj10));
        ajax.put("code", 0);
        ajax.put("msg", "修改成功");
        return ajax;
    }

    /**
     *  删除
     */
    @DeleteMapping("/deleteSj10/{id}")
    public AjaxResult deleteSj10(@PathVariable("id") Long id)
    {   // AjaxResult 诺依包装返回指定数据格式给前端的处理类
        AjaxResult ajax = AjaxResult.success(sj10Service.deleteSj10ById(id));
        ajax.put("code", 0);
        ajax.put("msg", "删除成功");
        return ajax;
    }


}
