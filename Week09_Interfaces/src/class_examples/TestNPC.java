package class_examples;

import java.util.ArrayList;

public class TestNPC {
	public static void main(String[] args) {
		ArrayList<Attackable> attackNPCs = new ArrayList<>();
		ArrayList<Defendable> defendNPCs = new ArrayList<>();
		
		attackNPCs.add(new GuardNPC());
		attackNPCs.add(new SoliderNPC());
		
		defendNPCs.add(new TownNPC());
		
		
		
		
	}
	
	public static void townMonsterAttackEvent(ArrayList<Monster> m, ArrayList<Defendable> townNPCs, 
						ArrayList<Attackable> attackNPCs) {
		
		for (Defendable d : townNPCs) {
			d.defend();
		}
		
		for (int i = 0 ; i < m.size(); i++) {
			attackNPCs.get(i).attack(m.get(i));
		}
	}
}
