package com.toasternetwork.example2;

public class Main {
	public static void main(String[] args) {
		Bomb bomb = new Bomb();
		Gun gun = new Gun();

		bomb.activate(true);
		gun.activate(true);
		bomb.fireWeapon(10);
		gun.fireWeapon(5);
		bomb.fireWeapon();
		gun.fireWeapon();
	}
}
