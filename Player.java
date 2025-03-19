package battleclash;

import java.util.Random;

class Player extends Character {
    private int healCount = 3;
    private int attackDebuffTurns = 0;
    
    public Player(String name) {
        super(name, 100, 15, 5);
    }
    
    @Override
    public int attack() {
        if (attackDebuffTurns > 0) {
            attackDebuffTurns--;
            return attackPower / 2;
        }
        return attackPower;
    }
    
    public int strongAttack() {
        return attackPower * 2;
    }
    
    public void heal() {
        if (healCount > 0) {
            health += 30;
            if (health > 100) health = 100; 
            healCount--;
            System.out.println(name + " healed! Health is now: " + health);
        } else {
            System.out.println("No heals left!");
        }
    }
    
    public void applyDebuff() {
        attackDebuffTurns = new Random().nextInt(4) + 1;
        System.out.println(name + "'s attack is weakened for " + attackDebuffTurns + " turns!");
    }
}
