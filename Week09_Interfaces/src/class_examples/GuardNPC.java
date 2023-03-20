package class_examples;

public class GuardNPC extends NPC implements Attackable {

	@Override
	public void attack(Monster m) {
		System.out.println("Guard attack " + m);
	}

}