package com.test.mars.rover.app;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.main.mars.rover.app.location.RoverLocation;
import com.main.mars.rover.app.services.MoveRover;

public class MarsRoverRunnerTest {
	
	@Test
	public void testWhenRoverMovesNorthForwardThenYAxisValueShouldBeIncremented() {
		String currentLocation= "3,4,N";
		String moveInstructions= "f,f";
		RoverLocation finalLocation =new RoverLocation(3,6,"N");
		
		assertEquals(new MoveRover().moveRover(currentLocation, moveInstructions).getYcord(), finalLocation.getYcord());
	}
	
	@Test
	public void testWhenRoverMovesNorthRightThenDirectionValueShouldBeEast() {
		String currentLocation= "3,4,N";
		String moveInstructions= "f,r";
		RoverLocation finalLocation =new RoverLocation(3,5,"E");
		
		assertEquals(new MoveRover().moveRover(currentLocation, moveInstructions).getDir(), finalLocation.getDir());
	}
	
	@Test
	public void testWhenRoverMovesWestForwardThenXAxisValueShouldBeDecremented() {
		String currentLocation= "3,4,W";
		String moveInstructions= "f,f";
		RoverLocation finalLocation =new RoverLocation(1,4,"W");
		
		assertEquals(new MoveRover().moveRover(currentLocation, moveInstructions).getXcord(), finalLocation.getXcord());
	}

}
