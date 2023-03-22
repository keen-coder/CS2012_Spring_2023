package lecture_examples.npcs;

import java.util.ArrayList;

import book_examples.edible_interface.RunAndHide;

public class TestNPC {
	public static void main(String[] args) {
		ArrayList<Attackable> attackNPCs = new ArrayList<>();
		ArrayList<RunAndHide> defendNPCs = new ArrayList<>();
		
		attackNPCs.add(new GuardNPC());
		attackNPCs.add(new SoliderNPC());
		
		defendNPCs.add(new TownNPC());
		
		
		
		
	}
	
	public static void townMonsterAttackEvent(ArrayList<Monster> m, ArrayList<RunAndHide> townNPCs, 
						ArrayList<Attackable> attackNPCs) {
		
		for (RunAndHide d : townNPCs) {
			d.hide();
		}
		
		for (int i = 0 ; i < m.size(); i++) {
			attackNPCs.get(i).attack(m.get(i));
		}
	}
}
