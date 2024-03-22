package Generics_atv01;

import java.util.ArrayList;
import java.util.List;

public class Apartamento {

	private List<Item> lista = new ArrayList<Item>();
	
	public List<Item> getLista() {
		return lista;
	}

	public void setLista(List<Item> lista) {
		this.lista = lista;
	}

	public void addLista(Item item) {
		this.lista.add(item);
	}
	
	public String mostrarLista() {
		String itens = "";
		for(Item prod : this.lista) {
			itens += prod.toString() + "\n";
 		}
		return itens;
	}
	
	
}
