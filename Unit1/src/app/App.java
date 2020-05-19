package app;
import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {

        Dog dog1 = new Dog();
        Dog dog2 = new Dog();
        Dog dog3 = new Dog();
        
        dog1.name = "Tigger";
        dog1.breed = "border collie mix";
        dog1.age = 5;
        dog1.gender = "He";
        dog1.furColor = "black and white";
        dog1.eyeColor = "brown";

        dog2.name = "Ringo";
        dog2.breed = "boxer red heeler mix";
        dog2.age = 10;
        dog2.gender = "She";
        dog2.furColor = "brown and white";
        dog2.eyeColor = "brown";

        dog3.name = "Stamps";
        dog3.breed = "corgi";
        dog3.age = 3;
        dog3.gender = "He";
        dog3.furColor = "brown and white";
        dog3.eyeColor = "blue";

        System.out.println("Dog 1 is named " + (dog1.name) + ". " + (dog1.gender) + " is a " + (dog1.breed) + " and is " + dog1.age + " years old. " + (dog1.gender) + " has " + (dog1.furColor) + " fur and " + (dog1.eyeColor) + " eyes.");
        System.out.println("Dog 2 is named " + (dog2.name) + ". " + (dog2.gender) + " is a " + (dog2.breed) + " and is " + dog2.age + " years old. " + (dog2.gender) + " has " + (dog2.furColor) + " fur and " + (dog2.eyeColor) + " eyes.");
        System.out.println("Dog 3 is named " + (dog3.name) + ". " + (dog3.gender) + " is a " + (dog3.breed) + " and is " + dog3.age + " years old. " + (dog3.gender) + " has " + (dog3.furColor) + " fur and " + (dog3.eyeColor) + " eyes.");

}
}


