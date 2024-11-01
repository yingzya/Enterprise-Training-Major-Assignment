<template>
  <div>
    <h2>三维网客土喷播草种现场检查记录表</h2>
    <table>
      <tr>
        <td colspan="6">记录表SJ10</td>
      </tr>
      <tr>
        <td colspan="1.5">施工单位：</td>
        <td colspan="1.5">{{ form.sgdw }}</td>
		<td colspan="1.5">合同号：</td>
		<td colspan="3">{{ form.hth }}</td>
      </tr>
      <tr>
        <td colspan="1.5">监理单位：</td>
        <td colspan="1.5">{{ form.jldw }}</td>
		<td colspan="1.5">编号：</td>
		<td colspan="3">{{ form.hth }}</td>
      </tr>
      <tr>
        <td colspan="1.5">工程名称：</td>
        <td colspan="1.5">{{ form.gcmc }}</td>
		<td colspan="1.5">施工时间：</td>
		<td colspan="3">{{ form.sgsj }}</td>
      </tr>
      <tr>
        <td colspan="2">工程部位（桩号、墩台号、孔号）：</td>
        <td colspan="4">{{ form.gcbzw }}</td>
      </tr>
   <!--   <tr>
        <td colspan="2">施工时间：</td>
        <td colspan="4">{{ form.sgsj }}</td>
      </tr> -->
      <tr>
        <td>项次</td>
        <td>检验项目</td>
        <td>规定值或允许偏差</td>
        <td>检验结果</td>
        <td>检查方法和频率</td>
      </tr>
      <tr>
        <td>1</td>
        <td>网的长度（cm）</td>
        <td>允许偏差：±10</td>
        <td>{{ form.wcd_chck }}</td>
        <td>每200m检查4处</td>
      </tr>
      <tr>
        <td>2</td>
        <td>网的长度（cm）</td>
        <td>设计值：</td>
        <td>{{ form.wcd_dz }}</td>
        <td>每200m检查4处</td>
      </tr>
      <tr>
        <td>3</td>
        <td>网的宽度(cm)</td>
        <td>设计值：</td>
        <td>{{ form.wcd_kd }}</td>
        <td>每200m检查4处</td>
      </tr>
      <tr>
        <td>4</td>
        <td>网的宽度(cm)</td>
        <td>允许偏差：±10</td>
        <td>{{ form.wcd_kd_chck }}</td>
        <td>每200m检查4处</td>
      </tr>
      <tr>
        <td>5</td>
        <td>铺设表土厚度(cm)</td>
        <td>设计值：</td>
        <td>{{ form.ptdt_dz }}</td>
        <td>每1000m²检查8处</td>
      </tr>
      <tr>
        <td>6</td>
        <td>铺设表土厚度(cm)</td>
        <td>允许偏差：±2</td>
        <td>{{ form.ptdt_chck }}</td>
        <td>每1000m²检查8处</td>
      </tr>
      <tr>
        <td>7</td>
        <td>铺设表土的PH值</td>
        <td>6～8</td>
        <td>{{ form.ptdt_ph }}</td>
        <td>每1000m²检查4处</td>
      </tr>
      <tr>
        <td>8</td>
        <td>草籽喷种量(g/m²)</td>
        <td>符合设计要求</td>
        <td>{{ form.caozzl }}</td>
        <td>每1000m²检查8处</td>
      </tr>
      <tr>
        <td>9</td>
        <td>草成活率(%)</td>
        <td>≥90</td>
        <td>{{ form.caochl }}</td>
        <td>每1000m²检查8处</td>
      </tr>
      <tr>
        <td>10</td>
        <td>草高(cm)</td>
        <td>≥10</td>
        <td>{{ form.caogh }}</td>
        <td>每1000m²检查8处</td>
      </tr>
      <tr>
        <td>11</td>
        <td>网横向搭接长度(cm)</td>
        <td>≥10</td>
        <td>{{ form.whdl }}</td>
        <td>每200m检查4处</td>
      </tr>
      <tr>
        <td>12</td>
        <td>网纵向搭接长度(cm)</td>
        <td>≥15</td>
        <td>{{ form.wdzl }}</td>
        <td>每200m检查4处</td>
      </tr>
      <tr>
        <td>13</td>
        <td>U型钉或J型钉(根/m²)</td>
        <td>符合设计要求</td>
        <td>{{ form.udjdx }}</td>
        <td>每1000m²检查8处</td>
      </tr>
      <tr>
        <td>外观检查（支撑情况等）</td>
        <td>U型钉或J型钉(根/m²)</td>
        <td>符合设计要求</td>
        <td>{{ form.wdj }}</td>
        <td>每1000m²检查8处</td>
      </tr>
      <tr>
        <td colspan="6">施工员：{{ form.sgry }}  专业工程师：{{ form.zgy }}</td>
      </tr>
    </table>
  </div>
</template>

<script>
import { getSj10, editSj10, addSj10 } from "@/api/system/sj10";

export default {
  data() {
    return {
      form: {
        id: undefined,
        sgdw: "",
        jldw: "",
        gcmc: "",
        sgsj: "",
        gcbzw: "",
        wcd_chck: "",
        wcd_dz: "",
        wcd_kd: "",
        wcd_kd_chck: "",
        ptdt_dz: "",
        ptdt_chck: "",
        ptdt_ph: "",
        caozzl: "",
        caochl: "",
        caogh: "",
        whdl: "",
        wdzl: "",
        udjdx: "",
        wdj: "",
        sgry: "",
        zgy: ""
      }
    };
  },

  created() {
    var id = location.search.split("=")[1];
    console.log("ID是：" + id);
    this.handleSet(id);
  },

  methods: {
    handleSet(id) {
      getSj10(id).then(response => {
        console.log(response.data);
        this.form = response.data;
      });
    },

    submitForm() {
      if (this.form.id !== undefined) {
        editSj10(this.form).then(response => {
          this.$modal.msgSuccess("修改成功");
          this.getList();
        });
      } else {
        addSj10(this.form).then(response => {
          this.$modal.msgSuccess("新增成功");
          this.getList();
        });
      }
    },

    getList() {
      console.log("获取列表");
    }
  }
};
</script>

<style>
table {
  border-collapse: collapse;
  width: 70%;
  margin: 100px;
}

th,
td {
  border: 1px solid black;
  padding: 8px;
  text-align: center;
}

th {
  background-color: #4caf50;
  color: white;
  text-align: left;
}
</style>