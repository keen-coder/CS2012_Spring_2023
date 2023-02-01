package lecture_examples;

import java.util.Random;

public class RandomClassExample {

	public static void main(String[] args) {
		Random r = new Random();
		//r.nextInt(max - min + 1) + min;
		System.out.println(r.nextInt(10 - 1 + 1) + 1);

		System.out.println(r.nextDouble(11));
		
	}

}
