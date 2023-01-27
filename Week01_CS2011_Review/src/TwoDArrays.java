import java.util.Random;

public class TwoDArrays {

	public static void main(String[] args) {
		
		int[] arr = new int[Integer.MAX_VALUE];
		
		
		int[][] table = new int[3][4];
		
		int[][] table2 = {{1, 2, 3}, 
				          {4, 5, 6}, 
				          {7, 8, 9}};
		
		
		int[][] table3 = create2DArray(10, 100);
		
		print2DArray(table3);
		
	}
	
	public static void print2DArray(int[][] table) {
		for(int row = 0 ; row < table.length ; row++) {
			for(int col = 0 ; col < table[row].length ; col++) {
				System.out.print(table[row][col] + " ");
			}
			System.out.println();
		}
	}
	
	public static int[][] create2DArray(int nRows, int nCols) {
		int[][] table = new int[nRows][nCols];
		
		Random rand = new Random();
		//ctrl-shift-o for auto import
		
		for(int row = 0 ; row < table.length ; row++) {
			for(int col = 0 ; col < table[row].length ; col++) {
				table[row][col] = rand.nextInt(10);
			}
		}
		
		return table;
	}
	
	
	
	
	
	
	
	
	
	

}
