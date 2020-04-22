package app;

public class App {
    public static void main(String[] args) throws Exception { 
        System.out.println("Start first loop");
        
        for (int i=20; i>=1; i=i-1){
            System.out.println(i);
            if (i==10){
                for (int j=0; j<7; j++){
                System.out.println(i);
                }
            }
        }
        
        System.out.println("End first loop");
        System.out.println("Start second loop");

        for (int i=0; i<=9; i=i+1){
            if (i%3==1){
                System.out.println("Hey");
            }
            System.out.println((i+(2*i)+(i-(i*2)))*2);
        }
        System.out.println("End second loop");
    }
}