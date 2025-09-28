package Task7;

/**
 * Hands-On Practice: Do-While Loop
 *
 * LEARNING OBJECTIVES:
 * 1. Understand do-while loop syntax and behavior
 * 2. Learn difference between while and do-while
 * 3. Practice scenarios where code must run at least once
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Notice how do-while always executes at least once
 */

public class DoWhileLoopPractice {
    public static void main(String[] args) {
        System.out.println("=== DO-WHILE LOOP EXERCISES ===\\n");

        // TODO 1: Basic Do-While Count
        // Write a do-while loop to print numbers 1 to 5
        System.out.println("TODO 1: Count 1 to 5");
        int count = 1;
        // Your code here:
        do {
            System.out.println(count);
            count++;
        } while (count <= 5);


        System.out.println();

        // TODO 2: Menu Simulation
        // Write a do-while loop to simulate a menu that runs at least once
        // Print "Menu: 1. Start 2. Exit" and set choice = 2 to exit
        System.out.println("TODO 2: Menu simulation");
        int choice = 1;
        // Your code here:
        do {
            System.out.println("Menu: 1. Start  2. Exit");

            if (choice == 1) {
                System.out.println("Start");
                choice = 2; // langsung set exit agar loop berhenti
            } else {
                System.out.println("Exit");
            }

        } while (choice != 2);


        System.out.println();

        // TODO 3: Input Validation Simulation
        // Write a do-while loop to simulate input validation
        // Start with invalid input, then make it valid
        System.out.println("TODO 3: Input validation simulation");
        int inputValue = -1; // Start with invalid
        int attempts = 0;
        // Your code here (validate inputValue should be between 1-10):
        do {
            attempts++;
            System.out.println("Attempt " + attempts + ": input = " + inputValue);

            // Cek validasi sederhana: input harus >= 0
            if (inputValue < 0) {
                System.out.println("Invalid input, try again...");
                inputValue = 10; // simulasi: perbaiki jadi valid setelah percobaan
            }

        } while (inputValue < 0);


        System.out.println("Valid input accepted: " + inputValue);
        System.out.println();

        // TODO 4: At Least Once Execution
        // Write a do-while that demonstrates execution even when condition is false
        System.out.println("TODO 4: Executes even when condition is false");
        boolean condition = false;
        // Your code here:
        do {
            System.out.println("This will run once even though condition is false!");
        } while (condition);


        System.out.println();

        // TODO 5: Sum Until Zero
        // Write a do-while to add numbers until you encounter zero
        // Use array: {5, 3, 8, 2, 0, 7, 1}
        System.out.println("TODO 5: Sum until zero");
        int[] numbers = {5, 3, 8, 2, 0, 7, 1};
        int index = 0;
        int sum = 0;
        // Your code here:
        do {
            int current = numbers[index];
            System.out.println("Reading: " + current);

            if (current == 0) {
                System.out.println("Zero encountered, stop summing.");
                break; // keluar dari loop kalau ketemu 0
            }

            sum += current;
            index++;

        } while (index < numbers.length);


        System.out.println("Sum until zero: " + sum);
        System.out.println();

        // TODO 6: Reverse Number
        // Write a do-while to reverse digits of number 12345
        System.out.println("TODO 6: Reverse number 12345");
        int number = 12345;
        int reversed = 0;
        // Your code here:
        do {
            int digit = number % 10; // ambil digit terakhir
            reversed = reversed * 10 + digit; // tambah ke reversed
            number /= 10; // buang digit terakhir
        } while (number != 0);



        System.out.println("Reversed: " + reversed);
        System.out.println();

        // TODO 7: Find Character
        // Write a do-while to find first occurrence of 'a' in "programming"
        System.out.println("TODO 7: Find 'a' in 'programming'");
        String text = "programming";
        int charIndex = 0;
        char target = 'a';
        boolean found = false;
        // Your code here:
        do {
            if (text.charAt(charIndex) == target) {
                found = true;
                break; // berhenti begitu ketemu
            }
            charIndex++;
        } while (charIndex < text.length());

        if (found) {
            System.out.println("First occurrence of '" + target + "' is at index " + charIndex);
        } else {
            System.out.println("'" + target + "' not found in the text.");
        }


        System.out.println("Found 'a' at index: " + charIndex);
        System.out.println();

        // TODO 8: Countdown Timer
        // Write a do-while for countdown from 5 to 1, then print "Go!"
        System.out.println("TODO 8: Countdown timer");
        int timer = 5;
        // Your code here:
        do {
            System.out.println(timer);
            timer--;
        } while (timer > 0);


        System.out.println("Go!");
        System.out.println();

        // TODO 9: Password Attempts
        // Write a do-while to simulate password attempts (max 3 tries)
        System.out.println("TODO 9: Password attempts simulation");
        String correctPassword = "secret123";
        String enteredPassword = "wrong"; // Start with wrong password
        int attemptCount = 0;
        int maxAttempts = 3;
        // Your code here:
        do {
            attemptCount++;
            System.out.println("Attempt " + attemptCount + ": entered password = " + enteredPassword);

            if (enteredPassword.equals(correctPassword)) {
                System.out.println("Password correct! Access granted.");
                break; // keluar loop kalau password benar
            } else {
                System.out.println("Incorrect password.");
                // simulasi perbaikan password: setelah percobaan pertama jadi benar
                if (attemptCount == 1) {
                    enteredPassword = "secret123";
                }
            }

        } while (attemptCount < maxAttempts);

        if (!enteredPassword.equals(correctPassword)) {
            System.out.println("Maximum attempts reached. Access denied.");
        }


        System.out.println();

        // TODO 10: Game Level Completion
        // Write a do-while to simulate completing game levels
        // Start at level 1, complete levels until level 5
        System.out.println("TODO 10: Game level completion");
        int currentLevel = 1;
        int targetLevel = 5;
        // Your code here:
        do {
            System.out.println("Completing Level " + currentLevel + "...");
            currentLevel++;
        } while (currentLevel <= targetLevel);


        System.out.println("All levels completed!");

    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * do {
 *     // code to execute
 *     // update condition variables
 * } while (condition);
 *
 * KEY DIFFERENCES FROM WHILE:
 * - Code executes BEFORE condition is checked
 * - Guarantees at least one execution
 * - Condition is checked AFTER each iteration
 * - Semicolon required after while(condition)
 *
 * WHEN TO USE DO-WHILE:
 * - Menu systems (show menu at least once)
 * - Input validation (ask for input at least once)
 * - Game loops (play at least one round)
 * - Initialization that must happen once
 *
 * COMMON PATTERNS:
 * - User input validation
 * - Menu-driven programs
 * - "Try again" scenarios
 * - Process-then-check patterns
 *
 * REMEMBER:
 * - Always executes at least once
 * - Don't forget the semicolon after while()
 * - Still need to update condition variables
 * - Test with edge cases where condition starts false
 */
