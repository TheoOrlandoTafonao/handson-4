package Task6;

/**
 * Hands-On Practice: While Loop
 *
 * LEARNING OBJECTIVES:
 * 1. Understand while loop syntax and logic
 * 2. Practice loop control with conditions
 * 3. Learn to avoid infinite loops
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Make sure loops terminate properly
 */

public class WhileLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== WHILE LOOP EXERCISES ===\n");

        // TODO 1: Count from 1 to 10
        // Write a while loop to print numbers 1 to 10
        System.out.println("TODO 1: Count 1 to 10");
        int count = 1;
        // Your code here:
        while (count <= 10) {
            System.out.println(count);
            count++;
        }


        System.out.println();

        // TODO 2: Count Down from 10 to 1
        // Write a while loop to print numbers 10 to 1
        System.out.println("TODO 2: Count down 10 to 1");
        int countdown = 10;
        // Your code here:
        while (countdown >= 1) {
            System.out.println(countdown);
            countdown--;
        }


        System.out.println();

        // TODO 3: Even Numbers
        // Write a while loop to print even numbers from 2 to 20
        System.out.println("TODO 3: Even numbers 2 to 20");
        int evenNum = 2;
        // Your code here:
        while (evenNum <= 20) {
            System.out.println(evenNum);
            evenNum += 2;
        }


        System.out.println();

        // TODO 4: Sum of Numbers
        // Write a while loop to calculate sum of numbers 1 to 100
        System.out.println("TODO 4: Sum of 1 to 100");
        int i = 1;
        int sum = 0;
        // Your code here:
        while (i <= 100) {
            sum += i;
            i++;
        }


        System.out.println("Sum: " + sum);
        System.out.println();

        // TODO 5: Factorial Calculation
        // Write a while loop to calculate factorial of 5 (5! = 5*4*3*2*1)
        System.out.println("TODO 5: Factorial of 5");
        int n = 5;
        int factorial = 1;
        int counter = 1;
        // Your code here:
        while (counter <= n) {
            factorial *= counter;
            counter++;
        }


        System.out.println("5! = " + factorial);
        System.out.println();

        // TODO 6: Find First Multiple
        // Write a while loop to find first number divisible by both 3 and 7
        System.out.println("TODO 6: First multiple of 3 and 7");
        int number = 1;
        // Your code here:
        while (true) {
            if (number % 3 == 0 && number % 7 == 0) {
                System.out.println("First number divisible by 3 and 7: " + number);
                break;
            }
            number++;
        }


        System.out.println();

        // TODO 7: String Character Count
        // Write a while loop to count vowels in a string
        System.out.println("TODO 7: Count vowels in 'programming'");
        String text = "programming";
        int index = 0;
        int vowelCount = 0;
        // Your code here:
        while (index < text.length()) {
            char c = Character.toLowerCase(text.charAt(index));
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                vowelCount++;
            }
            index++;
        }


        System.out.println("Vowel count: " + vowelCount);
        System.out.println();

        // TODO 8: Power Calculation
        // Write a while loop to calculate 2^8 (2 to the power of 8)
        System.out.println("TODO 8: Calculate 2^8");
        int base = 2;
        int exponent = 8;
        int result = 1;
        int exp = 0;
        // Your code here:
        while (exp < exponent) {
            result *= base;
            exp++;
        }


        System.out.println("2^8 = " + result);
        System.out.println();

        // TODO 9: Digit Sum
        // Write a while loop to calculate sum of digits in number 12345
        System.out.println("TODO 9: Sum of digits in 12345");
        int num = 12345;
        int digitSum = 0;
        // Your code here:
        while (num > 0) {
            digitSum += num % 10;
            num /= 10;
        }


        System.out.println("Sum of digits: " + digitSum);
        System.out.println();

        // TODO 10: Number Guessing Simulation
        // Write a while loop to simulate finding a target number
        // Keep incrementing a guess until it matches target
        System.out.println("TODO 10: Find target number 47");
        int target = 47;
        int guess = 1;
        int attempts = 0;
        // Your code here:
        while (guess != target) {
            guess++;
            attempts++;
        }


        System.out.println("Found " + target + " in " + attempts + " attempts");

    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * while (condition) {
 *     // code to repeat
 *     // update condition variable
 * }
 *
 * KEY POINTS:
 * - Condition is checked BEFORE each iteration
 * - Loop continues while condition is true
 * - Must update condition variable inside loop
 * - Condition variable should be initialized before loop
 * - Always ensure loop will eventually terminate
 *
 * COMMON PATTERNS:
 * - Counter loops: initialize, check, increment
 * - Accumulator loops: sum, product, concatenation
 * - Search loops: find specific value or condition
 * - Input validation loops: repeat until valid input
 *
 * AVOID INFINITE LOOPS:
 * - Always modify the condition variable
 * - Ensure condition will eventually become false
 * - Test with different values
 */
