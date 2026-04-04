package PracticeProjects;

import java.util.Scanner;
import java.util.Map;
import java.util.List;
import java.util.HashMap;
import java.util.Arrays;

/*
 * This is my first attempt at creating a Java game.
 *
 * This program allows two players to:
 * - Enter their usernames
 * - Choose and customize their characters (hair, outfit, skin color, accessories)
 *
 * The game will include:
 * - A maximum of three rounds per match
 * - Each player selects a skill during each round
 * - Some skills are more powerful than others
 * - Players earn points (in thousands) based on the skill used
 *
 * At the end of the three rounds, the system calculates and displays the winner.
 */

public class StreetFighterGame {

    enum Category {
        CHARACTERS
    }

    public static final Map<Category, List<String>> WORDS = new HashMap<>();

    static {
        WORDS.put(Category.CHARACTERS, Arrays.asList(
                "Demon Slayer",
                "Chef Tame",
                "Skylar Mine",
                "Sofie",
                "Red dragon",
                "Hunter"
        ));
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String name1;
        String name2;


        System.out.println("-----------------WELCOME PLAYER 1 ----------------");
        System.out.print("Player 1 - Enter your username: ");
        name1 = scanner.nextLine();


        List<String> characters = WORDS.get(Category.CHARACTERS);

        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i + 1) + ". " + characters.get(i));
        }

        System.out.print("Choose a character: ");
        int choice1 = scanner.nextInt();
        scanner.nextLine();

        while (choice1 < 1 || choice1 > characters.size()) {
            System.out.println("Invalid choice. There are only " + characters.size() + " characters.");
            System.out.print("Choose again: ");
            choice1 = scanner.nextInt();
            scanner.nextLine();
        }

        String selectedCharacter1 = characters.get(choice1 - 1);

        System.out.println("You are " + selectedCharacter1 + ", press 'Enter' to customize your character\n");
        scanner.nextLine();


        System.out.println("-----------------WELCOME PLAYER 2----------------");
        System.out.print("Player 2 - Enter your username: ");
        name2 = scanner.nextLine();


        for (int i = 0; i < characters.size(); i++) {
            System.out.println((i + 1) + ". " + characters.get(i));
        }

        System.out.print("Choose a character: ");
        int choice2 = scanner.nextInt();
        scanner.nextLine();

        while (choice2 < 1 || choice2 > characters.size()) {
            System.out.println("Invalid choice. There are only " + characters.size() + " characters.");
            System.out.print("Choose again: ");
            choice2 = scanner.nextInt();
            scanner.nextLine();

        }
        String selectedCharacter2 = characters.get(choice2 - 1);
        System.out.println("You are " + selectedCharacter2 + ", press 'Enter' to customize your character\n");
        scanner.nextLine();


        scanner.close();
    }
}