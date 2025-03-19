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
        int reducedDamage = Math.max(damage - defense, 0);
        health -= reducedDamage;
        System.out.println(name + " took " + reducedDamage + " damage! Health left: " + Math.max(health, 0));
    }

    public abstract void attack(Character target);
}

