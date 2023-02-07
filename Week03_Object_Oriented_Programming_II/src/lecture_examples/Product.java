package lecture_examples;

public class Product {
	private String name;
	private long pid;
	private double price;
	
	public Product(String name, long pid, double price) {
		this.name = name;
		this.setPID(pid);
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public long getPID() {
		return this.pid;
	}
	
	public void setPID(long pid) {
		if(pid < 0) {
			System.out.println("ERR: pid cannot be negative.");
			System.out.println("Setting value to default 1");
			this.pid = 1;
		}
		else {
			this.pid = pid;
		}
	}
	
	
	
}
