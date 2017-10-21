package ch7.ex01;

import java.util.BitSet;
import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

public class Erathostenes {
	public void startWorker(int n) {
		try{
			
			Set<Integer> set = new HashSet<>();
			BitSet bitSet = new BitSet(n);
			
			
			// 2에서 n까지 HashSet에 추가한다.
			for(int i=2; i<=n; i++) {
				set.add(i);
			}
			 
			 
			
		}catch (Exception e) {
			e.printStackTrace();
		}
	}
	 
	public static void main(String[] args) {
		int n = 10;
		Erathostenes erath = new Erathostenes();
		erath.startWorker(n);
	}
}
