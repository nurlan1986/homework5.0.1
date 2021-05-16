package com.geektech;

public class Main {

    public static void main(String[] args) {
        Boss boss = new Boss();
        boss.setHealth(500);
        boss.setDamage(100);
        boss.getSuperDefense();
        boss.printInfo();

        Hero[] array = new Hero[3];
        array = createHeroes();
        for (int i = 0; i < array.length; i++) {

            System.out.println("Damage: " + array[i].getDamage() + " Health: " + array[i].getHealth() + " Super power: " + array[i].getSuperPower());

        }



    }


    public static Hero[] createHeroes () {

        Hero hero = new Hero(300, 50, "Fast");
        Hero hero1 = new Hero(350, 60);
        Hero hero2 = new Hero(250, 40, "Strong");

        Hero[] heroes = new Hero[3];
        heroes[0] = hero;
        heroes[1] = hero1;
        heroes[2] = hero2;
        return heroes;

    }
}
