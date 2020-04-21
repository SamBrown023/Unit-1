package app;

public class App {
    public static void main(String[] args) throws Exception { 
        System.out.println("Start first loop");

        for (int i=0; i<=22; i=i+1){

            for (int x=0; x<=9; x=x+0)
            System.out.println(x);

            if (i>=16){
                    System.out.println("10");
                }
                else{
                    System.out.println(i);
                }
            }

        System.out.println("End first loop");
        System.out.println("Start Second loop");

       for (int i=0; i<=13; i=i+1){
        
          if (i%2==0 ){
              System.out.println(i-1+(i/2));
             }
        else System.out.println((i*2)/3);
            
        }
    }
}
    
        
        


        

    
