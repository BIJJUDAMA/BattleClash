package battleclash;

import java.util.Scanner;

class Player extends Character {
    private int healCount = 3; // Limit healing

    public Player(String name) {
        super(name, 100, 15, 5);
    }

    @Override
    public void attack(Character target) {
        System.out.println(name + " attacks with " + attackPower + " power!");
        target.takeDamage(attackPower);
    }

    public void strongAttack(Character target) {
        int strongAttackPower = attackPower * 2;
        System.out.println(name + " uses a STRONG ATTACK with " + strongAttackPower + " power!");
        target.takeDamage(strongAttackPower);
    }

    public void heal() {
        if (healCount > 0) {
            health += 20;
            healCount--;
            System.out.println(name + " heals! Health is now: " + health + ". Heals left: " + healCount);
        } else {
            System.out.println("No more heals left!");
        }
    }
}

