package Generics_atv01;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {
		
		Item i1 = new Item("S�fa");
		Item i2 = new Item("Fog�o");
		Item i3 = new Item("Mesa");

		Apartamento ap = new Apartamento();
		ap.addLista(i1);
		ap.addLista(i2);
		ap.addLista(i3);
		
		System.out.println(ap.mostrarLista());
	}

}