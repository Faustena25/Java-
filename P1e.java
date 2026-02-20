public class P1e {
    
    
    public static void task1_DisplayArguments(String[] args) {
        System.out.println("1: Display Command-Line Arguments ");
        
        if (args.length == 0) {
            System.out.println("No arguments provided!");
        } else {
            System.out.println("Number of arguments: " + args.length);
            System.out.println("\nArguments received:");
            
            for (int i = 0; i < args.length; i++) {
                System.out.println("args[" + i + "] = " + args[i]);
            }
        }
        System.out.println();
    }
    
    public static void task2_AddNumbers(String[] args) {
        System.out.println("2: Add Two Numbers Using Arguments ");
        
        if (args.length < 2) {
            System.err.println("ERROR: Two numbers required!");
            System.out.println("Usage: java CommandLineArgsDemo <num1> <num2>");
        } else {
            try {
                int num1 = Integer.parseInt(args[0]);
                int num2 = Integer.parseInt(args[1]);
                int sum = num1 + num2;
                
                System.out.println("First number: " + num1);
                System.out.println("Second number: " + num2);
                System.out.println("Sum: " + num1 + " + " + num2 + " = " + sum);
            } catch (NumberFormatException e) {
                System.err.println("ERROR: Please provide valid numbers!");
            }
        }
        System.out.println();
    }
    
    public static void task3_MultiplyNumbers(String[] args) {
        System.out.println("3: Multiply Two Numbers ");
        
        if (args.length < 2) {
            System.err.println("ERROR: Two numbers required for multiplication!");
            System.out.println("Usage: java CommandLineArgsDemo <num1> <num2>");
        } else {
            try {
                double num1 = Double.parseDouble(args[0]);
                double num2 = Double.parseDouble(args[1]);
                double product = num1 * num2;
                
                System.out.println("First number: " + num1);
                System.out.println("Second number: " + num2);
                System.out.println("Product: " + num1 + " × " + num2 + " = " + product);
                System.out.printf("Product (formatted): %.2f%n", product);
            } catch (NumberFormatException e) {
                System.err.println("ERROR: Please provide valid numbers!");
            }
        }
        System.out.println();
    }
    
    

    public static void task4_NameAndAge(String[] args) {
        System.out.println("4: Print Name and Age via Arguments ");
        
        if (args.length < 2) {
            System.err.println("ERROR: Name and age required!");
            System.out.println("Usage: java CommandLineArgsDemo <name> <age>");
        } else {
            try {
                String name = args[0];
                int age = Integer.parseInt(args[1]);
                
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("\nWelcome, " + name + "!");
                System.out.println("You are " + age + " years old.");
                
            } catch (NumberFormatException e) {
                System.err.println("ERROR: Age must be a valid number!");   
        }
        System.out.println();
    }
    
    }
    public static void task5_CountArguments(String[] args) {
        System.out.println("5: Count Command-Line Arguments ");
        
        int count = args.length;
        
        System.out.println("Total number of arguments: " + count);
        
        if (count == 0) {
            System.out.println("No arguments provided.");
        } else if (count == 1) {
            System.out.println("One argument provided: " + args[0]);
        } else {
            System.out.println("Multiple arguments provided:");
            for (int i = 0; i < count; i++) {
                System.out.println("  " + (i + 1) + ". " + args[i]);
            }
        }
        
        System.out.println("\nArgument Statistics:");
        System.out.println("Total arguments: " + count);
        System.out.println("Total characters: " + getTotalCharacters(args));
        System.out.println();
    }
    
    private static int getTotalCharacters(String[] args) {
        int total = 0;
        for (String arg : args) {
            total += arg.length();
        }
        return total;
    }
    
    
    public static void task6_AverageOfThree(String[] args) {
        System.out.println("6: Average of Three Arguments ");
        
        if (args.length < 3) {
            System.err.println("ERROR: Three numbers required!");
            System.out.println("Usage: java CommandLineArgsDemo <num1> <num2> <num3>");
        } else {
            try {
                double num1 = Double.parseDouble(args[0]);
                double num2 = Double.parseDouble(args[1]);
                double num3 = Double.parseDouble(args[2]);
                
                double sum = num1 + num2 + num3;
                double average = sum / 3;
                
                System.out.println("Number 1: " + num1);
                System.out.println("Number 2: " + num2);
                System.out.println("Number 3: " + num3);
                System.out.println("\nSum: " + sum);
                System.out.println("Average: " + average);
                System.out.printf("Average (formatted): %.2f%n", average);
            } catch (NumberFormatException e) {
                System.err.println("ERROR: Please provide valid numbers!");
            }
        }
        System.out.println();
    }
    
    
    
    public static void task7_HandleMissingArguments(String[] args) {
        System.out.println("7: Handle Missing Arguments ");
        
        final int REQUIRED_ARGS = 4;
        
        if (args.length < REQUIRED_ARGS) {
            System.err.println("ERROR: Insufficient arguments!");
            System.err.println("Required: " + REQUIRED_ARGS + " arguments");
            System.err.println("Provided: " + args.length + " arguments");
            System.out.println("\nUsage: java CommandLineArgsDemo <name> <age> <city> <salary>");
            System.out.println("Example: java CommandLineArgsDemo John 25 NewYork 50000");
            
            // Show which arguments are missing
            System.out.println("\nMissing arguments:");
            String[] argNames = {"name", "age", "city", "salary"};
            for (int i = args.length; i < REQUIRED_ARGS; i++) {
                System.out.println("  - " + argNames[i]);
            }
        } else {
            try {
                String name = args[0];
                int age = Integer.parseInt(args[1]);
                String city = args[2];
                double salary = Double.parseDouble(args[3]);
                
                System.out.println("✓ All arguments received successfully!");
                System.out.println("\n--- Personal Information ---");
                System.out.println("Name: " + name);
                System.out.println("Age: " + age);
                System.out.println("City: " + city);
                System.out.printf("Salary: $%.2f%n", salary);
            } catch (NumberFormatException e) {
                System.err.println("ERROR: Invalid data format!");
                System.err.println("Age and salary must be valid numbers.");
            }
        }
        System.out.println();
    }
    
    
    public static void task8_FindMaximum(String[] args) {
        System.out.println("8: Find Maximum of Two Arguments ");
        
        if (args.length < 2) {
            System.err.println("ERROR: Two numbers required!");
            System.out.println("Usage: java CommandLineArgsDemo <num1> <num2>");
        } else {
            try {
                double num1 = Double.parseDouble(args[0]);
                double num2 = Double.parseDouble(args[1]);
                
                double max = (num1 > num2) ? num1 : num2;
                double min = (num1 < num2) ? num1 : num2;
                
                System.out.println("First number: " + num1);
                System.out.println("Second number: " + num2);
                System.out.println("\nMaximum: " + max);
                System.out.println("Minimum: " + min);
                System.out.println("Difference: " + (max - min));
            } catch (NumberFormatException e) {
                System.err.println("ERROR: Please provide valid numbers!");
            }
        }
        System.out.println();
    }
    
    
    public static void task9_InterestCalculation(String[] args) {
        System.out.println("9: Interest Calculation Using Arguments ");
        
        if (args.length < 3) {
            System.err.println("ERROR: Three values required!");
            System.out.println("Usage: java CommandLineArgsDemo <principal> <rate> <time>");
            System.out.println("Example: java CommandLineArgsDemo 10000 5.5 3");
        } else {
            try {
                double principal = Double.parseDouble(args[0]);
                double rate = Double.parseDouble(args[1]);
                double time = Double.parseDouble(args[2]);
                
                // Simple Interest = (P × R × T) / 100
                double simpleInterest = (principal * rate * time) / 100;
                
                // Compound Interest = P(1 + R/100)^T - P
                double compoundInterest = principal * Math.pow((1 + rate / 100), time) - principal;
                
                System.out.println("--- Input Values ---");
                System.out.printf("Principal Amount: $%.2f%n", principal);
                System.out.printf("Rate of Interest: %.2f%%%n", rate);
                System.out.printf("Time Period: %.2f years%n", time);
                
                System.out.println("\n--- Simple Interest ---");
                System.out.printf("Interest: $%.2f%n", simpleInterest);
                System.out.printf("Total Amount: $%.2f%n", (principal + simpleInterest));
                
                System.out.println("\n--- Compound Interest ---");
                System.out.printf("Interest: $%.2f%n", compoundInterest);
                System.out.printf("Total Amount: $%.2f%n", (principal + compoundInterest));
                
            } catch (NumberFormatException e) {
                System.err.println("ERROR: Please provide valid numeric values!");
            }
        }
        System.out.println();
    }
    
    
    public static void task10_ReverseArguments(String[] args) {
        System.out.println("10: Reverse Command-Line Arguments ");
        
        if (args.length == 0) {
            System.out.println("No arguments to reverse!");
        } else {
            System.out.println("Original Arguments:");
            for (int i = 0; i < args.length; i++) {
                System.out.println("  args[" + i + "] = " + args[i]);
            }
            
            System.out.println("\nReversed Arguments:");
            for (int i = args.length - 1; i >= 0; i--) {
                System.out.println("  args[" + i + "] = " + args[i]);
            }
            
            // Also reverse each string
            System.out.println("\nReversed Strings:");
            for (int i = 0; i < args.length; i++) {
                String reversed = new StringBuilder(args[i]).reverse().toString();
                System.out.println("  " + args[i] + " → " + reversed);
            }
        }
        System.out.println();
    }
    
    
    // Main method - runs all tasks with sample data
    public static void main(String[] args) {
        
     
        System.out.println("   COMMAND-LINE ARGUMENTS DEMONSTRATION        ");
       
        
        // Check if arguments are provided
        if (args.length == 0) {
            System.out.println("No command-line arguments provided!");
            System.out.println("Running demonstrations with sample data...\n");
            
            // Sample demonstrations
            System.out.println("DEMONSTRATION MODE - Using sample data\n");
            System.out.println("=".repeat(60) + "\n");
            
            // Task 1
            task1_DisplayArguments(new String[]{"Hello", "World", "Java", "2026"});
            
            // Task 2
            task2_AddNumbers(new String[]{"25", "35"});
            
            // Task 3
            task3_MultiplyNumbers(new String[]{"12.5", "4.2"});
            
            // Task 4
            task4_NameAndAge(new String[]{"Tina", "28"});
            
            // Task 5
            task5_CountArguments(new String[]{"arg1", "arg2", "arg3", "arg4", "arg5"});
            
            // Task 6
            task6_AverageOfThree(new String[]{"85", "90", "78"});
            
            // Task 7
            task7_HandleMissingArguments(new String[]{"Anu "});
            
            // Task 8
            task8_FindMaximum(new String[]{"45.5", "78.9"});
            
            // Task 9
            task9_InterestCalculation(new String[]{"10000", "7.5", "5"});
            
            // Task 10
            task10_ReverseArguments(new String[]{"Java", "Python", "C++", "JavaScript"});
            
        } else {
            // Run with actual command-line arguments
            System.out.println("Command-line arguments detected!");
            System.out.println("Running with provided arguments...\n");
            System.out.println("=".repeat(60) + "\n");
            
            // Run all tasks with actual arguments
            task1_DisplayArguments(args);
            task2_AddNumbers(args);
            task3_MultiplyNumbers(args);
            task4_NameAndAge(args);
            task5_CountArguments(args);
            task6_AverageOfThree(args);
            task7_HandleMissingArguments(args);
            task8_FindMaximum(args);
            task9_InterestCalculation(args);
            task10_ReverseArguments(args);
        }

    
    }
}
