import java.util.List;

class QuizReligion extends Quiz {
    
    public QuizReligion(String quizName, List<String> question, List<String> correctAnswer){
        super(quizName, question, correctAnswer );
    }

    @Override
    protected void displayInstructions(){
        System.out.println("======== Quiz Religion ========");
        System.out.println("Welcome to religion quiz");
        System.out.println("You will be asked questions about islam religion.");
        System.out.print("Start quiz? (y/n): ");
    }
    
    

}
