package Task5;

/**
 * Hands-On Practice: Ternary Operator
 *
 * LEARNING OBJECTIVES:
 * 1. Understand ternary operator syntax
 * 2. Practice writing concise conditional expressions
 * 3. Learn when to use ternary vs if-else
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Compare ternary operator with equivalent if-else
 */

public class TernaryOperatorPractice {
    public static void main(String[] args) {
        System.out.println("=== TERNARY OPERATOR EXERCISES ===\n");

        // TODO 1: Age Status
        // Use ternary operator to assign "Adult" or "Minor" based on age >= 18
        int age = 20;
        String ageStatus = (age >= 18) ? "Adult" : "Minor"; // Complete this line
        System.out.println("Age status: " + ageStatus);


        // TODO 2: Number Sign
        // Use ternary operator to assign "Positive" or "Non-positive" based on number > 0
        int number = -5;
        String numberSign = (number > 0) ? "Positive" : "Non-positive"; // Complete this line
        System.out.println("Number sign: " + numberSign);


        // TODO 3: Grade Pass/Fail
        // Use ternary operator to assign "Pass" or "Fail" based on score >= 70
        int score = 85;
        String result = (score >= 70) ? "Pass" : "Fail"; // Complete this line
        System.out.println("Result: " + result);


        // TODO 4: Temperature Description
        // Use ternary operator to assign "Hot" or "Cool" based on temperature > 25
        double temperature = 22.5;
        String tempDesc = (temperature > 25) ? "Hot" : "Cool"; // Complete this line
        System.out.println("Temperature: " + tempDesc);


        // TODO 5: Even or Odd
        // Use ternary operator to assign "Even" or "Odd" based on number % 2 == 0
        int num = 15;
        String evenOdd = (num % 2 == 0) ? "Even" : "Odd"; // Complete this line
        System.out.println("Number is: " + evenOdd);


        // TODO 6: Discount Eligibility
        // Use ternary operator to assign discount amount: 10 if amount >= 100, else 0
        double purchaseAmount = 150.0;
        double discount = (purchaseAmount >= 100) ? 10 : 0; // Complete this line
        System.out.println("Discount: $" + discount);


        // TODO 7: String Length Check
        // Use ternary operator to assign "Long" or "Short" based on length > 5
        String text = "Hello World";
        String lengthStatus = (text.length() > 5) ? "Long" : "Short"; // Complete this line
        System.out.println("String length: " + lengthStatus);


        // TODO 8: Maximum of Two Numbers
        // Use ternary operator to find maximum between two numbers
        int a = 25;
        int b = 30;
        int maximum = (a > b) ? a : b; // Complete this line
        System.out.println("Maximum: " + maximum);


        // TODO 9: Absolute Value
        // Use ternary operator to get absolute value (positive version) of a number
        int value = -42;
        int absoluteValue = (value < 0) ? -value : value;  // Complete this line
        System.out.println("Absolute value: " + absoluteValue);


        // TODO 10: Nested Ternary
        // Use nested ternary to assign grade: "A" if score >= 90, "B" if >= 80, else "C"
        int examScore = 88;
        String grade = (examScore >= 90) ? "A" : (examScore >= 80) ? "B" : "C"; // Complete this line
        System.out.println("Grade: " + grade);


        // TODO 11: Boolean to String
        // Use ternary operator to convert boolean to "Yes" or "No"
        boolean isActive = true;
        String activeStatus = (isActive) ? "Yes" : "No"; // Complete this line
        System.out.println("Active: " + activeStatus);


        // TODO 12: Minimum of Three Numbers
        // Use ternary operator to find minimum among three numbers
        int x = 15, y = 8, z = 12;
        int minimum = (x < y) ? ((x < z) ? x : z) : ((y < z) ? y : z); // Complete this line (hint: use nested ternary)
        System.out.println("Minimum: " + minimum);

    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * variable = (condition) ? valueIfTrue : valueIfFalse;
 *
 * NESTED TERNARY:
 * variable = (condition1) ? value1 : (condition2) ? value2 : value3;
 *
 * KEY POINTS:
 * - Ternary operator is a shorthand for simple if-else
 * - Best used for simple assignments or return values
 * - Avoid complex nested ternary for readability
 * - Both valueIfTrue and valueIfFalse must be same type
 * - Condition must evaluate to boolean (true/false)
 *
 * WHEN TO USE:
 * - Simple conditional assignments
 * - One-line conditional returns
 * - Initializing variables with conditions
 *
 * WHEN NOT TO USE:
 * - Complex logic with multiple statements
 * - When readability would suffer
 * - When if-else is clearer
 */
