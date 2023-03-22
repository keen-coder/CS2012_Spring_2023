package lecture_examples.npcs;

public class SoliderNPC extends NPC implements Attackable{

	@Override
	public void attack(Monster m) {
		System.out.println("Solider attack " + m);
		
	}

}
