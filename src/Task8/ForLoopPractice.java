package Task8;

/**
 * Hands-On Practice: For Loop
 *
 * LEARNING OBJECTIVES:
 * 1. Understand for loop syntax and components
 * 2. Practice initialization, condition, and increment
 * 3. Learn different for loop patterns
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Experiment with different increment patterns
 */

public class ForLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== FOR LOOP EXERCISES ===\n");

        // TODO 1: Basic For Loop
        // Write a for loop to print numbers 1 to 10
        System.out.println("TODO 1: Print 1 to 10");
        // Your code here:
        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        System.out.println();

        // TODO 2: Even Numbers
        // Write a for loop to print even numbers from 2 to 20
        System.out.println("TODO 2: Even numbers 2 to 20");
        // Your code here:
        for (int i = 2; i <= 20; i += 2) {
            System.out.println(i);
        }


        System.out.println();

        // TODO 3: Countdown
        // Write a for loop to count down from 10 to 1
        System.out.println("TODO 3: Countdown 10 to 1");
        // Your code here:
        for (int i = 10; i >= 1; i--) {
            System.out.println(i);
        }


        System.out.println();

        // TODO 4: Skip Count
        // Write a for loop to print multiples of 5 from 5 to 50
        System.out.println("TODO 4: Multiples of 5 (5 to 50)");
        // Your code here:
        for (int i = 5; i <= 50; i += 5) {
            System.out.println(i);
        }


        System.out.println();

        // TODO 5: Array Processing
        // Write a for loop to print all elements in the array
        System.out.println("TODO 5: Print array elements");
        int[] numbers = {10, 20, 30, 40, 50};
        // Your code here:

        for (int i = 0; i < numbers.length; i++) {
            System.out.println(numbers[i]);
        }


        System.out.println();

        // TODO 6: Sum Calculation
        // Write a for loop to calculate sum of numbers 1 to 100
        System.out.println("TODO 6: Sum of 1 to 100");
        int sum = 0;
        // Your code here:
        for (int i = 1; i <= 100; i++) {
            sum += i; // tambahkan i ke sum
        }



        System.out.println("Sum: " + sum);
        System.out.println();

        // TODO 7: Factorial
        // Write a for loop to calculate factorial of 6 (6!)
        System.out.println("TODO 7: Factorial of 6");
        int factorial = 1;
        // Your code here:
        for (int i = 1; i <= 6; i++) {
            factorial *= i; // kalikan factorial dengan i
        }


        System.out.println("6! = " + factorial);
        System.out.println();

        // TODO 8: String Iteration
        // Write a for loop to print each character in "HELLO" on separate lines
        System.out.println("TODO 8: Print each character in 'HELLO'");
        String word = "HELLO";
        // Your code here:
        for (int i = 0; i < word.length(); i++) {
            System.out.println(word.charAt(i));
        }


        System.out.println();

        // TODO 9: Multiplication Table
        // Write a for loop to print multiplication table for 7 (7x1 to 7x10)
        System.out.println("TODO 9: Multiplication table for 7");
        // Your code here:
        for (int i = 1; i <= 10; i++) {
            System.out.println("7 x " + i + " = " + (7 * i));
        }


        System.out.println();

        // TODO 10: Nested For Loops
        // Write nested for loops to print a 4x4 grid of asterisks
        System.out.println("TODO 10: 4x4 grid of asterisks");
        // Your code here:
        for (int row = 1; row <= 4; row++) {
            for (int col = 1; col <= 4; col++) {
                System.out.print("* ");
            }
            System.out.println();
        }


        System.out.println();

        // TODO 11: Array Sum
        // Write a for loop to calculate sum of array elements
        System.out.println("TODO 11: Sum of array elements");
        int[] values = {15, 25, 35, 45, 55};
        int arraySum = 0;
        // Your code here:
        for (int i = 0; i < values.length; i++) {
            arraySum += values[i]; // tambahkan setiap elemen ke arraySum
        }

        System.out.println("Array sum: " + arraySum);
        System.out.println();

        // TODO 12: Find Maximum
        // Write a for loop to find the maximum value in an array
        System.out.println("TODO 12: Find maximum in array");
        int[] data = {23, 67, 45, 89, 12, 78, 34};
        int max = data[0]; // Initialize with first element
        // Your code here:
        for (int i = 1; i < data.length; i++) { // mulai dari indeks 1
            if (data[i] > max) {
                max = data[i]; // update max jika elemen lebih besar
            }
        }


        System.out.println("Maximum value: " + max);
        System.out.println();

        // TODO 13: Reverse Array Print
        // Write a for loop to print array elements in reverse order
        System.out.println("TODO 13: Print array in reverse");
        String[] fruits = {"Apple", "Banana", "Cherry", "Date", "Elderberry"};
        // Your code here:
        for (int i = fruits.length - 1; i >= 0; i--) {
            System.out.println(fruits[i]);
        }


        System.out.println();

        // TODO 14: Pattern Printing
        // Write nested for loops to print this pattern:
        // *
        // **
        // ***
        // ****
        // *****
        System.out.println("TODO 14: Star pattern");
        // Your code here:
        int rows = 5;

        for (int i = 1; i <= rows; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * for (initialization; condition; increment) {
 *     // code to repeat
 * }
 *
 * COMPONENTS:
 * - Initialization: runs once at the start (int i = 0)
 * - Condition: checked before each iteration (i < 10)
 * - Increment: runs after each iteration (i++)
 *
 * COMMON PATTERNS:
 * - for (int i = 0; i < n; i++)        // 0 to n-1
 * - for (int i = 1; i <= n; i++)       // 1 to n
 * - for (int i = n; i > 0; i--)        // n to 1 (countdown)
 * - for (int i = 0; i < array.length; i++)  // array iteration
 * - for (int i = 2; i <= n; i += 2)    // even numbers
 *
 * NESTED LOOPS:
 * for (int i = 0; i < rows; i++) {
 *     for (int j = 0; j < cols; j++) {
 *         // inner loop code
 *     }
 * }
 *
 * KEY POINTS:
 * - All three parts (init; condition; increment) are optional
 * - Variables declared in initialization are scoped to the loop
 * - Condition is checked before each iteration
 * - Increment happens after each iteration
 * - Use for loops when you know the number of iterations
 */

