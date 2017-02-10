package com.DungeonsAndZombies;

public abstract class Creature {
    protected boolean isAlive;
    protected int health;
    protected int mana;
    protected Spell spell;

    public Creature(int health, int mana){
        this.isAlive = true;
        this.health = health;
        this.mana = mana;
    }

    public boolean isALive(){
        return this.isAlive;
    }

    public boolean canCast(){

        return this.getMana() > spell.getManaCost() ? true :false;
    }

    public int getMana() {
        return this.mana;
    }

    public int getHealth() {
        return this.health;
    }

    public Spell getpell(){return this.spell;}

    public void takeHealing(int healingPoints){
        this.health += healingPoints;
    }

    public void takeMana(){
        manaValidations();
    }

    private void manaValidations(){
        if (this.mana < 0){
            this.mana = 0;
        }
    }

    public int attack(FightTool fightTool){
        return fightTool.damage;
    }


}
