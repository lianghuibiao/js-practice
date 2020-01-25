package tools;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class FileReader {

	
	public FileReader(File str1) throws IOException {
		
		//启动file 流
		try {
			//输出流
			@SuppressWarnings("resource")
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

}
