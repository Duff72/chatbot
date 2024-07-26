import java.util.Scanner;

public class ChatBot {

    public static void main(String[] args) {
        // Create a Scanner object for user input
        Scanner scanner = new Scanner(System.in);

        // Call the methods for each stage of the chat bot
        greetUser(scanner);
        repeatName(scanner);
        guessAge(scanner);
        countToNumber(scanner);
        testProgrammingKnowledge(scanner);

    }

    // Method to greet the user
    private static void greetUser(Scanner scanner) {
        System.out.println("Hello! Welcome to the ChatBot.");
    }

    // Method to ask the user to repeat their name
    private static void repeatName(Scanner scanner) {
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.println("Nice to meet you, " + name + "!");
    }

    // Method to guess the user's age
    private static void guessAge(Scanner scanner) {
        System.out.println("I'm going to guess your age.");
        System.out.print("Enter the number of letters in your first name: ");
        int nameLength = scanner.nextInt();
        scanner.nextLine(); // Consume the newline character left by nextInt()

        // Guess age based on the number of letters in the name
        int guessedAge = nameLength * 5; // Just a simple guess calculation
        System.out.println("I guess you are around " + guessedAge + " years old.");
    }

    // Method to count to any number that the user wants
    private static void countToNumber(Scanner scanner) {
        System.out.print("Enter a number to count to: ");
        int countTo = scanner.nextInt();

        System.out.println("Counting to " + countTo + ":");
        for (int i = 1; i <= countTo; i++) {
            System.out.println(i);
        }
    }

    public static void testProgrammingKnowledge(Scanner scanner) {
        String question = "What is the default value of a boolean in Java?";

        String[] options = {
                "1. true",
                "2. false",
                "3. 0",
                "4. null"
        };
        int correctOption = 2;

        boolean isCorrect = false;

        System.out.println(question);
        for (String option : options) {
            System.out.println(option);
        }

        // Loop until the user selects the correct option
        while (!isCorrect) {
            System.out.print("Enter the number of your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == correctOption) {
                System.out.println("Correct! 'public' is used to define a method in Java.");
                isCorrect = true;
            } else {
                System.out.println("Incorrect. Please try again.");
            }
        }
    }
}
