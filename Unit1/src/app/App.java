package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter a name");
        String name1 = input.nextLine();

        System.out.println("Please enter a 2nd name");
        String name2 = input.nextLine();

        System.out.println("Please enter a 3rd name");
        String name3 = input.nextLine();

        System.out.println("Please enter an adjective");
        String adj1 = input.nextLine();

        System.out.println("Please enter a 2nd adjective");
        String adj2 = input.nextLine();

        System.out.println("Please enter a 3rd adjective");
        String adj3 = input.nextLine();

        System.out.println("Please enter a noun");
        String noun1 = input.nextLine();

        System.out.println("Please enter a 2nd noun");
        String noun2 = input.nextLine();

        System.out.println("Please enter a 3rd noun");
        String noun3 = input.nextLine();

        System.out.println("Please enter a place");
        String place = input.nextLine();

        System.out.println("Please enter an action");
        String action = input.nextLine();

        System.out.println(name1 + " was a little " + adj1 + " " + noun1 + ". One day, they traveled to the " + place + " to " + action + " with their friends. " + name1 + "'s friends were " + name2 + ", a " + adj2 + " " + noun2 + ", and " + name3 + ", a " + adj3 + " " + noun3 + ". After they were done, " + name1 + ", " + name2 + ", and " + name3 + " said goodbye and went home.");
    }
}


