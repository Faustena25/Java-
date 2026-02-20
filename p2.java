class Student {
    String name;
    String course;
}

class PostgraduateStudent extends Student {
    String specialization;
    
    void display() {
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Specialization: " + specialization);
    }
}

public class p2 {
    public static void main(String[] args) {
        PostgraduateStudent pg = new PostgraduateStudent();
        pg.name = "Tina";
        pg.course = "MDS";
        pg.specialization = "AI/ML";
        
        pg.display();
    }
}