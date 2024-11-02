package com.ruoyi.common.core.domain;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.Date;
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Sj10 extends BaseEntity{
    private int id;//序号
    private String sgdw;//施工单位
    private String hth;//合同号
    private String jldw;//监理单位
    private String bh;//编号
    private String gcmc;//工程名称
    @JsonFormat(pattern = "yyyy-MM-dd")
    private Date sgsj;//施工时间
    private String gcbw;//工程部位
    private float wdcdsjz;//网的长度设计值
    private String wdcdjyjg;//网的长度检验结果
    private float wdkdsjz;//网的宽度设计值
    private String wdkdjyjg;//网的宽度检验结果
    private float psbthd;//铺设表土厚度设计值
    private String psbthdjyjg;//铺设表土厚度检验结果
    private String psbtph;//铺设表土PH
    private String czpzl;//草籽喷种量
    private String cchl;//草成活率
    private String cg;//草高
    private String whxtjcd;//网横向搭接长度
    private String wzxdjcd;//网纵向搭接长度
    private String uhjxd;//U型钉或J型钉
    private String wgjc;//外观检查（支撑情况等）

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getSgdw() {
        return sgdw;
    }

    public void setSgdw(String sgdw) {
        this.sgdw = sgdw;
    }

    public String getHth() {
        return hth;
    }

    public void setHth(String hth) {
        this.hth = hth;
    }

    public String getJldw() {
        return jldw;
    }

    public void setJldw(String jldw) {
        this.jldw = jldw;
    }

    public String getBh() {
        return bh;
    }

    public void setBh(String bh) {
        this.bh = bh;
    }

    public String getGcmc() {
        return gcmc;
    }

    public void setGcmc(String gcmc) {
        this.gcmc = gcmc;
    }

    public Date getSgsj() {
        return sgsj;
    }

    public void setSgsj(Date sgsj) {
        this.sgsj = sgsj;
    }

    public String getGcbw() {
        return gcbw;
    }

    public void setGcbw(String gcbw) {
        this.gcbw = gcbw;
    }

    public float getWdcdsjz() {
        return wdcdsjz;
    }

    public void setWdcdsjz(float wdcdsjz) {
        this.wdcdsjz = wdcdsjz;
    }

    public String getWdcdjyjg() {
        return wdcdjyjg;
    }

    public void setWdcdjyjg(String wdcdjyjg) {
        this.wdcdjyjg = wdcdjyjg;
    }

    public float getWdkdsjz() {return wdkdsjz;}

    public void setWdkdsjz(float wdkdsjz) {
        this.wdkdsjz = wdkdsjz;
    }

    public String getWdkdjyjg() {
        return wdkdjyjg;
    }

    public void setWdkdjyjg(String wdkdjyjg) {
        this.wdkdjyjg = wdkdjyjg;
    }

    public float getPsbthd() {
        return psbthd;
    }

    public void setPsbthd(float psbthd) {
        this.psbthd = psbthd;
    }

    public String getPsbthdjyjg() {
        return psbthdjyjg;
    }

    public void setPsbthdjyjg(String psbthdjyjg) {
        this.psbthdjyjg = psbthdjyjg;
    }

    public String getPsbtph() {
        return psbtph;
    }

    public void setPsbtph(String psbtph) {
        this.psbtph = psbtph;
    }

    public String getCzpzl() {
        return czpzl;
    }

    public void setCzpzl(String czpzl) {
        this.czpzl = czpzl;
    }

    public String getCchl() {
        return cchl;
    }

    public void setCchl(String cchl) {
        this.cchl = cchl;
    }

    public String getCg() {
        return cg;
    }

    public void setCg(String cg) {
        this.cg = cg;
    }

    public String getWhxtjcd() {
        return whxtjcd;
    }

    public void setWhxtjcd(String whxtjcd) {
        this.whxtjcd = whxtjcd;
    }

    public String getWzxdjcd() {
        return wzxdjcd;
    }

    public void setWzxdjcd(String wzxdjcd) {
        this.wzxdjcd = wzxdjcd;
    }

    public String getUhjxd() {
        return uhjxd;
    }

    public void setUhjxd(String uhjxd) {
        this.uhjxd = uhjxd;
    }

    public String getWgjc() {
        return wgjc;
    }

    public void setWgjc(String wgjc) {
        this.wgjc = wgjc;
    }
}
