import java.util.ArrayList;
import java.util.Scanner;

/*public class Quiz {
    private ArrayList<Question>quiz;

    public Quiz(int numQuestions) {
        runQuiz();
    }

    private void runQuiz() {
    }

    private void generateRandomQuestionList(int numberOfQuestions){
        for (int i = 0; i < numberOfQuestions; i++){
            int random = ((int)(Math.random() * questions.size()));
            while (quiz.contains(questions.get(random))){
                random = ((int)(Math.random() * questions.size()));
            }
            quiz.add(questions.get(random));
        }
    }
}*/
public class Quiz{
    private ArrayList<Question> questions = new ArrayList<>();
    private ArrayList<Question> quiz = new ArrayList <Question>();

    public Quiz(int numberQuestions){
        generateRandomQuestionList(numberQuestions);
        runQuiz();
    }

    private void generateRandomQuestionList(int numberOfQuestions){
        for (int i = 0; i < numberOfQuestions; i++){
            int random = ((int)(Math.random() * questions.size()));
            while (quiz.contains(questions.get(random))){
                random = ((int)(Math.random() * questions.size()));
            }
            quiz.add(questions.get(random));
        }
    }

    private void runQuiz(){
        /*int questionNumber = 1;
        System.out.println("Lets start the quiz");
        for (Question q : quiz){
            Scanner scanner = new Scanner(System.in);
            System.out.println("Questions: " + questionNumber);
        }*/
        Scanner quizScanner = new Scanner(System.in);
        for (int i = 0; i < quiz.size();i++){
            String quizQuestion = quiz.get(i).getQuestion();
            System.out.println(quizQuestion);
            String userAns = quizScanner.nextLine();
            int numCorrect = 0;
            if(userAns.equals(quiz.get(i).getAnswer())){
                System.out.println("Correct");
                numCorrect++;
            }
            else{
                System.out.println("Wrong");
            }
            System.out.println("You got " + numCorrect + "question(s) right.");
        }
    }
}

