package Task10;

/**
 * Hands-On Practice: Jump Statements (Break and Continue)
 */

public class JumpStatementsPractice {
    public static void main(String[] args) {
        System.out.println("=== JUMP STATEMENTS EXERCISES ===\n");

        // TODO 1: Break on Condition
        System.out.println("TODO 1: Break when number equals 8");
        for (int i = 1; i <= 20; i++) {
            if (i == 8) break;
            System.out.println(i);
        }
        System.out.println();

        // TODO 2: Continue on Even Numbers
        System.out.println("TODO 2: Skip even numbers (print only odd)");
        for (int i = 1; i <= 10; i++) {
            if (i % 2 == 0) continue;
            System.out.println(i);
        }
        System.out.println();

        // TODO 3: Find First Negative
        System.out.println("TODO 3: Find first negative number");
        int[] numbers = {5, 8, 12, -3, 7, -1, 9};
        for (int num : numbers) {
            if (num < 0) {
                System.out.println("First negative number = " + num);
                break;
            }
        }
        System.out.println();

        // TODO 4: Skip Multiples of 3
        System.out.println("TODO 4: Skip multiples of 3");
        for (int i = 1; i <= 15; i++) {
            if (i % 3 == 0) continue;
            System.out.println(i);
        }
        System.out.println();

        // TODO 5: Break on Target Sum
        System.out.println("TODO 5: Add until sum >= 50");
        int[] values = {10, 15, 8, 12, 20, 7, 5};
        int sum = 0;
        for (int val : values) {
            sum += val;
            if (sum >= 50) break;
        }
        System.out.println("Final sum: " + sum);
        System.out.println();

        // TODO 6: Continue on Vowels
        System.out.println("TODO 6: Print only consonants from 'programming'");
        String word = "programming";
        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if ("aeiouAEIOU".indexOf(ch) != -1) continue;
            System.out.println(ch);
        }
        System.out.println();

        // TODO 7: Nested Loop with Break
        System.out.println("TODO 7: Find first pair where i*j > 15");
        boolean found = false;
        for (int i = 1; i <= 10 && !found; i++) {
            for (int j = 1; j <= 10; j++) {
                if (i * j > 15) {
                    System.out.println("First pair where i*j > 15: (" + i + ", " + j + ")");
                    found = true;
                    break;
                }
            }
        }
        System.out.println();

        // TODO 8: Continue on Short Strings
        System.out.println("TODO 8: Print only long strings (length >= 5)");
        String[] words = {"Hi", "Hello", "Java", "Programming", "Code", "Loop"};
        for (String w : words) {  // ganti 'word' menjadi 'w'
            if (w.length() < 5) continue;
            System.out.println(w);
        }
        System.out.println();

        // TODO 9: Break on Search Target
        System.out.println("TODO 9: Search for 'Java' and break");
        String[] languages = {"Python", "C++", "Java", "JavaScript", "Go"};
        int index = -1;
        String target = "Java";
        for (int i = 0; i < languages.length; i++) {
            if (languages[i].equals(target)) {
                index = i;
                break;
            }
        }
        if (index != -1) {
            System.out.println("Found 'Java' at index: " + index);
        }
        System.out.println();

        // TODO 10: Skip Zero Values
        System.out.println("TODO 10: Calculate average (skip zeros)");
        int[] scores = {85, 0, 92, 78, 0, 96, 87};
        int total = 0;
        int count = 0;
        for (int score : scores) {
            if (score == 0) continue;
            total += score;
            count++;
        }
        double average = (count > 0) ? (double) total / count : 0;
        System.out.println("Average (excluding zeros): " + average);
        System.out.println();

        // TODO 11: Labeled Break
        System.out.println("TODO 11: Labeled break example");
        outerLoop:
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= 5; j++) {
                System.out.println("i = " + i + ", j = " + j);
                if (i * j > 10) {
                    System.out.println("Breaking out of outer loop because i*j > 10");
                    break outerLoop;
                }
            }
        }
        System.out.println();

        // TODO 12: Continue with Condition
        System.out.println("TODO 12: Skip numbers divisible by both 2 and 3");
        for (int i = 1; i <= 20; i++) {
            if (i % 2 == 0 && i % 3 == 0) continue;
            System.out.println(i);
        }
        System.out.println();

        // TODO 13: Early Termination
        System.out.println("TODO 13: Process until 'quit' command");
        String[] commands = {"start", "continue", "process", "quit", "end"};
        int cmdIndex = 0;
        while (cmdIndex < commands.length) {
            String command = commands[cmdIndex];
            if (command.equals("quit")) {
                System.out.println("Encountered 'quit', stopping loop.");
                break;
            }
            System.out.println("Processing command: " + command);
            cmdIndex++;
        }
        System.out.println();

        // TODO 14: Complex Skip Logic
        System.out.println("TODO 14: Complex skip and break logic");
        for (int i = 1; i <= 30; i++) {
            if (i > 25) break;
            if (i % 5 == 0) continue;
            System.out.println(i);
        }

    }
}
