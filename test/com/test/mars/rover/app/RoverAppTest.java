package com.test.mars.rover.app;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.main.mars.rover.app.location.RoverLocation;
import com.main.mars.rover.app.services.MoveRover;

public class RoverAppTest {
	
	@Test
	public void roverTest() {
		 
		MoveRover mr =  new MoveRover();
		RoverLocation rl = mr.moveRover("3,4,N", "f,f,r,f,b");
		assertEquals(3, rl.getXcord());
	}


}
