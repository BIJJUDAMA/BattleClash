package battleclash;

import java.util.Random;
import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        String playerName;
        do {
            System.out.print("Enter your name: ");
            playerName = scanner.nextLine().trim();
        } while (playerName.isEmpty()); // Ensure name is not empty
        
        Player player = new Player(playerName);
        Enemy enemy = new Enemy();
        
        System.out.println("Welcome, " + player.name + "! Prepare to battle the Dark Lord!");
        
        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\n" + player.name + "'s Health: " + player.health);
            System.out.println(enemy.name + "'s Health: " + enemy.health);
            
            System.out.println("Choose action: 1) Attack  2) Strong Attack  3) Heal");
            int choice = scanner.nextInt();
            int damage;
            
            switch (choice) {
                case 1:
                    damage = player.attack();
                    enemy.takeDamage(damage);
                    System.out.println(player.name + " attacks for " + damage + " damage!");
                    break;
                case 2:
                    damage = player.strongAttack();
                    enemy.takeDamage(damage);
                    System.out.println(player.name + " lands a strong attack for " + damage + " damage!");
                    break;
                case 3:
                    player.heal();
                    break;
                default:
                    System.out.println("Invalid choice! Turn skipped.");
            }
            
            if (!enemy.isAlive()) {
                System.out.println("You have defeated the Dark Lord! You win!");
                break;
            }
            
            System.out.println("\nDark Lord's Turn...");
            damage = enemy.attack();
            
            if (damage == -1) { // Special attack
                player.takeDamage((int) (player.health * 0.9));
                System.out.println("Dark Lord executes a deadly strike! Your health is now: " + player.health);
            } else {
                player.takeDamage(damage);
                System.out.println("Dark Lord attacks for " + damage + " damage!");
            }
            
            if (!player.isAlive()) {
                System.out.println("You were defeated by the Dark Lord. Game Over!");
                break;
            }
            
            if (enemy.shouldDebuff()) {
                player.applyDebuff();
            }
            
            if (enemy.shouldRecover()) {
                enemy.recoverHealth();
            }
        }
        
        scanner.close();
    }
}
