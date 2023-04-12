package com.erickcg.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class Example04 {
	public static void main(String[] args) {
		Map<Character, String> map = new HashMap<>();
		
//		Agregando valores al Map
		map.put('z', "Valor de A");
		map.put('a', "Valor de A");
		map.put('c', "Valor de c");
		map.put('b', "Valor de b");
		
		System.out.println(map);
		//obteniendo un valor
		System.out.println(map.get('a'));
		//eliminando un valor
		map.remove('a');
		System.out.println(map);
		
		//recorriendo el map con un iterador
		Iterator<Character> iterador = map.keySet().iterator();
		while(iterador.hasNext()) {
			char valor = iterador.next();
			System.out.println(map.get(valor));
		}
	}

}
