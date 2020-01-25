package tools;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileDeleteText {

	
	 public FileDeleteText(File inFile,File outFile,String str) {

		 
		 
		

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
