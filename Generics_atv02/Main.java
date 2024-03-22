package Generics_atv02;

public class Main {

	public static void main(String[] args) {

		Capitulo cap1 = new Capitulo("Cap1");
		Capitulo cap2 = new Capitulo("Cap2");
		Capitulo cap3 = new Capitulo("Cap3");

		Livro livro = new Livro();
		livro.addLista(cap1);
		livro.addLista(cap2);
		livro.addLista(cap3);
		
		System.out.println(livro.mostrarLista());
	}

}