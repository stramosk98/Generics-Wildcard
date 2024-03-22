package Generics_atv02;

public class Capitulo {

	private String capitulo;

	public Capitulo(String capitulo) {
		this.capitulo = capitulo;
	}

	public String getCapitulo() {
		return capitulo;
	}

	public void setCapitulo(String capitulo) {
		this.capitulo = capitulo;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Capitulo [capitulo=");
		builder.append(capitulo);
		builder.append("]");
		return builder.toString();
	}
	
	
}
