package ch7.ex03;

import java.util.HashSet;
import java.util.Set;

public class setCalculation {
	public void startWorker() {
		try {
			  Set<String> s1 = new HashSet<String>();
			  Set<String> s2 = new HashSet<String>();
			  
			  s1.add("A");
			  s1.add("B");
			  s1.add("C");
			  
			  s2.add("A");
			  s2.add("D");
			  
			  // 합집합
			  Set<String> union = new HashSet<String>(s1);
			  union.addAll(s2);
			  
			  // 교집합
			  Set<String> intersection = new HashSet<String>(s1);
			  intersection.retainAll(s2);
			  	
			  // 차집합
			  Set<String> diffrentSet = new HashSet<String>(union);
			  
			  diffrentSet.removeAll(intersection); 
			  
			  System.out.println("합집합 : " + union);
			  System.out.println("교집합 : " + intersection);
			  System.out.println("차집합 : " + diffrentSet);

 
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	public static void main(String[] args) {
		setCalculation start = new setCalculation();
		start.startWorker();
	}
}
