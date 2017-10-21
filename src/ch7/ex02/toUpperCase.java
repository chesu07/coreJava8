package ch7.ex02;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class toUpperCase {
	public void startWorker() {
		try {
			
			List<String> words = new ArrayList<>();
			Iterator<String> iter = null; 
			String element = "";
			int i = 0;
			
			words.add("red");
			words.add("blue");
			words.add("green");
			words.add("PINK");
			iter = words.iterator();
			
			while(iter.hasNext()) {
				element = iter.next();
				
				// 소문자 검사 정규식
				if (element.matches("^[a-z]*$")) {
					element = element.replaceAll(element, element.toUpperCase());
					words.set(i, element);		 
				}   
				i++;
			}
			
			System.out.println(words.toString());
			
		} catch (Exception e) { 
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		toUpperCase start = new toUpperCase();
		start.startWorker();
	}
}
