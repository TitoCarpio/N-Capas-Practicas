package com.erickcg.collections;

import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Example02 {

	public static void main(String[] args) {
		
		//declaro un arreglo
		Integer [] numeros = {1,2,3,4,4};
		
		//declaro un set
		Set<Integer> set1 = new HashSet<>();
		//agrego los datos al set
		Collections.addAll(set1, numeros);
		//imprimiendo en pantalla
		System.out.println(set1);
		
	}

}
