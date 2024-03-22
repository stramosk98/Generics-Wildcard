package Wildcard_atv03;

import java.util.Arrays;
import java.util.List;

public class Main {

	public static void main(String[] args) {

		Wildcard wd = new Wildcard();
		
		List<Number> lista = Arrays.asList(2,4,7,3);
		System.out.println(wd.media(lista));
		
		List<Number> lista2 = Arrays.asList(1.2, 2.4, 3.6, 4.8, 5.0);
		System.out.println(wd.media(lista2));
		
		List<Number> lista3 = Arrays.asList(1.2, 4, 3.6, 8, 5.0);
		System.out.println(wd.media(lista3));
	}

}
