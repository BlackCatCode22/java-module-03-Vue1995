// sV 17Sep2024
// MainClassPractice.java

public class MainClassPractice {
    public static void main(String[] args) {

        System.out.println("\nWelcome to my OOP Class Practice Program.");

        // Create a couple Dog objects
        // with an empty arguments
        Dog myDog = new Dog();
        Dog anotherDog = new Dog();

        // Create a dog with a String name

        Dog aDog = new Dog("Spot");

        //Output the new dog's objects name
        System.out.println("\nThe new dog's name is: " + aDog.getName());

        // Create a fourth dog with an int age.
        Dog fourthDog = new Dog(33);
        System.out.println("\nMy new dog's age is " + fourthDog.getAge());

        // Create a fifth /last dog
        Dog fifthDog = new Dog( "Betty", 7);

        // Validate it
        System.out.println("\nMy last dog's name is " + fifthDog.getName() + ", and her age is " + fifthDog.getAge());

        // Give our dog a birthday (add a year to its age)
        fifthDog.setAge(fifthDog.getAge() + 1);
        System.out.println("\nMy dog " + fifthDog.getName() + " had a birthday and her age is now " + fifthDog.getAge());
    }
}