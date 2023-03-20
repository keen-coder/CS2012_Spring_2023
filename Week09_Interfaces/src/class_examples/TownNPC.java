package class_examples;

public class TownNPC extends NPC implements Defendable{

	@Override
	public void defend() {
		System.out.println("NPC runs and hides.");
		
	}

}
