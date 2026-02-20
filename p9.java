class Student6 {
    String name;
    int studentId;
    static int counter = 1000;
    
    Student6(String n) {
        name = n;
        studentId = ++counter;
    }
    
    void display() {
        System.out.println("ID: " + studentId + ", Name: " + name);
    }
}

public class p9 {
    /**
     * @param args
     */
    public static void main(String[] args) {
        Student6 s1 = new Student6("tina");
        Student6 s2 = new Student6("terasia");
        Student6 s3 = new Student6("Carlin");
        
        s1.display();
        s2.display();
        s3.display();
    }
}