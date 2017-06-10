package level1;

import processing.core.PApplet;

public class Challenge extends Head {
	Roomba roomba;

	public static void main(String[] args) {
		PApplet.main("level1.Processing");
	}

	public Challenge(Roomba roomba) {
		super(roomba);
	}
	/**
	 * Without touching the wall reach the endZone
	 * use sleep an driveDirect 
	 */
	public void initialize() {
		driveDirect(200,200);
		sleep(3000);
		driveDirect(200,300);
		sleep(3000);
	    driveDirect(400,400);
	    sleep(3000);
	    driveDirect(100,200);
	    sleep(1000);
	    driveDirect(900,900);
	    sleep(1000);
	    driveDirect(500,600);
	}

	public void loop() {
	
	}
}
