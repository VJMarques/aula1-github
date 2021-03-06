package entities;

public class Product {

	private String name;
	private double price;
	private int quantity;

	public Product(String name, double price, int quantity) {
		this.name = name;
		this.price = price;
		this.quantity = quantity;
	}

	public Product(String name, double price) {
		this.name = name;
		this.price = price;
	
	}

	public double totalValueInStock() {
		return price * quantity;
	}

	public void addProducts(int quantity) {
		this.quantity += quantity; // O Argumento "this" � uma palavra reservada que significa uma auto refer�ncia
									// ao objeto. Explicita chamar o ATRIBUTO DA CLASSE, n�o o parametro da fun��o
									// //

	}

	public void removeProducts(int quantity) {
		this.quantity -= quantity;
	}

	public String toString() {
		return name 
				+ ", $ " 
				+ String.format("%.2f", price) 
				+ ", " 
				+ quantity 
				+ " units, Total: $ "
				+ String.format("%.2f", totalValueInStock());

	}

	public void setName(String name) {
		this.name = name;
	}
	
	public String getName() {
		return name;
	}	
		
	public void setPrice(double price) {
	this.price = price;
		
	}
	
	public double getPrice() {
		return price;
	}
	
	public double getQuantity() {
		return quantity;

	}
	}
	
	
