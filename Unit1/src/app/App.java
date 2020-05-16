package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        
        dog1.name = "Tigger";
        dog1.breed = "boarder collie mix";
        dog1.age = 5;

        dog2.name = "Ringo";
        dog2.breed = "boxer red heeler mix";
        dog2.age = 10;

        dog3.name = "Stamps";
        dog3.breed = "corgi";
        dog3.age = 3;

        System.out.println("Dog 1 is named " + (dog1.name) + ". He is a " + (dog1.breed) + " and is " + dog1.age + " years old.");
        System.out.println("Dog 2 is named " + (dog2.name) + ". He is a " + (dog2.breed) + " and is " + dog2.age + " years old.");
        System.out.println("Dog 3 is named " + (dog3.name) + ". He is a " + (dog3.breed) + " and is " + dog3.age + " years old.");

}
}


