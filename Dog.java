public class Dog {
    // Create 2 fields for our Dog objects.

    private String name;
    private int age;

    // Create getters and setters for name
    public void setName(String name) {
        this.name = name;
    }
    public String getName() {
        return name;
    }

    // Create getter and setter for age
    public int getAge() {
        return age;
        // This would work as well because there is mo ambiguity
        // return age;
    }
    public void setAge(int age) {
        this.age = age;
    }

    // Create a constructor for the Dog objects that will be created with the "new" keyword
    // A constructor is a special method that is called or invoked whenever a Dog class is made
    public Dog() {
        System.out.println("\nA Dog object was created. This message is from the constructor.");
    }

    // Create a constructor that accepts a String data type for the Dog names
    public Dog(String myName) {
        this.name = myName;
    }

    // Create a constructor  that accepts an argument when an object is created. This argument will
    // be an int
    public Dog(int theAge) {
        this.age = theAge;
    }

    // Create a constructor that accepts 2 arguments - a String for the name, and an int for age.
    public Dog(String someName, int someAge) {

        // Assign name and age to our new object
        this.age = someAge;
        this.name = someName;
    }


}
