class Student1 {
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

public class p3 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        s1.name = "Tina";
        s1.age = 19;
        s1.course = "Data Science";
        
        Student1 s2 = new Student1();
        s2.name = "Sruthi";
        s2.age = 21;
        s2.course = "Maths";
        
        s1.displayAdmission();
        s2.displayAdmission();
    }
}