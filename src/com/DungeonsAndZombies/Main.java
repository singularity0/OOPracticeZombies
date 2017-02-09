package com.DungeonsAndZombies;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero hero = new Hero("Bron", "Dragonslayer", 100, 100, 2);
        System.out.print(hero.knownAs());
    }
}
