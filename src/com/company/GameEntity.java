package com.company;

public class GameEntity  {

    private String Attack;
    private int health;
    private int damage;

    public String getAttack() {
        return Attack;
    }

    public void setAttack(String attack) {
        Attack = attack;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getDamage() {
        return damage;
    }

    public void setDamage(int damage) {
        this.damage = damage;
    }
}