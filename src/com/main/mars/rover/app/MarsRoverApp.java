package com.main.mars.rover.app;

import java.util.logging.Level;
import java.util.logging.Logger;

import com.main.mars.rover.app.location.RoverLocation;
import com.main.mars.rover.app.services.InputValidator;
import com.main.mars.rover.app.services.MoveRover;

public class MarsRoverApp {
	private static final Logger LOGGER = Logger.getLogger(InputValidator.class.getName());

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		
		if (InputValidator.validate(args)) {
			
			String currLocation = args[0];
			String moveStream = args[1];
			moveStream = moveStream.toLowerCase();
			
			MoveRover movRov = new MoveRover();
			RoverLocation finalRovLoc = movRov.moveRover(currLocation, moveStream);
			
			LOGGER.log(Level.INFO,  finalRovLoc.toString());
			
		}
	}


}