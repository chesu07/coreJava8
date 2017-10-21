package ch7.ex07;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class wordCount {

	public static void main(String[] args) {
			File inFile = new File("C:\\Users\\skybl\\Desktop\\filetest", "in.txt");
			        
	        
	        // 텍스트 파일 읽기
	        BufferedReader br = null;
	        try {
	            br = new BufferedReader(new FileReader(inFile));
	            String line;
	            while ((line = br.readLine()) != null) {
	                System.out.println(line);
	            }
	        } catch (FileNotFoundException e) {
	            e.printStackTrace();
	        } catch (IOException e) {
	            e.printStackTrace();
	        }finally {
	            if(br != null) try {br.close(); } catch (IOException e) {}
	        }
	    }
	}


