package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Scanner input = new Scanner(System.in);

        System.out.println("Please enter 1st number");
        int numb1 = input.nextInt();

        System.out.println("Please enter 2nd number");
        int numb2 = input.nextInt();

        System.out.println("Please enter 1 to add, 2 to subtract, 3 to multiply, and 4 to divide");
        int func = input.nextInt();

        if (func == (1)){
            System.out.println(numb1+numb2);
        }

        if (func == (2)){
            System.out.println(numb1-numb2);
        }

        if (func == (3)){
            System.out.println(numb1*numb2);
        }

        if (func == (4)){
            System.out.println(numb1/numb2);
        }
}
}


