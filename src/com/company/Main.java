package com.company;

public class Main {

    public static void main(String[] args) {
	Boss boss =new Boss();
    boss.setHealt(500);
    boss.setDamage(250);
    boss.weapon.setNameOfWeopon("Snayper");
    boss.weapon.setTypeWeopons("Type Avtamat");
        System.out.println(boss.getHealt()+ boss.weapon.getNameOfWeopon()+boss.getDamage()+boss.weapon.getTypeWeopons());
    }
}
