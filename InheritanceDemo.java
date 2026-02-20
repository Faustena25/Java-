
class Animal {
    String name;
    int age;
    
    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }
    
    public void eat() {
        System.out.println(name + " is eating.");
    }
    
    public void sleep() {
        System.out.println(name + " is sleeping.");
    }
    
    public void displayInfo() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

// Child class (Subclass) inheriting from Animal
class Dog extends Animal {
    String breed;
    
    public Dog(String name, int age, String breed) {
        super(name, age);  // Call parent constructor
        this.breed = breed;
    }
    
    // Method specific to Dog
    public void bark() {
        System.out.println(name + " is barking: Woof! Woof!");
    }
    
    // Overriding parent method
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Breed: " + breed);
    }
}

// Another child class
class Cat extends Animal {
    String color;
    
    public Cat(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    public void meow() {
        System.out.println(name + " is meowing: Meow! Meow!");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}

// Main class to test inheritance
public class InheritanceDemo {
    public static void main(String[] args) {
        // Create Dog object
        Dog dog = new Dog("Buddy", 3, "Golden Retriever");
        dog.displayInfo();
        dog.eat();
        dog.bark();
        
        System.out.println();
        
        // Create Cat object
        Cat cat = new Cat("Whiskers", 2, "White");
        cat.displayInfo();
        cat.sleep();
        cat.meow();
    }
}