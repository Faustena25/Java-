class Student4 {
    String name;
    int age;
    boolean admitted;
    
    void display() {
        System.out.println("Name: " + name + ", Age: " + age);
    }
}

public class p6 {
    public static void main(String[] args) {
        Student4[] students = new Student4[3];
        
        students[0] = new Student4();
        students[0].name = "tina";
        students[0].age = 20;
        students[0].admitted = true;
        
        students[1] = new Student4();
        students[1].name = "bolu";
        students[1].age = 19;
        students[1].admitted = false;
        
        students[2] = new Student4();
        students[2].name = "dolu";
        students[2].age = 21;
        students[2].admitted = true;
        
        System.out.println("Admitted Students:");
        for(int i = 0; i < students.length; i++) {
            if(students[i].admitted) {
                students[i].display();
            }
        }
    }
}