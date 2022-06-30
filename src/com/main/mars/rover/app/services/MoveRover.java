package com.main.mars.rover.app.services;

import java.util.HashMap;
import java.util.logging.Level;
import java.util.logging.Logger;

import com.main.mars.rover.app.constants.RoverPositionMap;
import com.main.mars.rover.app.location.RoverLocation;


public class MoveRover {
	
	static Logger LOGGER = Logger.getLogger(MoveRover.class.getName());

	public RoverLocation moveRover(String currLoc, String moveStream) {
		
		String[] curLoc = currLoc.split(",");
		LOGGER.log(Level.INFO, "current location is" + currLoc);
		
		RoverLocation rovLoc = new RoverLocation(Integer.parseInt(curLoc[0]), Integer.parseInt(curLoc[1]), curLoc[2].toUpperCase());
				
		String[] mvIns = moveStream.split(",");
		RoverPositionMap rvPosMap = new RoverPositionMap();
		HashMap<String, String[]> rovPos =  rvPosMap.roverPosConst();
		
		
		String[] cordChange = {};
		String hashkey = "";
		
		for (String ins : mvIns) {
			hashkey = rovLoc.getDir() + ins ;
			cordChange = rovPos.get(hashkey);
			rovLoc.setXcord(rovLoc.getXcord() + Integer.parseInt(cordChange[0]));
			rovLoc.setYcord(rovLoc.getYcord() + Integer.parseInt(cordChange[1]));
			rovLoc.setDir(cordChange[2]);
			
		}
		
		
		return rovLoc;
		
	}
}
