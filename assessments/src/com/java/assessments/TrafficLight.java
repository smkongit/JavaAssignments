package com.java.assessments;

/*Classes and Objects 

1)	Write an enum type TrafficLight, 
whose constants (RED, GREEN, YELLOW) take one parameter—the duration of the light. 
Write a program to test the TrafficLight enum so that it displays the enum 
constants and their durations.
*/
public enum TrafficLight {
	RED(10),
	GREEN(20),
	YELLOW(30);
	
	private int duration;

	private TrafficLight(int duration) {
		this.duration = duration;
	}

	public int getDuration() {
		return duration;
	}
	public static void main(String[] args) {
		System.out.println("Traffic light durations are as follows: ");
		
		for (TrafficLight lightColor: TrafficLight.values()) {
			System.out.printf("%s\t%d seconds\n", lightColor, lightColor.getDuration());
		}
	}
}
