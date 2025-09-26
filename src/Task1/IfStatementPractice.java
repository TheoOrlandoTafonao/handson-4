package Task1;
/**
 * Hands-On Practice: If Statement
 *
 * LEARNING OBJECTIVES:
 * 1. Understand basic if statement syntax
 * 2. Practice writing conditions using comparison operators
 * 3. Learn to make decisions based on conditions
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Experiment with different values
 */

public class IfStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== IF STATEMENT EXERCISES ===\n");

        // TODO 1: Age Verification
        // Write an if statement to check if someone can vote (age >= 18)
        // Print "You are eligible to vote!" if condition is true
        int age = 20;
        // Your code here:
        if (age >= 18) {
            System.out.println("You are eligible to vote!");
        }


        // TODO 2: Password Strength
        // Write an if statement to check if password length is at least 8 characters
        // Print "Password is strong enough!" if condition is true
        String password = "mypassword123";
        // Your code here:
        if (password.length() >= 8) {
            System.out.println("Password is strong enough!");
        }

        // TODO 3: Grade Check
        // Write an if statement to check if grade is 'A'
        // Print "Excellent grade!" if condition is true
        char grade = 'A';
        // Your code here:
        if (grade == 'A') {
            System.out.println("Excellent grade!");
        }

        // TODO 4: Number Sign
        // Write an if statement to check if a number is positive (> 0)
        // Print "Number is positive!" if condition is true
        int number = 15;
        // Your code here:
        if (number > 0) {
            System.out.println("Number is positive!");
        }


        // TODO 5: Temperature Check
        // Write an if statement to check if temperature is above 30 degrees
        // Print "It's hot today!" if condition is true
        double temperature = 32.5;
        // Your code here:
        if (temperature > 30) {
            System.out.println("It's hot today!");
        }

        // TODO 6: Array Length
        // Write an if statement to check if array has more than 3 elements
        // Print "Array has sufficient elements!" if condition is true
        int[] numbers = {1, 2, 3, 4, 5};
        // Your code here:
        if (numbers.length > 3) {
            System.out.println("Array has sufficient elements!");
        }

        // TODO 7: String Check
        // Write an if statement to check if name equals "John"
        // Print "Hello John!" if condition is true
        String name = "John";
        // Your code here:
        if (name.equals("John")) {
            System.out.println("Hello John!");
        }

        // TODO 8: Boolean Check
        // Write an if statement to check if isStudentActive is true
        // Print "Student is active!" if condition is true
        boolean isStudentActive = true;
        // Your code here:
        if (isStudentActive) {
            System.out.println("Student is active!");
        }

        // TODO 9: Score Range
        // Write an if statement to check if score is between 80 and 100 (inclusive)
        // Print "High score achieved!" if condition is true
        int score = 85;
        // Your code here:
        if (score >= 80 && score <= 100) {
            System.out.println("High score achieved!");
        }

        // TODO 10: Complex Condition
        // Write an if statement to check if student is eligible for scholarship
        // Conditions: GPA >= 3.5 AND age <= 25
        // Print "Eligible for scholarship!" if condition is true
        double gpa = 3.7;
        int studentAge = 22;
        // Your code here:
        if (gpa >= 3.5 && studentAge <= 25) {
            System.out.println("Eligible for scholarship!");
        }

    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * if (condition) {
 *     // code to execute if condition is true
 * }
 *
 * COMPARISON OPERATORS:
 * ==   (equal to)
 * !=   (not equal to)
 * >    (greater than)
 * <    (less than)
 * >=   (greater than or equal to)
 * <=   (less than or equal to)
 *
 * LOGICAL OPERATORS:
 * &&   (AND)
 * ||   (OR)
 * !    (NOT)
 *
 * STRING COMPARISON:
 * Use .equals() method: string1.equals(string2)
 */
