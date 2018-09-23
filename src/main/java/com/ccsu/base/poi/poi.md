# 导出excel 
## 常用组件：

HSSFWorkbook                      excel的文档对象

HSSFSheet                         excel的表单

HSSFRow                           excel的行

HSSFCell                          excel的格子单元

HSSFFont                          excel字体

HSSFDataFormat                    日期格式

HSSFHeader                        sheet头

HSSFFooter                        sheet尾（只有打印的时候才能看到效果）

样式：

HSSFCellStyle                       cell样式

辅助操作包括：

HSSFDateUtil                        日期

HSSFPrintSetup                      打印

HSSFErrorConstants                  错误信息表

## 基本步骤
> 理解一下一个Excel的文件的组织形式，一个Excel文件对应于一个workbook(HSSFWorkbook)，一个workbook可以有多个sheet（HSSFSheet）组成，一个sheet是由多个row（HSSFRow）组成，一个row是由多个cell（HSSFCell）组成。
1. 用HSSFWorkbook打开或者创建“Excel文件对象”
2. 用HSSFWorkbook对象返回或者创建Sheet对象
3. 用Sheet对象返回行对象，用行对象得到Cell对象
4. 对Cell对象读写。

## 样式设置
> 包括合并单元格、设置单元格样式、设置字体样式

* 合并单元格
```java
public int addMergedRegion(CellRangeAddress region)
CellRangeAddress(int firstRow, int lastRow, int firstCol, int lastCol)
```
* 设置单元格样式
 行、高
```java
sheet.setDefaultRowHeightInPoints(10);//设置缺省列高sheet.setDefaultColumnWidth(20);//设置缺省列宽
//设置指定列的列宽，256 * 50这种写法是因为width参数单位是单个字符的256分之一

sheet.setColumnWidth(cell.getColumnIndex(), 256 * 50);
```

// 设置单元格的横向和纵向对齐方式，具体参数就不列了，参考HSSFCellStyle
 
 cellStyle.setAlignment(HSSFCellStyle.ALIGN_JUSTIFY);
 
 cellStyle.setVerticalAlignment(HSSFCellStyle.VERTICAL_CENTER);
 
 /* 设置单元格的填充方式，以及前景颜色和背景颜色
 
  三点注意：
 
  1.如果需要前景颜色或背景颜色，一定要指定填充方式，两者顺序无所谓；
 
  2.如果同时存在前景颜色和背景颜色，前景颜色的设置要写在前面；
 
  3.前景颜色不是字体颜色。
 
 */
 
 //设置填充方式(填充图案)
 
 cellStyle.setFillPattern(HSSFCellStyle.DIAMONDS);
 
 //设置前景色
 
 cellStyle.setFillForegroundColor(HSSFColor.RED.index);
 
 //设置背景颜色
 
 cellStyle.setFillBackgroundColor(HSSFColor.LIGHT_YELLOW.index);
 
 // 设置单元格底部的边框及其样式和颜色
 
 // 这里仅设置了底边边框，左边框、右边框和顶边框同理可设
 
 cellStyle.setBorderBottom(HSSFCellStyle.BORDER_SLANTED_DASH_DOT);
 
 cellStyle.setBottomBorderColor(HSSFColor.DARK_RED.index);
 
 //设置日期型数据的显示样式
 
 cellStyle.setDataFormat(HSSFDataFormat.getBuiltinFormat("m/d/yy h:mm"));