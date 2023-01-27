
public class NestedLoops {

	public static void main(String[] args) {
		
		
		for(int i = 1 ; i <= 3 ; i++) {
			System.out.println("i = " + i);
			for(int j = 1 ; j <= 3 ; j++) {
				System.out.println("\tj = " + j);
				for(int k = 1 ; k <= 3 ; k++) {
					System.out.println("\t\tk = " + k);
				}
			}
		}
		

	}

}
