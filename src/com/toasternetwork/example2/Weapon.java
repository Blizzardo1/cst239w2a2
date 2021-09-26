package com.toasternetwork.example2;

public abstract class Weapon {
	public void fireWeapon() {
		System.out.println("In overloaded Weapon.fireWeapon()");
	}

	public void fireWeapon(int power) {
		System.out.printf("In Weapon.fireWeapon() with a power of %d\n", power);
	}

	public abstract void activate(boolean enable);
}
