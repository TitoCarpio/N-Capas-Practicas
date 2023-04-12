package com.erickcg.lambdas;

import java.util.function.Consumer;

public class Example03 {
	public static void main(String[] args) {
		sum(5,4,(n)->{
			System.out.println("El resultado es: "+n);
		});
		
		sum(9,7,Example03::imprimir);
		
	}
	
//	Creando una funcion que recibe dos numeros y los sumara
	private static void sum (int a, int b, Consumer<Integer> resultado) {
		int result = a+b;
		resultado.accept(result);
	}
	
	//Funcion que imprime el resultado
	private static void imprimir(int n) {
		System.out.println("Resultado: "+n);
	}

}
