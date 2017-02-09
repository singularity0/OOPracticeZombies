package com.DungeonsAndZombies;


public class Spell {

    private String name;
    private int damage;
    private int manaCost;
    private int castRange;


    public Spell(String name, int damage, int manaCost, int castRange){
        this.name = name;
        this.damage = damage;
        this.manaCost = manaCost;
        this.castRange = castRange;
    }
}
