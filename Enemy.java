package battleclash;

import java.util.Random;

class Enemy extends Character {
    private Random random = new Random();
    
    public Enemy() {
        super("Dark Lord", 120, 20, 3);
    }
    
    @Override
    public int attack() {
        int chance = random.nextInt(100);
        
        if (chance < 5) { 
            System.out.println(name + " uses a deadly attack!");
            return -1; 
        }
        
        if (chance < 20) { 
            System.out.println(name + " uses a strong attack!");
            return attackPower * 2;
        }
        
        return attackPower;
    }
    
    public boolean shouldDebuff() {
        return random.nextInt(100) < 30; 
    }
    
    public boolean shouldRecover() {
        return health < 12 && random.nextInt(100) < 30; 
    }
    
    public void recoverHealth() {
        health = 90;
        System.out.println(name + " regenerates health! Now at " + health + " HP.");
    }
}
