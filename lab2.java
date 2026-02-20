class Student {
    String name;
    int age;
    String course;
}

public class lab2 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Tina ";
        s1.age = 20;
        s1.course = "Data Science";
        
        System.out.println("Name: " + s1.name);
        System.out.println("Age: " + s1.age);
        System.out.println("Course: " + s1.course);
    }
}