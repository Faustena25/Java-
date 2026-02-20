
class human  {
    String name;
    int age;
    
    public human (String name, int age) {
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

class men extends human {
    String breed;
    
    public men(String name, int age, String breed) {
        super(name, age); 
        this.breed = breed;
    }
    
    public void handsome() {
        System.out.println(name + " he is handsome .");
    }
    

}


class women extends human {
    String color;
    
    public women(String name, int age, String color) {
        super(name, age);
        this.color = color;
    }
    
    public void cute() {
        System.out.println(name + " She is cute !");
    }
    
    @Override
    public void displayInfo() {
        super.displayInfo();
        System.out.println("Color: " + color);
    }
}


public class day4 {
    public static void main(String[] args) {
        // Create Dog object
        men dog = new men("Buddy", 3, " softeware enginer");
        dog.displayInfo();
        dog.eat();
        dog.handsome();
        
        System.out.println();
        
        // Create Cat object
        women cat = new women("Whiskers", 2, " Devlopers");
        cat.displayInfo();
        cat.sleep();
        cat.cute();
    }
}
