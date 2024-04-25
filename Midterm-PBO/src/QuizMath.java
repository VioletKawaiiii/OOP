import java.util.List;

class QuizMath extends Quiz {
   
   public QuizMath(String quizName, List<String> question, List<String> correctAnswer){
    super(quizName, question, correctAnswer );
   }

   @Override
   protected void displayInstructions(){
      System.out.println("======== Quiz Matemathics ========");
       System.out.println("Welcome to matematics quiz");
       System.out.println("You will be asked to solve some math problems.");
       System.out.print("Start quiz? (y/n): ");
   }
   
}