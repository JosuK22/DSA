package collections.app;

public class Emp {
	private int id;
	private String name;
	private String city;
	private int salary;

	public Emp() {

	}

	public Emp(int id, String name, String city, int salary) {
		this.id = id;
		this.name = name;
		this.city = city;
		this.salary = salary;
	}

	public String getDetails() {
		return id + " " + name + " " + city;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}
	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return id + " " + name + " " + city+" "+salary;
	}
}