import java.util.Scanner;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void displayInfo() {
        System.out.println("Name: " + name);
        System.out.println("Age : " + age);
    }
}

class Student extends Person {
    String course;

    Student(String name, int age, String course) {
        super(name, age);
        this.course = course;
    }

    void displayInfo() {
        System.out.println("\n--- Student Details ---");
        super.displayInfo();
        System.out.println("Course: " + course);
    }
}

class Professor extends Person {
    String subject;

    Professor(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }

    void displayInfo() {
        System.out.println("\n--- Professor Details ---");
        super.displayInfo();
        System.out.println("Subject: " + subject);
    }
}

public class Exercise2 {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter Student Name: ");
        String sName = sc.nextLine();

        System.out.print("Enter Student Age: ");
        int sAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        Student s = new Student(sName, sAge, course);

        System.out.print("\nEnter Professor Name: ");
        String pName = sc.nextLine();

        System.out.print("Enter Professor Age: ");
        int pAge = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Subject: ");
        String subject = sc.nextLine();

        Professor p = new Professor(pName, pAge, subject);

        s.displayInfo();
        p.displayInfo();

        sc.close();
    }
}
