package app;

public class App {
    public static void main(String[] args) throws Exception {
        
        System.out.println("Start first loop");
        
        for (int i=1; i<=10; i=i+1){
            if (i==5){
                System.out.println("five");
            }
            else {
                System.out.println(i);

    }
}

        System.out.println("End first loop");
        System.out.println("Start second loop");

        for (int i=100; i<=200; i=i+10){
            System.out.println(i);
            if (i==150){
                for (int j=151; j<=159; j=j+1)
                System.out.println(j);
            }

        }

        System.out.println("End second loop");
}
}
