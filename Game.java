package battleclash;

import java.util.Scanner;

public class Game {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String playerName = scanner.nextLine();

        Player player = new Player(playerName);
        Enemy enemy = new Enemy("Dark Lord");

        System.out.println("\nWelcome to the Battle Arena, " + player.name + "!");
        System.out.println("Your opponent is " + enemy.name + ". Fight!");

        while (player.isAlive() && enemy.isAlive()) {
            System.out.println("\n--- Your Turn ---");
            System.out.println("1. Normal Attack");
            System.out.println("2. Strong Attack");
            System.out.println("3. Heal");
            System.out.print("Choose your action: ");

            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    player.attack(enemy);
                    break;
                case 2:
                    player.strongAttack(enemy);
                    break;
                case 3:
                    player.heal();
                    break;
                default:
                    System.out.println("Invalid choice! You missed your turn.");
            }

            if (!enemy.isAlive()) {
                System.out.println("\nYou defeated " + enemy.name + "! Victory!");
                break;
            }

            System.out.println("\n--- Enemy's Turn ---");
            enemy.attack(player);

            if (!player.isAlive()) {
                System.out.println("\nYou were defeated by " + enemy.name + ". Game Over!");
                break;
            }
        }

        scanner.close();
    }
}
