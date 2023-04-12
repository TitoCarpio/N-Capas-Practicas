package com.erickcg.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Example02 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(8);
		nums.add(5);
		nums.add(7);
		nums.add(6);
		nums.add(1);
		nums.add(3);
		
		nums.forEach(System.out::println);
		
//		Utilizando lambdas con map
		System.out.println("_________________________________");
		List<Integer> numMultiplicado = 
			nums
				.stream() //esto me permite luego usarel .map()
				.map(Example02::numMul)
				.toList(); //convierto el stream a lista
		
		System.out.println(numMultiplicado);
		
		
	}
	
	//Creacion de funcion que va a multiplicar por 2 los numeros
	private static Integer numMul (int n) {
		return n*2;
	}

}
