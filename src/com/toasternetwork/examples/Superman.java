package com.toasternetwork.examples;

/**
 * SUUUUUPERRRRMAAAAAAN!
 */
public class Superman extends SuperHero {
	/**
	 * The one and only Superman!
	 *
	 * @param health The utmost health of Superman
	 * @param level  The Max Level of Superman
	 */
	public Superman(int health, int level) {
		super("Superman", health, level);
	}

	public void doublePunch(SuperHero opponent) {
		attack(opponent, 2);
	}
}
