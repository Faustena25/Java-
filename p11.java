class Student8 {
    String name;
    String course;
    
    Student8(String n, String c) {
        name = n;
        course = c;
    }
    
    void displayDetails() {
        System.out.println("Name: " + name + ", Course: " + course);
    }
    
    void updateCourse(String newCourse) {
        course = newCourse;
        System.out.println("Course updated to: " + course);
    }
}

public class p11 {
    public static void main(String[] args) {
        Student8 s1 = new Student8("Tom", "Mathematics");
        s1.displayDetails();
        s1.updateCourse("Physics");
        s1.displayDetails();
    }
}