package Task4;

/**
 * Hands-On Practice: Switch Statement
 *
 * LEARNING OBJECTIVES:
 * 1. Understand switch statement syntax
 * 2. Practice using switch with different data types
 * 3. Learn when to use switch vs if-else if
 *
 * INSTRUCTIONS:
 * 1. Complete all TODO exercises below
 * 2. Run the program to test your solutions
 * 3. Try different values to test all cases
 */

public class SwitchStatementPractice {
    public static void main(String[] args) {
        System.out.println("=== SWITCH STATEMENT EXERCISES ===\n");

        // TODO 1: Day of Week
        // Write a switch statement for day numbers (1-7):
        // 1: "Monday", 2: "Tuesday", 3: "Wednesday", 4: "Thursday"
        // 5: "Friday", 6: "Saturday", 7: "Sunday"
        // default: "Invalid day"
        int dayNumber = 3;
        // Your code here:
        switch (dayNumber) {
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("Tuesday");
                break;
            case 3:
                System.out.println("Wednesday");
                break;
            case 4:
                System.out.println("Thursday");
                break;
            case 5:
                System.out.println("Friday");
                break;
            case 6:
                System.out.println("Saturday");
                break;
            case 7:
                System.out.println("Sunday");
                break;
            default:
                System.out.println("Invalid day");
        }


        // TODO 2: Grade to GPA
        // Write a switch statement for letter grades:
        // 'A': "4.0 GPA", 'B': "3.0 GPA", 'C': "2.0 GPA"
        // 'D': "1.0 GPA", 'F': "0.0 GPA"
        // default: "Invalid grade"
        char letterGrade = 'B';
        // Your code here:
        switch (letterGrade) {
            case 'A':
                System.out.println("4.0 GPA");
                break;
            case 'B':
                System.out.println("3.0 GPA");
                break;
            case 'C':
                System.out.println("2.0 GPA");
                break;
            case 'D':
                System.out.println("1.0 GPA");
                break;
            case 'F':
                System.out.println("0.0 GPA");
                break;
            default:
                System.out.println("Invalid grade");
        }


        // TODO 3: Month Days
        // Write a switch statement for months (1-12) showing number of days:
        // 1,3,5,7,8,10,12: "31 days"
        // 4,6,9,11: "30 days"
        // 2: "28 or 29 days"
        // default: "Invalid month"
        int month = 4;
        // Your code here:
        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("31 days");
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                System.out.println("30 days");
                break;
            case 2:
                System.out.println("28 or 29 days");
                break;
            default:
                System.out.println("Invalid month");
        }


        // TODO 4: Traffic Light Action
        // Write a switch statement for traffic light colors:
        // "red": "Stop and wait"
        // "yellow": "Prepare to stop"
        // "green": "Go safely"
        // default: "Invalid signal"
        String trafficLight = "yellow";
        // Your code here:
        switch (trafficLight) {
            case "red":
                System.out.println("Stop and wait");
                break;
            case "yellow":
                System.out.println("Prepare to stop");
                break;
            case "green":
                System.out.println("Go safely");
                break;
            default:
                System.out.println("Invalid signal");
        }


        // TODO 5: Calculator Operations
        // Write a switch statement for basic math operations:
        // '+': "Addition operation"
        // '-': "Subtraction operation"
        // '*': "Multiplication operation"
        // '/': "Division operation"
        // default: "Unknown operation"
        char operation = '*';
        // Your code here:
        switch (operation) {
            case '+':
                System.out.println("Addition operation");
                break;
            case '-':
                System.out.println("Subtraction operation");
                break;
            case '*':
                System.out.println("Multiplication operation");
                break;
            case '/':
                System.out.println("Division operation");
                break;
            default:
                System.out.println("Unknown operation");
        }



        // TODO 6: Season by Month
        // Write a switch statement grouping months into seasons:
        // 12,1,2: "Winter"
        // 3,4,5: "Spring"
        // 6,7,8: "Summer"
        // 9,10,11: "Fall"
        // default: "Invalid month"
        int seasonMonth = 7;
        // Your code here:
        switch (seasonMonth) {
            case 12:
            case 1:
            case 2:
                System.out.println("Winter");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Spring");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Summer");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Fall");
                break;
            default:
                System.out.println("Invalid month");
        }


        // TODO 7: Exam Grade Range
        // Write a switch statement for score ranges (use score/10):
        // 10,9: "Excellent"
        // 8: "Very good"
        // 7: "Good"
        // 6: "Satisfactory"
        // default: "Needs improvement"
        int examScore = 85; // Hint: use examScore/10 in switch
        // Your code here:
        switch (examScore / 10) {
            case 10:
            case 9:
                System.out.println("Excellent");
                break;
            case 8:
                System.out.println("Very good");
                break;
            case 7:
                System.out.println("Good");
                break;
            case 6:
                System.out.println("Satisfactory");
                break;
            default:
                System.out.println("Needs improvement");
        }


        // TODO 8: Browser Type
        // Write a switch statement for browser names:
        // "chrome": "Google Chrome browser"
        // "firefox": "Mozilla Firefox browser"
        // "safari": "Apple Safari browser"
        // "edge": "Microsoft Edge browser"
        // default: "Unknown browser"
        String browser = "chrome";
        // Your code here:
        switch (browser) {
            case "chrome":
                System.out.println("Google Chrome browser");
                break;
            case "firefox":
                System.out.println("Mozilla Firefox browser");
                break;
            case "safari":
                System.out.println("Apple Safari browser");
                break;
            case "edge":
                System.out.println("Microsoft Edge browser");
                break;
            default:
                System.out.println("Unknown browser");
        }


        // TODO 9: Priority Level
        // Write a switch statement for priority numbers:
        // 1: "Critical priority"
        // 2: "High priority"
        // 3: "Medium priority"
        // 4: "Low priority"
        // default: "Invalid priority"
        int priority = 2;
        // Your code here:
        switch (priority) {
            case 1:
                System.out.println("Critical priority");
                break;
            case 2:
                System.out.println("High priority");
                break;
            case 3:
                System.out.println("Medium priority");
                break;
            case 4:
                System.out.println("Low priority");
                break;
            default:
                System.out.println("Invalid priority");
        }


        // TODO 10: File Extension
        // Write a switch statement for file extensions:
        // "jpg", "png", "gif": "Image file"
        // "mp4", "avi", "mkv": "Video file"
        // "txt", "doc", "pdf": "Document file"
        // default: "Unknown file type"
        String fileExtension = "png";
        // Your code here:
        switch (fileExtension) {
            case "jpg":
            case "png":
            case "gif":
                System.out.println("Image file");
                break;

            case "mp4":
            case "avi":
            case "mkv":
                System.out.println("Video file");
                break;

            case "txt":
            case "doc":
            case "pdf":
                System.out.println("Document file");
                break;

            default:
                System.out.println("Unknown file type");
        }

    }
}

/**
 * SYNTAX REMINDER:
 * ===============
 * switch (variable) {
 *     case value1:
 *         // code for value1
 *         break;
 *     case value2:
 *         // code for value2
 *         break;
 *     default:
 *         // code for default case
 * }
 *
 * KEY POINTS:
 * - Use break; to prevent fall-through
 * - default case is optional but recommended
 * - Switch works with: int, char, String, enum
 * - Multiple cases can share the same code block
 * - Cases must be constant values (not variables)
 */
