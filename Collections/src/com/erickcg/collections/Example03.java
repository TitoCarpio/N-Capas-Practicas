package com.erickcg.collections;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class Example03 {

	public static void main(String[] args) {
		TreeSet<String> set = new TreeSet<>();
		set.add("Z-el");
		set.add("D-el");
		set.add("F-el");
		set.add("A-el");
		
		System.out.println(set);
		
		Set<String> set1 = new HashSet<>();
		set1.add("Z");
		set1.add("A");
		set1.add("D");
		set1.add("F");
		
		System.out.println(set1);
		
		
		

	}

}
