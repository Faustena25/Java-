class student {
    void applyAdmission() {
        System.out.println("Applying for admission.");
    }   
    void verifyDocuments() {
        System.out.println("Verifying documents.");
    }

}
class UgStudent extends student {
    void checkElegibility() {
        System.out.println("Checking undergraduate eligibility.");
    }
    void payfees() {
        System.out.println("Paying undergraduate fees.");
    }
}
class PgStudent extends student {
    void checkElegibility() {
        System.out.println("Checking postgraduate eligibility.");
    }
    void payfees() {
        System.out.println("Paying postgraduate fees.");
    }
}
public class day4b {
    public static void main(String[] args) {
        UgStudent ug = new UgStudent();
        ug.applyAdmission();
        ug.verifyDocuments();
        ug.checkElegibility();
        ug.payfees();

        System.out.println();

        PgStudent pg = new PgStudent();
        pg.applyAdmission();
        pg.verifyDocuments();
        pg.checkElegibility();
        pg.payfees();
    }
}
