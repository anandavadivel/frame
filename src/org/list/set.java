package org.list;

import java.util.LinkedHashSet;
import java.util.Set;

public class set {

	public static void main(String[] args) {
		Set S=new LinkedHashSet();
		S.add(10);
		S.add("ANANDA");
		S.add('A');
		S.add(12345.456);
		S.add(9952368783L);
		
		System.out.println(S);
		
		S.remove('A');
		
		S.size();
		
		boolean contains = S.contains(20);
		System.out.println(contains);
		
		boolean empty = S.isEmpty();
		System.out.println(empty);

		System.out.println("enhancedforloop");
		for (Object a : S) {
			System.out.println(a);
		}
		
		
		
	}
	
	
}
