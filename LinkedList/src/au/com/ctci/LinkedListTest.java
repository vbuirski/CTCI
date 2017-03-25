package au.com.ctci;

import java.util.Arrays;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;

import java.util.Set;

public final class LinkedListTest {

	public static void main(String args[]){
		
	
	LinkedList<Integer> myList = new LinkedList<>(Arrays.asList(1, 2, 3, 1));

	Set<Integer> set = new HashSet<>();
	Iterator<Integer> iterator = myList.iterator();
	System.out.println("iterator method");
	while (iterator.hasNext()) {
	 System.out.println(iterator.next());
	}
	System.out.println("loop method");
	for(int i=0; i<myList.size(); i++) {
		System.out.println(myList.get(i));
	}
	
	System.out.println("java8 method");
	myList.forEach(System.out::println);
	
	
	}
}
