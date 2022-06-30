package com.test.mars.rover.app;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import com.main.mars.rover.app.services.InputValidator;

public class InputValidatorTest {	
	
	@Test
	public void testWhenInputHasMoreThanTwoStringsThenFailWithInvalidParameterNumberError() {
		String[] args= {"3,4,5,N","F,F,B,R,L","Wrong Input"};
		assertFalse(InputValidator.validate(args));
	}
	

	@Test
	public void testWhenInputHasFourValuesInLocationStringThenFailWithInvalidParameterError() {
		String[] args= {"3,4,5,N","F,F,B,R,L"};
		assertFalse(InputValidator.validate(args));
	}
	
	@Test
	public void testWhenInputHasInvalidNumberInLocationThenFailWithInvalidNumberError() {
		String[] args= {"3,D,N","F,F,B,R,L"};
		assertFalse(InputValidator.validate(args));
	}
	
	@Test
	public void testWhenInputHasInvalidDirectionThenFailWithInvalidLocationError() {
		String[] args= {"3,4,D","F,F,B,R,L"};
		assertFalse(InputValidator.validate(args));
	}
	
	@Test
	public void testWhenInputHasInvalidMoveInstructionsThenFailWithInvalidInstructionError() {
		String[] args= {"3,4,D","F,F,B,R,D,E"};
		assertFalse(InputValidator.validate(args));
	}
	
	@Test
	public void testWhenInputValidThenPassWithoutAnyError() {
		
		String[] args= {"3,4,N","F,F,B,R,L"};
		assertTrue(InputValidator.validate(args));
	}

}
