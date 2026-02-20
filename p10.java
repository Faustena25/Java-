class Student7 {
    String name;
    String course;
    boolean hostel;
    
    Student7(String n, String c) {
        name = n;
        course = c;
        hostel = false;
    }
    
    Student7(String n, String c, boolean h) {
        name = n;
        course = c;
        hostel = h;
    }
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Hostel: " + hostel);
        System.out.println();
    }
}

public class p10 {
    public static void main(String[] args) {
        Student7 s1 = new Student7("tina", "CSE");
        Student7 s2 = new Student7("Money", "ECE", true);
        
        s1.display();
        s2.display();
    }
}