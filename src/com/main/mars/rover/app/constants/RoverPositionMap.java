package com.main.mars.rover.app.constants;

import java.util.HashMap;

public final class RoverPositionMap {
	
	public HashMap<String, String[]> roverPosConst() {
		
		HashMap<String, String[]> rovIns = new HashMap<String, String[]>();
		
		//North co-ordinates
		rovIns.put("Nf", new String[] {"0","1","N"});
		rovIns.put("Nb", new String[] {"0","-1","N"});
		rovIns.put("Nr", new String[] {"0","0","E"});
		rovIns.put("Ni", new String[] {"0","0","W"});
		
		//East co-ordinates
		rovIns.put("Ef", new String[] {"1","0","E"});
		rovIns.put("Eb", new String[] {"-1","0","E"});
		rovIns.put("Er", new String[] {"0","0","S"});
		rovIns.put("Ei", new String[] {"0","0","N"});
		
		//West co-ordinates
		rovIns.put("Wf", new String[] {"-1","0","W"});
		rovIns.put("Wb", new String[] {"1","0","W"});
		rovIns.put("Wr", new String[] {"0","0","N"});
		rovIns.put("Wi", new String[] {"0","0","S"});
		
		//South co-ordinates
		rovIns.put("Sf", new String[] {"0","-1","S"});
		rovIns.put("Sb", new String[] {"0","1","S"});
		rovIns.put("Sr", new String[] {"0","0","W"});
		rovIns.put("Si", new String[] {"0","0","E"});
		
		return rovIns;
	}	
	
}
