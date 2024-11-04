package com.ruoyi.web.controller.system;

import com.ruoyi.system.service.Sj10Service;
import org.apache.poi.ss.usermodel.*;
import org.apache.poi.ss.util.CellRangeAddress;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.OutputStream;

@Controller
public class ExcelController {

    @Autowired
    private Sj10Service sj10Service;// 定义为相应表名service

    @PostMapping("/exportExcel")
    public void exportExcel(HttpServletResponse response) throws IOException {
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("sj10");// 表名, 你们自己的表名

        // 设置样式的背景颜色
        CellStyle style1 = workbook.createCellStyle();
        style1.setFillPattern(FillPatternType.SOLID_FOREGROUND); // 设置背景填充样式
        style1.setFillForegroundColor(IndexedColors.YELLOW.getIndex()); // 设置背景颜色为黄色

        CellStyle style2 = workbook.createCellStyle();
        style2.setFillPattern(FillPatternType.SOLID_FOREGROUND); // 设置背景填充样式
        style2.setFillForegroundColor(IndexedColors.RED.getIndex()); // 设置背景颜色为红色

        CellStyle style3 = workbook.createCellStyle();
        style3.setFillPattern(FillPatternType.SOLID_FOREGROUND); // 设置背景填充样式
        style3.setFillForegroundColor(IndexedColors.GREEN.getIndex()); // 设置背景颜色为绿色
        // cell1.setCellStyle(style);

        // 字体剧中和字体大小
        CellStyle fontStyle1 = workbook.createCellStyle();
        fontStyle1.setAlignment(HorizontalAlignment.CENTER); // 设置水平居中
        fontStyle1.setVerticalAlignment(VerticalAlignment.CENTER); // 设置垂直居中

        CellStyle fontStyleCenter = workbook.createCellStyle();
        Font font = workbook.createFont();
        font.setFontHeightInPoints((short) 28); // 设置字体大小为14磅
        fontStyleCenter.setFont(font);

        // 边框样式
        CellStyle borderStyle = workbook.createCellStyle();
//        borderStyle.setBorderTop(BorderStyle.THIN); // 上边框
//        borderStyle.setBorderBottom(BorderStyle.THIN); // 下边框
//        borderStyle.setBorderLeft(BorderStyle.THIN); // 左边框
//        borderStyle.setBorderRight(BorderStyle.THIN); // 右边框


        // 创建行和填充数据... 该表18列
        // 第一行
        Row row1 = sheet.createRow(0);// 创建一行
        Cell row1_cell0 = row1.createCell(0);// 创建一个单元格
        row1_cell0.setCellValue("sj10");// 设置单元格内容

        sheet.addMergedRegion(new CellRangeAddress(0,0,0,6));// 合并单元格

        // 第二行
        Row row2 = sheet.createRow(1);
        Cell row2_cell2 = row2.createCell(0);
        row2_cell2.setCellValue("三维网客土喷播草种现场检查记录表");
        //row2.setHeightInPoints(50);// 行高
        sheet.addMergedRegion(new CellRangeAddress(1,1,0,6));
        row2_cell2.setCellStyle(fontStyle1);// 设置单元格样式
        row2_cell2.setCellStyle(fontStyleCenter);

        // 第三行
        Row row3 = sheet.createRow(2);
        Cell row3_cell0  = row3.createCell(0);
        row3_cell0.setCellValue("施工单位：");
        sheet.addMergedRegion(new CellRangeAddress(2,2,0,1));
        row3_cell0.setCellStyle(borderStyle);// 单元格设置样式
        row3_cell0.setCellStyle(fontStyle1);

        Cell row3_cell3 = row3.createCell(3);
        row3_cell3.setCellValue("string");
        sheet.addMergedRegion(new CellRangeAddress(2,2,3,6));
        row3_cell3.setCellStyle(style2);
        //row3_cell3.setCellStyle(borderStyle);

        Cell row3_cell12 = row3.createCell(4);
        row3_cell12.setCellValue("合同号");
        sheet.addMergedRegion(new CellRangeAddress(2,2,12,13));
        row3_cell12.setCellStyle(fontStyle1);

        Cell row3_cell14 =  row3.createCell(14);
        row3_cell14.setCellValue("string");
        sheet.addMergedRegion(new CellRangeAddress(2,2,14,17));
        row3_cell14.setCellStyle(style3);


        // 第三行
        Row row4 = sheet.createRow(3);
        Cell row4_cell0  = row4.createCell(0);
        row4_cell0.setCellValue("工程名称：");
        sheet.addMergedRegion(new CellRangeAddress(3,3,0,2));
        row4_cell0.setCellStyle(borderStyle);// 单元格设置样式

        Cell row4_cell3  = row4.createCell(3);// 创建列 单元格
        row4_cell3.setCellValue("8888888");
        sheet.addMergedRegion(new CellRangeAddress(3,3,3,8));
        row4_cell3.setCellStyle(borderStyle);// 单元格设置样式

        Cell row4_cell9  = row4.createCell(9);// 创建列 单元格
        row4_cell9.setCellValue("合同段：");
        sheet.addMergedRegion(new CellRangeAddress(3,3,9,11));
        row4_cell9.setCellStyle(borderStyle);// 单元格设置样式

        Cell row4_cell12  = row4.createCell(12);// 创建列 单元格
        row4_cell12.setCellValue("23749273942934792");
        sheet.addMergedRegion(new CellRangeAddress(3,3,12,17));
        row4_cell12.setCellStyle(borderStyle);// 单元格设置样式
//        // 创建表头
//        Row headerRow = sheet.createRow(0);
//        headerRow.setHeightInPoints(20);// 行高
//        Cell cell1 = headerRow.createCell(0);
//        cell1.setCellValue("ID");
//        headerRow.createCell(1).setCellValue("姓名");
//        headerRow.createCell(2).setCellValue("密码");



        // 填充数据
//        List<User> users = userService.getUsers();
//        int rowNum = 1;
//        for (User user : users) {
//            Row row = sheet.createRow(rowNum++);// rowNum++ 行号
//            row.createCell(0).setCellValue(user.getId());
//            row.createCell(1).setCellValue(user.getUsername());
//            row.createCell(2).setCellValue(user.getPassword());
//        }
//
//        sheet.addMergedRegion(new CellRangeAddress(1,1,1,2));
//        sheet.addMergedRegion(new CellRangeAddress(4,5,0,1));


        // 设置响应头
        String fileName = "AAA";
        response.setHeader("Content-Disposition", "attachment; filename="+fileName+".xlsx");
        response.setContentType("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet");

        // 写入响应流
        OutputStream outputStream = response.getOutputStream();
        workbook.write(outputStream);
        workbook.close();
        outputStream.close();
    }

}
