package app;

public class App {
    public static void main(String[] args) throws Exception { 
        int count = 0;
        String color = "red";
        boolean trueOrFalse = false;

        while (count < 10){
            System.out.println("The count is " + count);
            count = count + 1;

        }
        
        System.out.println("Count Finished");


        while (color == "red"){
            System.out.println("The color is " + color);
            color = "green";
        }

        System.out.println("Color finished");


        while (trueOrFalse == false){
            System.out.println("The answer is " + trueOrFalse);
            trueOrFalse = true;
        }

        System.out.println("True or False Finished");

    }
}