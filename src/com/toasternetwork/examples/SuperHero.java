package com.toasternetwork.examples;

import java.util.*;

/**
 * A Generic class for an Entity
 */
public class SuperHero {
	private static final Random sRandom;

	private final String name;
	private int health;
	private int level;
	private boolean isDead;
	private double xp;
	private double nextLevel;

	private SuperHero previousOpponent;
	private int previousDamage;

	static {
		sRandom = new Random();
	}

	/**
	 * A new SuperHero
	 * @param name The name of the SuperHero
	 * @param health The initial health of the SuperHero
	 * @param level The initial level of the SuperHero
	 */
	public SuperHero(String name, int health, int level) {
		this.name = name;
		this.health = health;
		this.level = level;
		this.nextLevel = level * 15;
	}

	public String getName() {
		return name;
	}

	public int getHealth() {
		return health;
	}

	public int getLevel() {
		return level;
	}

	public boolean getIsDead() {
		return isDead;
	}

	public void getStats() {
		System.out.printf("%s:\n\tHealth:%d\n\tLevel:%d\n\n", name, health, level);
	}

	/**
	 * Levels up the player or enemy by number of levels
	 * @param level The number of levels to level up by
	 */
	public void levelUp(int level) {
		this.level += level;
		this.nextLevel = level * 15;
		heal((this.level * 2) + 10);
		System.out.printf("%s levels up to Level %d!\n", name, level);
	}

	private void determineHealth(int damage) {
		if(health -damage <= 0) {
			health = 0;
			isDead = true;
			return;
		}

		health -= damage;
	}

	/**
	 * Admit Defeat! D:
	 */
	public void announceDefeat() {
		System.out.printf("%s has been defeated by %s.\n", name, previousOpponent.name);
	}

	/**
	 * Heals the enemy or player
	 * @param hp Hit Points
	 */
	public void heal(int hp) {
		health += hp;
		System.out.printf("%s healed by %d HP; now at %d\n", name, hp, health);
	}

	/**
	 * Attack!!!!!!
	 * @param opponent The enemy or player to attack.
	 */
	public void attack(SuperHero opponent) {
		attack(opponent, 1);
	}

	public void attack(SuperHero opponent, int amplifier) {
		OptionalInt dRand = sRandom.ints(1,(level * 5) + 1).findFirst();
		int damage = 0;
		if(dRand.isPresent())
			damage = dRand.getAsInt() * amplifier;
		opponent.determineHealth(damage);
		this.xp += damage / 4.5f;
		if(this.xp >= nextLevel) {
			levelUp((int)Math.floor(1 + (this.xp / nextLevel)));
		}

		System.out.printf("[XP: %f] %s whooped %s worth %d hp. %s's health is now %d\n", xp, name, opponent.name, damage, opponent.name, opponent.health);
		previousOpponent = opponent;
		previousDamage = damage;
	}
}
