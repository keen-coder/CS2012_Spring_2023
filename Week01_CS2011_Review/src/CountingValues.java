import java.util.Scanner;

public class CountingValues {

	// Test 1: 1 4 2 3 6 7 5 3 7 8 2 3 4 5 6 2 3 2 3 4 5 6 0
	public static void main(String[] args) {
		int[] counts = createArray(9);
		countValues(counts);
		printResults(counts);
	}
	
	public static void printResults(int[] counts) {
		
		for (int i = 1 ; i < counts.length ; i++) {
			int currCount = counts[i];
			
			if (currCount == 0) {
				continue;
			}
			
			System.out.println(i + " occurs " + currCount + 
					((currCount == 1) ? " time" : " times"));
		}
		
	}
	
	public static void countValues(int[] counts) {
		System.out.print("Enter values, 0 to stop: ");
		
		Scanner in = new Scanner(System.in);
		int currValue = in.nextInt();
		
		while(currValue != 0) {
			counts[currValue] += 1;
			currValue = in.nextInt();
		}
	}
	
	public static int[] createArray(int max) {
		int[] counts = new int[max + 1];
		return counts;
	}
	

}
