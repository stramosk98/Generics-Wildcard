package Generics_atv02;

import java.util.ArrayList;
import java.util.List;

public class Livro {

	private List<Capitulo> lista = new ArrayList<Capitulo>();
	
	public List<Capitulo> getLista() {
		return lista;
	}

	public void setLista(List<Capitulo> lista) {
		this.lista = lista;
	}

	public void addLista(Capitulo capitulo) {
		this.lista.add(capitulo);
	}
	
	public String mostrarLista() {
		String capitulos = "";
		for(Capitulo cap : this.lista) {
			capitulos += cap.toString() + "\n";
 		}
		return capitulos;
	}
	
}
