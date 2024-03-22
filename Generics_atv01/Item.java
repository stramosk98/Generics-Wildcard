package Generics_atv01;

public class Item {

	private String item;

	public Item(String item) {
		super();
		this.item = item;
	}

	public String getItem() {
		return item;
	}

	public void setItem(String item) {
		this.item = item;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Item [item=");
		builder.append(item);
		builder.append("]");
		return builder.toString();
	}
	
}
