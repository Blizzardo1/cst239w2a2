package com.toasternetwork.example2;

public class Gun extends Weapon {
	@Override
	public void fireWeapon() {
		System.out.println("In overloaded Gun.fireWeapon()");
		super.fireWeapon(5);
	}

	@Override
	public void fireWeapon(int power) {
		System.out.printf("In Gun.fireWeapon() with a power of %d\n", power);
	}

	@Override
	public void activate(boolean enable) {
		System.out.printf("Gun.activate? %s\n", enable ? "Yes" : "No");
	}
}
