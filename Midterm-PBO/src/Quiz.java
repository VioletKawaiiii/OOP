import java.util.*;

abstract class Quiz {
    private String quizName;
    private List<String> questions;
    private List<String> correctAnswer;

    public Quiz(String quizName, List<String> questions, List<String> correctAnswer) {
        this.quizName = quizName;
        this.questions = questions;
        this.correctAnswer = correctAnswer;
    }

    public String getQuizName() {
        return quizName;
    }

    public List<String> getQuestions() {
        return questions;
    }

    public List<String> getCorrectAnswer() {
        return correctAnswer;
    }

    public void startQuiz(Scanner input) {
        displayInstructions();

        int score = 0;

        String start = input.nextLine();

        if(start.equalsIgnoreCase("y")){

            Main main = new Main();

            main.clearScreen();

            
            System.out.println("==========" + quizName + "==========");

            for(int i = 0; i < questions.size(); i++){
                int number = i + 1;
                
                System.out.println( number + ". " + questions.get(i));
                System.out.print("Your answer: ");

                String userAnswer = input.nextLine();
                
                if(userAnswer.equalsIgnoreCase(correctAnswer.get(i))){
                    System.out.println("Your answer is correct!");
                    score++;
                }else{
                    System.out.println("Your answer incorrect! correct answer is: " + correctAnswer.get(i));
                }
 

                System.out.println();
                
            }

            System.out.println("Your final score is: " + score + "/" + questions.size());
            System.out.println("Press Enter to continue...");
            input.nextLine();
        }

        
    }


    protected abstract void displayInstructions();

}
