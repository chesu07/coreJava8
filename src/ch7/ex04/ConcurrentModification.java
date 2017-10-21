package ch7.ex04;

import java.util.ArrayList;
import java.util.List;

public class ConcurrentModification {
	public void startWorker() {
		try {
		
			/*
				ConcurrentModificationException은 컬렉션에서 순회 중 데이터의 조작이 발생한다.
				Enhanced for loop의 동작 방식은 단순히 for를 이용한 형태의 변형이라고만 생각했지만, 
				Enhanced for loop는 Iterator방식으로 List를 순회하는 방법을 이용하고 있었다.	
				 
			*/
			
			List<String> targetList = new ArrayList<String>();
			targetList.add("a");
			targetList.add("b");
			targetList.add("c");
			targetList.add("d");
			 
			for( String str : targetList) {
			     if (("a").equals(str)) {
			          targetList.remove(str);
			     }
			}
			
			
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		ConcurrentModification start = new ConcurrentModification();
		start.startWorker();
	}
}
