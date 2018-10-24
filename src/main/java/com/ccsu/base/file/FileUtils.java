package com.ccsu.base.file;

import java.io.*;

/**
 * Created by IntelliJ IDEA.
 *
 * @author: Xiaolei Zhu
 * @Date: 2018/9/17
 * @Time: 22:11
 * Description:
 */
public class FileUtils {

    public static void fileToFile(File source, File dest) throws IOException {
        InputStream inputStream = new FileInputStream(source);
        BufferedInputStream bis = new BufferedInputStream(inputStream);
        OutputStream outputStream = new FileOutputStream(dest);
        BufferedOutputStream bos = new BufferedOutputStream(outputStream);
        byte[] bytes = new byte[1024];
        int i;
        while ((i = bis.read(bytes)) != -1) {
            bos.write(bytes,0,i);
        }
    }


    /**
     * 字节流：用于读取诸如图像数据之类的原始字节流
     *
     * @param source
     * @param dest   <pre>new FileOutputStream(destFile,true),第二个参数为true时，表示内容追加</pre>
     */
    public static void fileToFileByByte(String source, String dest) {
        File sourceFile = new File(source);
        File destFile = new File(dest);
        InputStream inStream = null;
        BufferedInputStream bfInStream = null;
        OutputStream outStream = null;
        BufferedOutputStream bfOutStream = null;
        try {
            inStream = new FileInputStream(sourceFile);
            bfInStream = new BufferedInputStream(inStream);
            outStream = new FileOutputStream(destFile, true);
            bfOutStream = new BufferedOutputStream(outStream);
            byte[] buffer = new byte[1024];
            int len;
            while ((len = bfInStream.read(buffer)) != -1) {
                bfOutStream.write(buffer, 0, len);
            }
            bfOutStream.flush();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (inStream != null) {
                    inStream.close();
                }
                if (bfInStream != null) {
                    bfInStream.close();
                }
                if (outStream != null) {
                    outStream.close();
                }
                if (bfOutStream != null) {
                    inStream.close();
                }
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * “FileWrite”是被修饰者，“BufferedWrite”是修饰者，
     * 如果用“嵌套”这个概念来理解这一问题，那么很明显，
     * “FileWrite”是嵌套在“BufferedWrite”中的，
     * 所以，当先关闭“FileWrite”流时，
     * “BufferedWrite”自然没有了修饰对象，
     * 所以会抛出异常。
     *
     * @param source
     * @param dest
     * @throws IOException
     */
    public static void fileToFileByChar(String source, String dest) throws IOException {
        Reader fileReader = new FileReader(source);
        BufferedReader bfRea = new BufferedReader(fileReader);
        Writer fileWriter = new FileWriter(dest);
        BufferedWriter bfWri = new BufferedWriter(fileWriter);
        String str;
        while ((str = bfRea.readLine()) != null) {
            bfWri.write(str);
        }
        bfRea.close();
        fileReader.close();
        bfWri.close();
        fileWriter.close();
    }


    public static void main(String[] args) throws IOException {
        //FileUtils.fileToFileByByte("/Users/zhuxiaolei/error.log", "/Users/zhuxiaolei/true.log");
        //FileUtils.fileToFileByChar("/Users/zhuxiaolei/error.log", "/Users/zhuxiaolei/true.log");
        //Float a = 0.09f;
        //System.out.println(Float.floatToRawIntBits(a));
        int a = 9;
        System.out.println(Integer.toBinaryString(9));
    }
}
