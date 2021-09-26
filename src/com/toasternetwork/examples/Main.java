package com.toasternetwork.examples;

import java.util.*;

public class Main {

    private static final Random random;
    private static Superman superman;
    private static Batman batman;

    static {
        random = new Random();
        superman = new Superman(random.nextInt(1000) + 1, random.nextInt(10) + 1);
        batman = new Batman(random.nextInt(1000) + 1, random.nextInt(10) + 1);
    }

    public static void main(String[] args) {
        superman.getStats();
        batman.getStats();
        while(!superman.getIsDead() && !batman.getIsDead()) {
            if(random.nextInt(100) % 4 == 0) superman.doublePunch(batman);
            else superman.attack(batman);

            if(random.nextInt(100) % 4 == 0) batman.regenerateHealth();
            else batman.attack(superman);

            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        if(superman.getIsDead())
            superman.announceDefeat();
        if(batman.getIsDead())
            batman.announceDefeat();
    }
}
