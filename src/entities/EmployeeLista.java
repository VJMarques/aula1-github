package entities;

public class EmployeeLista {

	private String name;
	private int id;
	private double salary;
	
	public EmployeeLista(String name, int id, double salary) {
		this.name = name;
		this.id = id;
		this.salary = salary;
	}


	public void increaseSalary(double percentage) {
		this.salary = salary + (salary*(percentage/100));
		
	}


	public String getName() {
		return name;
	}


	public void setName(String name) {
		this.name = name;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public double getSalary() {
		return salary;
	}
	
	public String toString() {
		return id + ", " + name + ", " + String.format("%.2f", salary);
	
	}
}

