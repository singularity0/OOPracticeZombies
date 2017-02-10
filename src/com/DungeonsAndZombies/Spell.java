package com.DungeonsAndZombies;


public class Spell extends FightTool {

    private int manaCost;
    private int castRange;


    public Spell(String name, int damage, int manaCost, int castRange){
        super(name, damage);

        this.manaCost = manaCost;
        this.castRange = castRange;
    }

    public int getManaCost(){ return  this.manaCost;}
}
