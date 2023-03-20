package class_examples;

import java.util.ArrayList;

public class TestGrowable {

	public static void main(String[] args) {
		
		Person g1 = new Person();
		Tree g2 = new Tree();
		
		ArrayList<Growable> thingsThatGrow = new ArrayList<>();

		thingsThatGrow.add(g1);
		thingsThatGrow.add(g2);
		
		for (int i = 0 ; i < thingsThatGrow.size(); i++) {
			thingsThatGrow.get(i).grow();
		}
		
			
	}

}
