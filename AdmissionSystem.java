interface ScholarshipEligible {
    boolean isEligibleForScholarship();
}

abstract class StudentAdmission {
    abstract int calculateFee();
}

class Student extends StudentAdmission implements ScholarshipEligible {

    private String name;
    private int age;
    private String course;
    private final int admissionNumber;

    Student(String name, int age, String course, int admissionNumber) {
        this.name = name;
        this.admissionNumber = admissionNumber;
        setAge(age);
        this.course = course;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age >= 17) {
            this.age = age;
        } else {
            System.out.println("Invalid age. Minimum age is 17.");
        }
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public int getAdmissionNumber() {
        return admissionNumber;
    }

    int calculateFee() {
        return 10000;
    }

    public boolean isEligibleForScholarship() {
        return age < 22;
    }

    void displayDetails() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Course: " + course);
        System.out.println("Admission No: " + admissionNumber);
        System.out.println("Fee: " + calculateFee());
        System.out.println("Scholarship Eligible: " + isEligibleForScholarship());
    }
}

class UndergraduateStudent extends Student {

    UndergraduateStudent(String name, int age, String course, int admissionNumber) {
        super(name, age, course, admissionNumber);
    }

    int calculateFee() {
        return 15000;
    }
}

class PostgraduateStudent extends Student {

    PostgraduateStudent(String name, int age, String course, int admissionNumber) {
        super(name, age, course, admissionNumber);
    }

    int calculateFee() {
        return 20000;
    }
}

public class AdmissionSystem {
    public static void main(String[] args) {

        Student s1 = new UndergraduateStudent("Eleven", 19, "B.Tech", 101);
        Student s2 = new PostgraduateStudent("Mike", 23, "M.Tech", 102);

        s1.displayDetails();
        System.out.println();
        s2.displayDetails();
    }
}
