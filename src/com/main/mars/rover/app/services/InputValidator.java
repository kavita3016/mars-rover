package com.main.mars.rover.app.services;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.logging.Level;
import java.util.logging.Logger;

public class InputValidator {

	private static final Logger LOGGER = Logger.getLogger(InputValidator.class.getName());

	public static boolean validate(String[] args) {

		// Check if two strings are provided as initial input
		if (args.length == 2) {

			// Check if X axis, Y axis and direction is provided as first input
			String[] currLocation = args[0].split(",");

			if (currLocation.length == 3) {

				try {
					Integer.parseInt(currLocation[0]);
					Integer.parseInt(currLocation[1]);

					// Create set of valid directions
					Set<String> validDirections = new HashSet<>();
					validDirections.addAll(Arrays.asList("N", "E", "W", "S"));

					if (!validDirections.contains(currLocation[2].toUpperCase())) {
						LOGGER.log(Level.SEVERE, "Invalid direction is provided: {0}", currLocation[2]);
						return false;
					}

				} catch (NumberFormatException e) {
					LOGGER.log(Level.SEVERE, "Given value for location is not proper number. X-Axis: {0} Y-Axis: {1}",
							currLocation);
					return false;
				}
			} else {
				LOGGER.log(Level.SEVERE, "Invalid number of parameters are provided in first String : {0}", args[0]);
				return false;
			}

			// Check if valid move instructions are provided as second input
			String[] moveInstructions = args[1].split(",");

			// Create set of valid move instructions
			Set<String> validMoveInstructions = new HashSet<>();
			validMoveInstructions.addAll(Arrays.asList("F", "B", "R", "L"));

			for (String str : moveInstructions) {
				if (!validMoveInstructions.contains(str.toUpperCase())) {
					LOGGER.log(Level.SEVERE, "Invalid move instruction is provided: {0}", str);
					return false;
				}
			}
			LOGGER.fine("All inputs are valid for move instructions given to rover.");

		} else {
			LOGGER.log(Level.SEVERE, "Invalid number of parameters are provided: {}", args);
			return false;
		}
		return true;
	}
}
