import java.util.Scanner;

class Student {
    String name;
    int age;
    String course;
    
    // Constructor
    Student(String n, int a, String c) {
        name = n;
        age = a;
        course = c;
    }
    
    void display() {
        System.out.println("\n Student Details");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
    }
}

public class Exercise1_ClassAndObjects {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("EXERCISE 1: Class and Objects \n");
        System.out.print("How many students? ");
        int n = sc.nextInt();
        sc.nextLine(); // consume newline
        
        Student[] students = new Student[n];
        
        for (int i = 0; i < n; i++) {
            System.out.println("\nEnter details for Student " + (i + 1) + ":");
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Age: ");
            int age = sc.nextInt();
            sc.nextLine();
            System.out.print("Course: ");
            String course = sc.nextLine();
            
            students[i] = new Student(name, age, course);
        }
        
        System.out.println("\n Displaying All Students");
        for (Student s : students) {
            s.display();
        }
        
        sc.close();
    }
}