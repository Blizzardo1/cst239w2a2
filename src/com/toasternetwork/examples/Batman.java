package com.toasternetwork.examples;

/**
 * BATMAN! BANG POW CRUSH!
 */
public class Batman extends SuperHero {
	/**
	 * DUNUNUNUNUNUNUNU DUNUNUNUNUNUNUNU BATMAN!
	 *
	 * @param health Infinity; Batman can't die
	 * @param level  Max Level because Batman!
	 */
	public Batman(int health, int level) {
		super("Batman", health, level);
	}

	public void regenerateHealth() {
		super.heal(2 * getLevel());
	}
}
