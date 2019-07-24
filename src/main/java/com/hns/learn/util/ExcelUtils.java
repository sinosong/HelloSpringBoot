package com.hns.learn.util;

import org.apache.commons.io.output.ByteArrayOutputStream;
import org.apache.commons.lang3.StringUtils;
import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.*;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.servlet.ServletOutputStream;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.text.SimpleDateFormat;

public class ExcelUtils {

    protected final static Logger logger = LoggerFactory.getLogger(ExcelUtils.class);

    private static final String EXCEL_XLS = "xls";
    private static final String EXCEL_XLSX = "xlsx";

    public static byte[] exportExcel(boolean downloadFlag, String[] titleS, String[][] centerVal, HttpServletResponse response ,String expName) {

        BufferedInputStream bis = null;
        BufferedOutputStream bos = null;
        try {
            if (titleS != null && titleS.length > 0 && centerVal != null && centerVal.length > 0) {
                float mus = 65536;
                float avg = centerVal.length / mus;
                int width = 20;
                // 第一步，创建一个webbook，对应一个Excel文件
                XSSFWorkbook wb = new XSSFWorkbook();
                //title设置样式
                XSSFCellStyle titleStyle = wb.createCellStyle();
                //居中格式
                titleStyle.setAlignment(XSSFCellStyle.ALIGN_CENTER);
                //自动换行
                titleStyle.setWrapText(true);
                // 标题加粗
                XSSFFont xssfFont = wb.createFont();
                xssfFont.setBold(true);
                titleStyle.setFont(xssfFont);
                //页面设置样式
                XSSFCellStyle centerStyle = wb.createCellStyle();
                //自动换行
                centerStyle.setWrapText(true);
                //垂直居中
                centerStyle.setVerticalAlignment(XSSFCellStyle.VERTICAL_CENTER);
                //当前循环数
                int centerNum = 0;
                for (int sheetNum = 0; sheetNum < avg; sheetNum++) {
                    // 第二步，在webbook中添加一个sheet,对应Excel文件中的sheet
                    XSSFSheet sheet = wb.createSheet("sheet" + sheetNum);
                    //设置默认列宽
                    // 第三步，在sheet中添加表头第0行,注意老版本poi对Excel的行数列数有限制short
                    XSSFRow row = sheet.createRow(0);
                    // 标题列
                    for (int i = 0; i < titleS.length; i++) {
                        //设置列宽
                        sheet.setColumnWidth(i, 252 * width + 323);
                        //创建标题
                        XSSFCell cell = row.createCell(i);
                        cell.setCellValue(titleS[i]);
                        cell.setCellStyle(titleStyle);
                    }
                    // 内容区域
                    int iNum = 0;
                    if (centerVal.length > mus * (sheetNum + 1)) {
                        iNum = (int) mus;
                    } else {
                        iNum = centerVal.length - (int) mus * sheetNum;
                    }
                    for (int i = 0; i < iNum; i++) {
                        row = sheet.createRow(i + 1);
                        for (int j = 0; j < centerVal[centerNum].length; j++) {
                            XSSFCell cell = row.createCell(j);
                            cell.setCellValue(centerVal[centerNum][j]);
                            cell.setCellStyle(centerStyle);
                        }
                        centerNum++;
                    }
                }
                if (downloadFlag) {
                    ByteArrayOutputStream os = new ByteArrayOutputStream();
                    wb.write(os);
                    byte[] content = os.toByteArray();
                    InputStream is = new ByteArrayInputStream(content);
                    // 设置response参数
                    response.reset();
                    response.setContentType("application/octet-stream;charset=utf-8");
                    response.setHeader("Content-Disposition", "attachment;filename=" + new String((expName + ".xlsx").getBytes(), "iso-8859-1"));
                    ServletOutputStream out = response.getOutputStream();
                    response.setHeader("Content-Length", String.valueOf(is.available()));
                    bis = new BufferedInputStream(is);
                    bos = new BufferedOutputStream(out);
                    byte[] buff = new byte[2048];
                    int bytesRead;
                    while (-1 != (bytesRead = bis.read(buff, 0, buff.length))) {
                        bos.write(buff, 0, bytesRead);
                    }
                } else {
                    FileOutputStream fout = new FileOutputStream("/Users/sinosong/Documents/dmp/"+expName+".xlsx");
                    wb.write(fout);
                    fout.close();
                    return null;
                }
            }
        } catch (Exception e) {
            logger.error("export error...");
            logger.error(e.getMessage());
        } finally {
            if (bis != null) {
                try {
                    bis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (bos != null) {
                try {
                    bos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return null;
    }

    public static void importExcel(String filePath) {

        // 创建文件对象
        File excelFile = new File(filePath);
        FileInputStream in = null;
        try {
            in = new FileInputStream(excelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        checkExcelVaild(excelFile);
        Workbook workbook = getWorkbok(in, excelFile);

        // Sheet的数量
        int sheetCount = workbook.getNumberOfSheets();
        // 遍历第一个Sheet
        Sheet sheet = workbook.getSheetAt(0);

        int count = 0;
        for (Row row : sheet) {
            // 跳过第一行
            if (count < 0) {
                count++;
                continue;
            }
            // 如果当前行没有数据，跳出循环
            if (null==row.getCell(0)) {
                return;
            }
            int end = row.getLastCellNum();
            String key = null;
            String col = null;
            String com = null;
            String typ = null;


            for (int i = 0; i < end; i++) {
                Cell cell = row.getCell(i);
                if (cell == null) {
                    continue;
                }
                if(i==0){
                    if(StringUtils.isBlank((String)getValue(cell))){
                        continue;
                    }
                    col = ((String)getValue(cell)).toUpperCase();
                    String tmpStr = col.toLowerCase();
                    boolean mark = false;
                    StringBuffer b = new StringBuffer();
                    for(char c : tmpStr.toCharArray()){
                        if(c==95){
                            mark = true;
                            continue;
                        }
                        if(mark){
                            c-=32;
                            mark = false;
                        }
                        b.append(c);
                    }
                   key = b.toString();
                }else if(i==1){
                    if(StringUtils.isBlank((String)getValue(cell))){
                        continue;
                    }
                    typ = (String)getValue(cell);
                    if(null!=typ && "STRING".equals(typ.toUpperCase())){
                        typ = "String";
                    }else if(null!=typ && "NUMBER".equals(typ.toUpperCase())){
                        typ = "Integer";
                    }else if(null!=typ && "DATE".equals(typ.toUpperCase())){
                        typ = "Date";
                    }else if(null!=typ && "BIGDECIMAL".equals(typ.toUpperCase())){
                        typ = "BigDecimal";
                    }else{
                        typ = "String";
                    }

                }else if(i==2){
                    com = (String)getValue(cell);
                }else{
                    Object obj = getValue(cell);
                    System.out.print("啥========================="+obj + "\t");
                }
            }
            String pri = "/** "+com+" */\n" +
                    "@TableField(\""+col+"\")\n" +
                    "private "+typ+" "+key+";";
            System.out.print(pri);
            System.out.println();
        }
    }

    public static void readExcel(String filePath) {

        // 创建文件对象
        File excelFile = new File(filePath);
        FileInputStream in = null;
        try {
            in = new FileInputStream(excelFile);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        checkExcelVaild(excelFile);
        Workbook workbook = getWorkbok(in, excelFile);

        // Sheet的数量
        int sheetCount = workbook.getNumberOfSheets();
        // 遍历第一个Sheet
        Sheet sheet = workbook.getSheetAt(0);

        int count = 0;
        for (Row row : sheet) {
            // 跳过第一行
            if (count < 1) {
                count++;
                continue;
            }
            // 如果当前行没有数据，跳出循环
            if (null==row.getCell(0)) {
                return;
            }
            int end = row.getLastCellNum();
            Object col0 = null;
            String col1 = null;
            String col2 = null;
            String col3 = null;


            for (int i = 0; i < end; i++) {
                Cell cell = row.getCell(i);
                if (cell == null) {
                    continue;
                }
                if(i==0){
                    col0 = getValue(cell);

                }else if(i==1){
                    if(StringUtils.isBlank((String)getValue(cell))){
                        continue;
                    }
                    col1 = (String)getValue(cell);
                }else if(i==2){
                    col2 = (String)getValue(cell);
                }else if(i==3){
                    col3 = (String)getValue(cell);
                }else{
                    Object obj = getValue(cell);
                    System.out.print("啥========================="+obj + "\t");
                }
            }
            String pri = "select ";
            pri += "\'"+(((Double)col0).intValue() + 5500000000L +"\',\'007\',")+ "\'" + col1 + "\',\'" + col2+ "\',\'" + col3+ "\'"+ ",sysdate,1";
            System.out.print(pri + " from dual union all");
            System.out.println();
        }
    }

    public static void checkExcelVaild(File file){
        if (!file.exists()) {
            throw new RuntimeException("文件不存在");
        }
        if (!(file.isFile() && (file.getName().endsWith(EXCEL_XLS) || file.getName().endsWith(EXCEL_XLSX)))) {
            throw new RuntimeException("文件不是Excel");
        }
    }

    public static Workbook getWorkbok(InputStream in, File file){
        Workbook wb = null;
        try {
            if (file.getName().endsWith(EXCEL_XLS)) {
                wb = new HSSFWorkbook(in);
            } else if (file.getName().endsWith(EXCEL_XLSX)){
                wb = new XSSFWorkbook(in);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
        return wb;
    }

    private static Object getValue(Cell cell) {
        Object obj = null;
        if(null==cell){
            return null;
        }
        //getCellTypeEnum?
        switch (cell.getCellType()) {
            case 4:
                obj = cell.getBooleanCellValue();
                break;
            case 5:
                obj = cell.getErrorCellValue();
                break;
            case 0:
                obj = cell.getNumericCellValue();
                break;
            case 1:
                obj = cell.getStringCellValue();
                break;
            default:
                break;
        }
        return obj;
    }
}
