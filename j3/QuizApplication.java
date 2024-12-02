import java.util.Scanner;

public class QuizApplication {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String[] questions = {
            "What is the capital of India?",
            "Who is known as the Father of Computers?",
            "Which planet is known as the Red Planet?",
        };

        String[][] options = {
            {"1. Delhi", "2. Mumbai", "3. Kolkata", "4. Chennai"},
            {"1. Charles Babbage", "2. Alan Turing", "3. John von Neumann", "4. Ada Lovelace"},
            {"1. Venus", "2. Mars", "3. Jupiter", "4. Saturn"}
        };

        int[] answers = {1, 1, 2};
        int score = 0;

        System.out.println("Welcome to the Quiz! Answer the questions by entering the option number.\n");

        for (int i = 0; i < questions.length; i++) {
            System.out.println("Q" + (i + 1) + ": " + questions[i]);
            for (String option : options[i]) {
                System.out.println(option);
            }

            System.out.print("Your answer: ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == answers[i]) {
                System.out.println("Correct!\n");
                score++;
            } else {
                System.out.println("Wrong! The correct answer was " + answers[i] + ".\n");
            }
        }

        System.out.println("Quiz Over! Your score is: " + score + "/" + questions.length);

        scanner.close();
    }
}
