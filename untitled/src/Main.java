/*import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        ArrayList<Question> questions = new ArrayList<>();

        Scanner scanner = new Scanner(System.in);
        int qs;
        System.out.println("How many questions do you want to make?");
        qs = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < qs; i++) {
            System.out.println(":What is the question");
            String question = scanner.nextLine();
            System.out.println("What is the answer");
            String answer = scanner.nextLine();
           questions.add(new Question(question, answer));
        }

        for (Question q : questions) {
            System.out.println(q.question);
        }
        System.out.println("How many questions do you want to answer?");
        int numQuestions = scanner.nextInt();



    }
}*/
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<Question> questions = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        int qs;
        System.out.println("How many questions do you want to make?");
        qs = scanner.nextInt();
        scanner.nextLine();
        for (int i = 0; i < qs; i++) {
            System.out.println(":What is the question");
            String question = scanner.nextLine();
            System.out.println("What is the answer");
            String answer = scanner.nextLine();
            questions.add(new Question(question, answer));
        }
        System.out.println("Do you want to start the quiz?");
        String whetherStart = scanner.nextLine();

        if (whetherStart.equals("yes"||"Yes")){
            System.out.println("How many questions do you want to answer?");
            int numQuestions = scanner.nextInt();
            if(numQuestions > questions.size()){
                System.out.println("Questions stored are not enough. Pick number of questions that is less than " + questions.size());
                numQuestions = scanner.nextInt();
            }
            if(numQuestions <= questions.size()){
                new Quiz(numQuestions);
            }
        }
    }
}


