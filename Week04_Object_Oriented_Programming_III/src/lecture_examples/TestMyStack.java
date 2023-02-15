package lecture_examples;

public class TestMyStack {

	public static void main(String[] args) {
		double[] data = {1, 2, 3, 4, 5};
		
		MyStack ms = new MyStack(data);
		
		System.out.println("the stack is:\t" + ms);
		
		
		
		
	}
	
	public static void print(double[] arr) {
		for(double value : arr) {
			System.out.print(value + " ");
		}
	}

}
