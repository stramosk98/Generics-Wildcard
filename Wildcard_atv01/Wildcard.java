package Wildcard_atv01;

import java.util.List;

public class Wildcard {

	public String imprimirLista(List<?> lista) {
		String list = "";
		for(Object e : lista) {
			list += e.toString() + " - ";
		}
		return list;
	}
	
}
