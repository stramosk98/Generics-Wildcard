package Wildcard_atv01;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {
		
		Wildcard wd = new Wildcard();
		 
		List<Double> lDouble = Arrays.asList(1.2, 2.4, 3.6, 4.8, 5.0);
	    List<String> lString = Arrays.asList("a", "b", "c");
		
	    System.out.println(wd.imprimirLista(lDouble));
		System.out.println(wd.imprimirLista(lString));
		
	}

}
