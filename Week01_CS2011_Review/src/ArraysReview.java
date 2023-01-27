import java.util.Scanner;

public class ArraysReview {

	public static void main(String[] args) {
		//data structure
		//1d array 2d array
		
		int[] data1 = new int[5];
		//indexed variable
		data1[0] = 7;
		data1[1] = 52;
		data1[2] = 54;
		data1[3] = 800;
		data1[4] = 21;
		
		double[] data2 = {4.5, 67.2, 34.35, 9.26};
		
		Scanner in = new Scanner(System.in);
		
		System.out.print("Enter the values for the array: ");
		int[] data3 = new int[9];
		
		for (int i = 0 ; i < data3.length ; i++) {
			data3[i] = in.nextInt();
		}
		
		
		printArr(data1);
		System.out.println();
		printArr(data3);
		System.out.println();
		printArr(data2);
		

	}
	
	public static void printArr(int[] data) {
		for(int i = 0 ; i < data.length ; i++) {
			System.out.print(data[i] + " ");
		}
	}
	
	public static void printArr(double[] data) {
		for(int i = 0 ; i < data.length ; i++) {
			System.out.print(data[i] + " ");
		}
	}
	
	
	
	
	

}
;