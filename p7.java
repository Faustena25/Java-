class Student5 {
    String name;
    String course;
    
    Student5(String n, String c) {
        name = n;
        course = c;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
    }
}

public class p7 {
    public static void main(String[] args) {
        Student5 s1 = new Student5("Jo jo", "CSE");
        s1.display();
    }
}