package lecture_examples;

public class MyStack {
	private double[] stack;
	private static final int DEFAULT_CAPACITY = 10;
	private int size;
	
	public MyStack() {
		this(DEFAULT_CAPACITY);
	}
	
	public MyStack(int capacity) {
		this.stack = new double[capacity];
		this.size = 0;
	}
	
	//Talk about why not just stack = values;
	public MyStack(double ... values) {
		//this.stack = values;
		this.stack = new double[values.length];
		this.size = values.length;
		System.arraycopy(values, 0, this.stack, 0, values.length);
	}
	
	public void push(double value) {
		this.stack[this.size] = value;
		this.size++;
	}
	
	public double pop() {
		double topValue = this.stack[this.size - 1];
		this.stack[this.size - 1] = 0;
		this.size--;
		return topValue;
	}
	
	public double peek() {
		return this.stack[this.size - 1];
	}
	
	public String toString() {
		//NO PRINT STATEMENTS
		String result = "";
		
		result += "stack: ";
		
		for(int i = 0 ; i < this.stack.length ; i++) {
			result += this.stack[i] + " ";
		}
		
		result += "\nsize: " + this.size;
		
		
		return result;
		
	}
}
