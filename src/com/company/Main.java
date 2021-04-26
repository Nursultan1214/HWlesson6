package com.company;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Boss Boss = new Boss();
        Boss.setHealth(660);
        Boss.setDamage(44);
        Boss.setAttack("flash");
        System.out.println("Информация про босса:  " + Boss.getHealth()  +  Boss.getAttack()  +  Boss.getDamage());
    }
}
