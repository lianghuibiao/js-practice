package tools;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileWrite {
//路径  字符串  是否重复
	
		public FileWrite(File fi,String str1,boolean bo){
			
			@SuppressWarnings("resource")
			FileOutputStream wri;
			try {
				wri = new FileOutputStream(fi,bo);
				String str= str1;
				byte[] by=str.getBytes();
		
					wri.write(by, 0, by.length);
			}
			catch (FileNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		
			
			
			
		}
}
