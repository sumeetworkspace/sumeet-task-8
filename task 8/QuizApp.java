import java.util.*;

class Question {
    String question;
    List<String> options;
    int correctOption; 

    public Question(String question, List<String> options, int correctOption) {
        this.question = question;
        this.options = options;
        this.correctOption = correctOption;
    }
}

public class QuizApp {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        List<Question> questions = new ArrayList<>();

        questions.add(new Question(
            "What is the capital of France?",
            Arrays.asList("1. Berlin", "2. Madrid", "3. Paris", "4. Rome"),
            3
        ));

        questions.add(new Question(
            "Who wrote 'Romeo and Juliet'?",
            Arrays.asList("1. William Shakespeare", "2. Charles Dickens", "3. Mark Twain", "4. J.K. Rowling"),
            1
        ));

        questions.add(new Question(
            "Which planet is known as the Red Planet?",
            Arrays.asList("1. Venus", "2. Mars", "3. Jupiter", "4. Saturn"),
            2
        ));

        int score = 0;

        for (int i = 0; i < questions.size(); i++) {
            Question q = questions.get(i);
            System.out.println("\nQuestion " + (i + 1) + ": " + q.question);
            for (String opt : q.options) {
                System.out.println(opt);
            }

            System.out.print("Enter your answer (1-4): ");
            int userAnswer = scanner.nextInt();

            if (userAnswer == q.correctOption) {
                System.out.println("✅ Correct!");
                score++;
            } else {
                System.out.println("❌ Incorrect! Correct answer is option " + q.correctOption);
            }
        }

        System.out.println("\n🎉 Quiz Completed!");
        System.out.println("Your Score: " + score + "/" + questions.size());

        scanner.close();
    }
}
