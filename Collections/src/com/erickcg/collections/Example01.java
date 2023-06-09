package com.erickcg.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Example01 {
	public static void main(String[] args) {
		List<Integer> numeros = new ArrayList<>();
		//Agregando valores a la lista
		numeros.add(8);
		numeros.add(9);
		numeros.add(10);
		numeros.add(11);
		numeros.add(12);
		numeros.add(8);
		
		//recorriendo los datos: opcion1
		for (int i = 0; i<numeros.size();i++) {
			
			System.out.print(numeros.get(i)+ " ");
			
		}
		System.out.println("\n");
		
		//recorriendo los datos: opcion2
		Iterator<Integer> numIterator = numeros.iterator();
		while(numIterator.hasNext()) {
			System.out.println(numIterator.next());
		}
		
		//implementando la busqueda
		// este muestra la primera coincidencia
		int indice = numeros.indexOf(8);
		System.out.println(indice);
		
//		este muestra la ultima coincidencia 
		int indice2 = numeros.lastIndexOf(8);
		System.out.println(indice2);
		
//		NOTA: si se buscan elementos que no existen ambos metodos devolveran -1 
		
		
	}

}
