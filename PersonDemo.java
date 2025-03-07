// Person class definition
class Person {
    // Attributes
    String name;
    int age;

    // Parameterized Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Default Constructor
    public Person() {
        this.name = "Unknown";
        this.age = 0;
    }

    // Method to display person details
    public void displayPerson() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Main class
public class PersonDemo {
    public static void main(String[] args) {
        // Create a Person object using the parameterized constructor
        Person person1 = new Person("Bob", 30);

        // Create another Person object using the default constructor
        Person person2 = new Person();

        // Display information of both objects
        person1.displayPerson();
        person2.displayPerson();
    }
}
