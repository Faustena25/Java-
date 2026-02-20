import java.util.Scanner;

interface Transaction {
    void addTransaction(String description, double amount);
    void displayTransactions();
}

class Person {
    private String name;
    private int age;
    private String email;

    Person(String name, int age, String email) {
        this.name = name;
        this.age = age;
        this.email = email;
    }

    public String getName()  { return name; }
    public int getAge()      { return age; }
    public String getEmail() { return email; }

    public void setName(String name) {
        if (name != null && !name.isEmpty()) this.name = name;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) this.age = age;
    }

    public void setEmail(String email) {
        if (email.contains("@")) this.email = email;
    }

    public void displayInfo() {
        System.out.println("Name  : " + name);
        System.out.println("Age   : " + age);
        System.out.println("Email : " + email);
    }
}

class AccountHolder extends Person implements Transaction {
    private String accountNumber;
    private double balance;
    private String[] history = new String[50];
    private int historyCount = 0;

    AccountHolder(String name, int age, String email, String accountNumber, double initialDeposit) {
        super(name, age, email);
        this.accountNumber = accountNumber;
        this.balance = initialDeposit;
        if (initialDeposit > 0)
            history[historyCount++] = "Initial Deposit | $" + String.format("%.2f", initialDeposit);
    }

    public String getAccountNumber() { return accountNumber; }
    public double getBalance()       { return balance; }

    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            addTransaction("DEPOSIT", amount);
            System.out.printf("Deposited $%.2f | Balance: $%.2f%n", amount, balance);
        } else {
            System.out.println("Invalid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount <= 0) {
            System.out.println("Invalid amount.");
        } else if (amount > balance) {
            System.out.println("Insufficient funds. Balance: $" + String.format("%.2f", balance));
        } else {
            balance -= amount;
            addTransaction("WITHDRAWAL", amount);
            System.out.printf("Withdrew $%.2f | Balance: $%.2f%n", amount, balance);
        }
    }

    public void addTransaction(String description, double amount) {
        if (historyCount < history.length)
            history[historyCount++] = description + " | $" + String.format("%.2f", amount)
                    + " | Balance: $" + String.format("%.2f", balance);
    }

    public void displayTransactions() {
        System.out.println("\nTransactions for " + getName() + " [" + accountNumber + "]:");
        if (historyCount == 0) {
            System.out.println("  No transactions yet.");
        } else {
            for (int i = 0; i < historyCount; i++)
                System.out.println("  " + (i + 1) + ". " + history[i]);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("\nAccount Holder");
        super.displayInfo();
        System.out.println("Account No : " + accountNumber);
        System.out.printf("Balance    : $%.2f%n", balance);
    }
}

class LoanOfficer extends Person implements Transaction {
    private String employeeId;
    private String branch;
    private double totalLoans = 0;
    private String[] history = new String[50];
    private int historyCount = 0;

    LoanOfficer(String name, int age, String email, String employeeId, String branch) {
        super(name, age, email);
        this.employeeId = employeeId;
        this.branch = branch;
    }

    public String getEmployeeId() { return employeeId; }

    public void approveLoan(String applicant, double amount) {
        if (amount > 0) {
            totalLoans += amount;
            addTransaction("LOAN for " + applicant, amount);
            System.out.printf("Loan of $%.2f approved for %s.%n", amount, applicant);
        } else {
            System.out.println("Invalid loan amount.");
        }
    }

    public void addTransaction(String description, double amount) {
        if (historyCount < history.length)
            history[historyCount++] = description + " | $" + String.format("%.2f", amount);
    }

    public void displayTransactions() {
        System.out.println("\nLoan Records for " + getName() + " [" + employeeId + "]:");
        if (historyCount == 0) {
            System.out.println("  No records yet.");
        } else {
            for (int i = 0; i < historyCount; i++)
                System.out.println("  " + (i + 1) + ". " + history[i]);
        }
    }

    @Override
    public void displayInfo() {
        System.out.println("\nLoan Officer ");
        super.displayInfo();
        System.out.println("Employee ID : " + employeeId);
        System.out.println("Branch      : " + branch);
        System.out.printf("Total Loans : $%.2f%n", totalLoans);
    }
}

public class unit4_banking {
    static AccountHolder[] accounts = new AccountHolder[20];
    static LoanOfficer[]   officers = new LoanOfficer[20];
    static int accountCount = 0;
    static int officerCount = 0;
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println(" BANKING MANAGEMENT SYSTEM ");
        boolean running = true;

        while (running) {
            System.out.println("\n1. Add Account Holder");
            System.out.println("2. Add Loan Officer");
            System.out.println("3. Deposit");
            System.out.println("4. Withdraw");
            System.out.println("5. Approve Loan");
            System.out.println("6. View All Accounts");
            System.out.println("7. View All Loan Officers");
            System.out.println("8. Polymorphism Demo");
            System.out.println("9. Exit");
            System.out.print("Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: addAccount();       break;
                case 2: addOfficer();       break;
                case 3: deposit();          break;
                case 4: withdraw();         break;
                case 5: approveLoan();      break;
                case 6: viewAccounts();     break;
                case 7: viewOfficers();     break;
                case 8: polymorphismDemo(); break;
                case 9: running = false;    break;
                default: System.out.println("Invalid choice.");
            }
        }

        System.out.println("Goodbye!");
        sc.close();
    }

    static void addAccount() {
        if (accountCount >= accounts.length) { System.out.println("Account limit reached."); return; }
        System.out.print("Name: ");             String name    = sc.nextLine();
        System.out.print("Age: ");              int age        = sc.nextInt(); sc.nextLine();
        System.out.print("Email: ");            String email   = sc.nextLine();
        System.out.print("Account No: ");       String accNo   = sc.nextLine();
        System.out.print("Initial Deposit: $"); double deposit = sc.nextDouble(); sc.nextLine();

        accounts[accountCount++] = new AccountHolder(name, age, email, accNo, deposit);
        System.out.println("Account added!");
    }

    static void addOfficer() {
        if (officerCount >= officers.length) { System.out.println("Officer limit reached."); return; }
        System.out.print("Name: ");        String name   = sc.nextLine();
        System.out.print("Age: ");         int age       = sc.nextInt(); sc.nextLine();
        System.out.print("Email: ");       String email  = sc.nextLine();
        System.out.print("Employee ID: "); String empId  = sc.nextLine();
        System.out.print("Branch: ");      String branch = sc.nextLine();

        officers[officerCount++] = new LoanOfficer(name, age, email, empId, branch);
        System.out.println("Loan Officer added!");
    }

    static AccountHolder findAccount() {
        System.out.print("Account No: ");
        String accNo = sc.nextLine();
        for (int i = 0; i < accountCount; i++)
            if (accounts[i].getAccountNumber().equals(accNo)) return accounts[i];
        System.out.println("Account not found.");
        return null;
    }

    static LoanOfficer findOfficer() {
        System.out.print("Employee ID: ");
        String id = sc.nextLine();
        for (int i = 0; i < officerCount; i++)
            if (officers[i].getEmployeeId().equals(id)) return officers[i];
        System.out.println("Officer not found.");
        return null;
    }

    static void deposit() {
        AccountHolder a = findAccount();
        if (a == null) return;
        System.out.print("Amount: $");
        double amt = sc.nextDouble(); sc.nextLine();
        a.deposit(amt);
    }

    static void withdraw() {
        AccountHolder a = findAccount();
        if (a == null) return;
        System.out.print("Amount: $");
        double amt = sc.nextDouble(); sc.nextLine();
        a.withdraw(amt);
    }

    static void approveLoan() {
        LoanOfficer o = findOfficer();
        if (o == null) return;
        System.out.print("Applicant Name: "); String name = sc.nextLine();
        System.out.print("Loan Amount: $");   double amt  = sc.nextDouble(); sc.nextLine();
        o.approveLoan(name, amt);
    }

    static void viewAccounts() {
        if (accountCount == 0) { System.out.println("No accounts."); return; }
        for (int i = 0; i < accountCount; i++) {
            accounts[i].displayInfo();
            accounts[i].displayTransactions();
        }
    }

    static void viewOfficers() {
        if (officerCount == 0) { System.out.println("No officers."); return; }
        for (int i = 0; i < officerCount; i++) {
            officers[i].displayInfo();
            officers[i].displayTransactions();
        }
    }

    static void polymorphismDemo() {
        System.out.println("\n=== POLYMORPHISM DEMO ===");
        System.out.println("Same displayTransactions() method, different behaviour:\n");
        if (accountCount == 0 && officerCount == 0) {
            System.out.println("Add some records first!");
            return;
        }
        Transaction[] all = new Transaction[accountCount + officerCount];
        int idx = 0;
        for (int i = 0; i < accountCount; i++) all[idx++] = accounts[i];
        for (int i = 0; i < officerCount; i++)  all[idx++] = officers[i];
        for (Transaction t : all) t.displayTransactions();
    }
}