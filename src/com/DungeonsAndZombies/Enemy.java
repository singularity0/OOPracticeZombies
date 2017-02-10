package com.DungeonsAndZombies;


public class Enemy extends Creature {

    private int damage;


    public Enemy(int health, int mana, int damage){
        super(health, mana);

        this.damage = damage;
    }


}
