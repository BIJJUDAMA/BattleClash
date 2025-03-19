package battleclash;

abstract class Character {
    protected String name;
    protected int health;
    protected int attackPower;
    protected int defense;
    
    public Character(String name, int health, int attackPower, int defense) {
        this.name = name;
        this.health = health;
        this.attackPower = attackPower;
        this.defense = defense;
    }
    
    public boolean isAlive() {
        return health > 0;
    }
    
    public void takeDamage(int damage) {
        health -= damage;
        if (health < 0) health = 0;
    }
    
    public abstract int attack();
}
