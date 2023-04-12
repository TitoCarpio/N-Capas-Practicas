package com.erickcg.lambdas;

import java.util.ArrayList;
import java.util.List;

public class Example01 {
	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();
		nums.add(8);
		nums.add(5);
		nums.add(7);
		nums.add(6);
		nums.add(1);
		nums.add(3);
		
		nums.forEach((n)->{
			System.out.println("Elemento: " + n);
		});
		
//		Utilizando lambdas con map
		System.out.println("_________________________________");
		List<Integer> numMultiplicado = 
			nums
				.stream() //esto me permite luego usarel .map()
				.map((n)->{
					return n*2;
				})
				.toList(); //convierto el stream a lista
		
		System.out.println(numMultiplicado);
	}

}
