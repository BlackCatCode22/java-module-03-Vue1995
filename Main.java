// sV 12Sep2024
// Main.java
import myanimals.Animal;
import myanimals.Cat;
import myanimals.Dog;
import mystudent.Student;
import mystudent.App;

public class Main {
    public static void main(String[] args) {
    System.out.printf("\nHello and welcome from the Main\n");

        // Create a student object.
        Student student = new Student();

        // Create an object from a runnable class.
        App app = new App();

        // Use a method from the Student class.
        // I know that I have a static method in the Student class
        // and I know how to call a static method
        Student.sayHello();

        // Call a method that belongs to the student object
        student.sayHi();

        //Output the number of animals
        System.out.println("\nThe number of animals before work created is " + Animal.numOfAnimals);

        // Create a Cat object and call a method to make the cat make a sound
        Cat myCat = new Cat();
        System.out.println("\nThis sound is coming from the Cat object named myCat\n");
        myCat.animalSound();

        // Do the same thing for Dog object
        Dog myDog = new Dog();
        System.out.println("\nThis sound is coming from the Dog object named myDog\n");
        myDog.animalSound();

        //Output the number of animals
        System.out.println("\nThe number of animals after work created is " + Animal.numOfAnimals);

    }
}