package Wildcard_atv03;

import java.util.List;

public class Wildcard {

	public double media(List<? extends Number> lista) {
		double avg = 0;
		Double val = null;
		for(Object e : lista) {
		    if (e instanceof Number) {
		        val = ((Number) e).doubleValue();
		    }
			avg += val;
		}
		return avg / lista.size();
	}
}
