package app;

public class App {
    public static void main(String[] args) throws Exception { 
        
        for (int i=1; i<=20; i=i+1){
            if (i % 4 == 0){
                System.out.println(i + " is divisible by 4");
            }
            else{
                System.out.println(i + " is not divisible by 4");
            } 

        }

    }
}