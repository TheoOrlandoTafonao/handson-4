package Task3;

/**
 * Hands-On Practice: Else If Statement
 *
 * LEARNING OBJECTIVES:
 * 1. Understand else if statement syntax
 * 2. Practice handling multiple conditions sequentially
 * 3. Learn to create decision chains
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Try different values to test all conditions
 */

public class ElseIfStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== ELSE IF STATEMENT EXERCISES ===\n");

        // TODO 1: Grade Classification
        // Write if-else if-else to classify grades:
        // score >= 90: "A grade"
        // score >= 80: "B grade"
        // score >= 70: "C grade"
        // else: "F grade"
        int score = 85;
        // Your code here:
        if (score >= 90) {
            System.out.println("A grade");
        } else if (score >= 80) {
            System.out.println("B grade");
        } else if (score >= 70) {
            System.out.println("C grade");
        } else {
            System.out.println("F grade");
        }


        // TODO 2: Age Category
        // Write if-else if-else to categorize age:
        // age < 13: "Child"
        // age < 20: "Teenager"
        // age < 60: "Adult"
        // else: "Senior"
        int age = 25;
        // Your code here:
        if (age < 13) {
            System.out.println("Child");
        } else if (age < 20) {
            System.out.println("Teenager");
        } else if (age < 60) {
            System.out.println("Adult");
        } else {
            System.out.println("Senior");
        }


        // TODO 3: Temperature Description
        // Write if-else if-else for temperature:
        // temp > 35: "Very hot"
        // temp > 25: "Hot"
        // temp > 15: "Warm"
        // temp > 5: "Cool"
        // else: "Cold"
        double temperature = 18.5;
        // Your code here:
        if (temperature > 35) {
            System.out.println("Very hot");
        } else if (temperature > 25) {
            System.out.println("Hot");
        } else if (temperature > 15) {
            System.out.println("Warm");
        } else if (temperature > 5) {
            System.out.println("Cool");
        } else {
            System.out.println("Cold");
        }


        // TODO 4: BMI Classification
        // Write if-else if-else for BMI categories:
        // bmi >= 30: "Obese"
        // bmi >= 25: "Overweight"
        // bmi >= 18.5: "Normal"
        // else: "Underweight"
        double bmi = 22.5;
        // Your code here:
        if (bmi >= 30) {
            System.out.println("Obese");
        } else if (bmi >= 25) {
            System.out.println("Overweight");
        } else if (bmi >= 18.5) {
            System.out.println("Normal");
        } else {
            System.out.println("Underweight");
        }


        // TODO 5: Day Type
        // Write if-else if-else for day classification:
        // day 1 or 7: "Weekend"
        // day 2-6: "Weekday"
        // else: "Invalid day"
        int day = 3; // 1=Sunday, 2=Monday, etc.
        // Your code here:
        if (day == 1 || day == 7) {
            System.out.println("Weekend");
        } else if (day >= 2 && day <= 6) {
            System.out.println("Weekday");
        } else {
            System.out.println("Invalid day");
        }


        // TODO 6: Traffic Light
        // Write if-else if-else for traffic light colors:
        // "red": "Stop"
        // "yellow": "Caution"
        // "green": "Go"
        // else: "Invalid color"
        String lightColor = "yellow";
        // Your code here:
        if (lightColor.equals("red")) {
            System.out.println("Stop");
        } else if (lightColor.equals("yellow")) {
            System.out.println("Caution");
        } else if (lightColor.equals("green")) {
            System.out.println("Go");
        } else {
            System.out.println("Invalid color");
        }


        // TODO 7: Discount Rate
        // Write if-else if-else for purchase discounts:
        // amount >= 1000: "20% discount"
        // amount >= 500: "10% discount"
        // amount >= 100: "5% discount"
        // else: "No discount"
        double purchaseAmount = 750.0;
        // Your code here:
        if (purchaseAmount >= 1000) {
            System.out.println("20% discount");
        } else if (purchaseAmount >= 500) {
            System.out.println("10% discount");
        } else if (purchaseAmount >= 100) {
            System.out.println("5% discount");
        } else {
            System.out.println("No discount");
        }


        // TODO 8: Speed Category
        // Write if-else if-else for vehicle speed:
        // speed > 120: "Very fast"
        // speed > 80: "Fast"
        // speed > 50: "Moderate"
        // speed > 0: "Slow"
        // else: "Stopped"
        int speed = 95;
        // Your code here:
        if (speed > 120) {
            System.out.println("Very fast");
        } else if (speed > 80) {
            System.out.println("Fast");
        } else if (speed > 50) {
            System.out.println("Moderate");
        } else if (speed > 0) {
            System.out.println("Slow");
        } else {
            System.out.println("Stopped");
        }


        // TODO 9: Password Strength
        // Write if-else if-else for password strength:
        // length >= 12: "Very strong"
        // length >= 8: "Strong"
        // length >= 6: "Moderate"
        // else: "Weak"
        String password = "mypassword";
        // Your code here:
        if (password.length() >= 12) {
            System.out.println("Very strong");
        } else if (password.length() >= 8) {
            System.out.println("Strong");
        } else if (password.length() >= 6) {
            System.out.println("Moderate");
        } else {
            System.out.println("Weak");
        }


        // TODO 10: Student Performance
        // Write if-else if-else combining score and attendance:
        // score >= 90 AND attendance >= 95: "Excellent"
        // score >= 80 AND attendance >= 85: "Good"
        // score >= 70 AND attendance >= 75: "Satisfactory"
        // else: "Needs improvement"
        int studentScore = 88;
        int attendance = 90;
        // Your code here:
        if (studentScore >= 90 && attendance >= 95) {
            System.out.println("Excellent");
        } else if (studentScore >= 80 && attendance >= 85) {
            System.out.println("Good");
        } else if (studentScore >= 70 && attendance >= 75) {
            System.out.println("Satisfactory");
        } else {
            System.out.println("Needs improvement");
        }

    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * if (condition1) {
 *     // code for condition1
 * } else if (condition2) {
 *     // code for condition2
 * } else if (condition3) {
 *     // code for condition3
 * } else {
 *     // code if all conditions are false
 * }
 *
 * KEY POINTS:
 * - Conditions are checked in order from top to bottom
 * - Only the first true condition executes
 * - Use logical operators (&& || !) for complex conditions
 * - else is optional but recommended for completeness
 */
