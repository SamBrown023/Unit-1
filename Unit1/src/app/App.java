package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("What is 2 x 4?");
        String math = input.nextLine();
        if (math.equals("8")){
            System.out.println("Correct!");
        }
        else {
            System.out.println("Incorrect");
        }

        System.out.println("Who wrote 'Gulliver's Travels'?");
        String lit = input.nextLine();
        if (lit.equals("Jonathan Swift")){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Incorrect");
        }

        System.out.println("Who started the Protestant Revolution by famously nailing 95 theses to a church door?");
        String hist = input.nextLine();
        if (hist.equals("Martin Luther")){
            System.out.println("Correct!");
        }
        else{
            System.out.println("Incorrect");
        }


        }
        

    }
