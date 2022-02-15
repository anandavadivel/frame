package org.list;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Collections {
public static void main(String[] args) {
	List li=new LinkedList();
	
	li.add(10);
	li.add("java");
	li.add('a');
	li.add(3456.34);
	li.add("ananda");
	li.add(29);
	
	System.out.println(li);
	
	
	int size=li.size();
	System.out.println(size);
	
	Object object = li.get(4);
	System.out.println(object);
	
	Object remove = li.remove(3);
	System.out.println(remove);
	
	li.add(3,3000);
	System.out.println(li);
	
	li.set(5,30);
	System.out.println(li);
	
	boolean contains = li.contains("ananda");
	System.out.println(contains);
	
	int indexOf = li.indexOf(30);
	System.out.println(indexOf);
	
	int indexOf2 = li.indexOf(25);
	System.out.println(indexOf2);
	
	boolean empty = li.isEmpty();
	System.out.println(empty);
	
	
	System.out.println("for loop");
	for (int i = 0; i < li.size(); i++) {
		System.out.println(li.get(i));
	}

	System.out.println("******************");	
	System.out.println("enhanced for loop");	
		for (Object j : li) {
			System.out.println(j);
		

	
	   
	  
	
}
		
		List b =new ArrayList();
		
		b.add("ananda");
		
	    Object object2 = b.get(0);
	    String string = object2.toString();
	    System.out.println(string);
	   
	   
}
private void sysout() {


}
	

}







