package Wildcard_atv02;

import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		List<Number> lista = new java.util.ArrayList<>();
		lista.add(4);
		lista.add(6);
		lista.add(8);
		
		System.out.println(lista);
	    Wildcard.adicionarNumero(lista, 12);
	    System.out.println(lista);
	}

}