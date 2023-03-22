package lecture_examples.npcs;

import book_examples.edible_interface.RunAndHide;

public class TownNPC extends NPC implements RunAndHide{

	@Override
	public void hide() {
		System.out.println("NPC runs and hides in their home.");
	}

}
