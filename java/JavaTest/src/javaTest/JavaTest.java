package javaTest;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class JavaTest {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
     test te=new test();
     File fi=new File("src/javaTest/te");
     File ac=new File("src/javaTest/tf");
     //te.fileInputStream(fi);
   //te.fileOutputStream(fi,"helloword",true);
     //te.str(fi,ac,"答案");
	}

}
//######################################3
class test {
	//读取文件内容
	//参数1 文件读取路径  
	public void fileInputStream(File str1) throws IOException {
		
		//启动file 流
		try {
			//输出流
			FileInputStream reader=new FileInputStream(str1);
			byte[] by=new byte[1024];
			reader.read(by);
			String str=new String(by);
			System.out.println(str);
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	//写入数据  
	//参数 写入文件的地址  写入的字符串  是否重复写入
	public void fileOutputStream(File fi,String str1,boolean bo) throws Exception {
		
		FileOutputStream wri=new FileOutputStream(fi,bo);
		
			String str= str1;
			byte[] by=str.getBytes();
		wri.write(by, 0, by.length);
		
	}
	
	//根据字符串删除当前关键字的行
	//参数1 开始路径  参数2 结果复制到目标文件  第三个 关键字
	 public void str(File inFile,File outFile,String str) {

		 
		 
		

	        BufferedReader br = null;
	        String readedLine;
	        BufferedWriter bw = null;
	        try {
	            FileWriter fw = new FileWriter(outFile);
	            bw = new BufferedWriter(fw);
	            if (!outFile.exists()) {
	                outFile.createNewFile();
	            }
	            br = new BufferedReader(new FileReader(inFile));
	            int idx = 0;
	            while ((readedLine = br.readLine()) != null) {
	                if (readedLine.contains(str)) {
	                    continue;
	                }
	                bw.write(readedLine + "\n");
	                if (idx++ == 100) {
	                    bw.flush();
	                    idx = 0;
	                }
	            }
	            bw.flush();
	        } catch (Exception e) {
	            e.printStackTrace();
	        } finally {
	            try {
	                if (br != null) {
	                    br.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	            try {
	                if (bw != null) {
	                    bw.close();
	                }
	            } catch (IOException e) {
	                e.printStackTrace();
	            }
	        }
	
	 }










}
