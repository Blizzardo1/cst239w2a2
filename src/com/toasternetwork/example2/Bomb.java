package com.toasternetwork.example2;

public class Bomb extends Weapon {
	@Override
	public void fireWeapon() {
		System.out.println("In overloaded Bomb.fireWeapon()");
		super.fireWeapon(10);
	}

	@Override
	public void fireWeapon(int power) {
		System.out.printf("In Bomb.fireWeapon() with a power of %d\n", power);
	}

	@Override
	public void activate(boolean enable) {
		System.out.printf("Bomb.activate? %s\n", enable ? "Yes" : "No");
	}
}
