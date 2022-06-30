package com.main.mars.rover.app.location;

public class RoverLocation {

	private int xcord;
	private int ycord;
	private String dir;

	public RoverLocation(int xcord, int ycord, String dir) {
		super();
		this.xcord = xcord;
		this.ycord = ycord;
		this.dir = dir;
	}
	
	public int getXcord() {
		return xcord;
	}

	public void setXcord(int xcord) {
		this.xcord = xcord;
	}

	public int getYcord() {
		return ycord;
	}

	public void setYcord(int ycord) {
		this.ycord = ycord;
	}

	public String getDir() {
		return dir;
	}

	public void setDir(String dir) {
		this.dir = dir;
	}

	@Override
	public String toString() {
		return "Final Rover Co-ordinates : " + getXcord() + ", " + getYcord() + "\r\n" + "Final Rover direction : " + getDir();
	}
}
