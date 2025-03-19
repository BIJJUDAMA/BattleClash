package battleclash;

import java.util.Random;

class Enemy extends Character {
    private Random random = new Random();

    public Enemy(String name) {
        super(name, 80, 12, 3);
    }

    @Override
    public void attack(Character target) {
        int attackType = random.nextInt(2); // 0 = normal attack, 1 = strong attack

        if (attackType == 0) {
            System.out.println(name + " attacks with " + attackPower + " power!");
            target.takeDamage(attackPower);
        } else {
            int strongAttackPower = attackPower * 2;
            System.out.println(name + " uses a STRONG ATTACK with " + strongAttackPower + " power!");
            target.takeDamage(strongAttackPower);
        }
    }
}

