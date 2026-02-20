import java.util.Scanner;

class Student {
    String name;
    int age;
    String course;

    Student(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }

    void display() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

// Main.java
public class 2la {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter details for Student 1:");
        System.out.print("Name: ");
        String name1 = sc.nextLine();

        System.out.print("Age: ");
        int age1 = sc.nextInt();
        sc.nextLine(); 

        System.out.print("Course: ");
        String course1 = sc.nextLine();


        System.out.println("\nStudent Details:");
        Student student1 = new Student(name1, age1, course1);
        student1.display();
        

        sc.close();
    }
}
