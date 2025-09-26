package Task2;

/**
 * Hands-On Practice: If-Else Statement
 *
 * LEARNING OBJECTIVES:
 * 1. Understand if-else statement syntax
 * 2. Practice handling both true and false conditions
 * 3. Learn to provide alternative actions
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Try changing values to test both conditions
 */

public class ElseStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== IF-ELSE STATEMENT EXERCISES ===\n");

        // TODO 1: Age Check
        // Write if-else to check if age >= 18
        // Print "Adult" if true, "Minor" if false
        int age = 16;
        // Your code here:
        if (age >= 18) {
            System.out.println("Adult");
        } else {
            System.out.println("Minor");
        }


        // TODO 2: Temperature Check
        // Write if-else to check if temperature > 25
        // Print "Hot weather" if true, "Cool weather" if false
        double temperature = 22.5;
        // Your code here:
        if (temperature > 25) {
            System.out.println("Hot weather");
        } else {
            System.out.println("Cool weather");
        }


        // TODO 3: Password Validation
        // Write if-else to check if password length >= 8
        // Print "Valid password" if true, "Password too short" if false
        String password = "abc123";
        // Your code here:
        if (password.length() >= 8) {
            System.out.println("Valid password");
        } else {
            System.out.println("Password too short");
        }


        // TODO 4: Number Check
        // Write if-else to check if number is positive (> 0)
        // Print "Positive number" if true, "Non-positive number" if false
        int number = -5;
        // Your code here:
        if (number > 0) {
            System.out.println("Positive number");
        } else {
            System.out.println("Non-positive number");
        }


        // TODO 5: Grade Evaluation
        // Write if-else to check if grade >= 70
        // Print "Pass" if true, "Fail" if false
        int grade = 65;
        // Your code here:
        if (grade >= 70) {
            System.out.println("Pass");
        } else {
            System.out.println("Fail");
        }


        // TODO 6: Array Size Check
        // Write if-else to check if array length > 5
        // Print "Large array" if true, "Small array" if false
        String[] colors = {"red", "blue", "green"};
        // Your code here:
        if (colors.length > 5) {
            System.out.println("Large array");
        } else {
            System.out.println("Small array");
        }


        // TODO 7: String Comparison
        // Write if-else to check if name equals "Admin"
        // Print "Welcome Admin!" if true, "Regular user" if false
        String name = "User";
        // Your code here:
        if (name.equals("Admin")) {
            System.out.println("Welcome Admin!");
        } else {
            System.out.println("Regular user");
        }


        // TODO 8: Boolean Check
        // Write if-else to check if isOnline is true
        // Print "User is online" if true, "User is offline" if false
        boolean isOnline = false;
        // Your code here:
        if (isOnline) {
            System.out.println("User is online");
        } else {
            System.out.println("User is offline");
        }


        // TODO 9: Score Category
        // Write if-else to check if score >= 80
        // Print "Excellent" if true, "Needs improvement" if false
        int score = 75;
        // Your code here:
        if (score >= 80) {
            System.out.println("Excellent");
        } else {
            System.out.println("Needs improvement");
        }


        // TODO 10: Discount Eligibility
        // Write if-else to check if purchaseAmount >= 100
        // Print "Eligible for discount" if true, "No discount available" if false
        double purchaseAmount = 85.50;
        // Your code here:
        if (purchaseAmount >= 100) {
            System.out.println("Eligible for discount");
        } else {
            System.out.println("No discount available");
        }

    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * if (condition) {
 *     // code if condition is true
 * } else {
 *     // code if condition is false
 * }
 *
 * KEY POINTS:
 * - Else block executes only when if condition is false
 * - Only one block (if or else) will execute
 * - Every if can have an optional else
 */
