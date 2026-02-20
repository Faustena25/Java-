class Student {
    String name;
    int age;
    String course;
    
    void displayAdmission() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println();
    }
}

public class Test1 {
    public static void main(String[] args) {
        Student s1 = new Student();
        s1.name = "Alice";
        s1.age = 19;
        s1.course = "Mathematics";
        
        Student s2 = new Student();
        s2.name = "Bob";
        s2.age = 21;
        s2.course = "Physics";
        
        s1.displayAdmission();
        s2.displayAdmission();
    }
}