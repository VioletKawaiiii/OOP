import java.util.*;

public class Main {
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) throws Exception {
        boolean exit = false;

        while(!exit) {
            clearScreen();
            displayMenu();
            System.out.print("=> Choose: ");
            String choice = input.nextLine();
    
            switch(choice){
                case "1": 
                    startMathQuiz();
                    break;
                case "2":
                    startReligionQuiz();
                    break;
                case "3": 
                    exit = true;
                    clearScreen();
                    System.out.println("Thank You...");
                    break;
                default: 
                    System.out.println("Invalid choice.");
            }
        }
    }

    public static void displayMenu() {
        System.out.println("[==========================]");
        System.out.println("[           QUIZ           ]");
        System.out.println("[==========================]");
        System.out.println("[1. Mathematics            ]");
        System.out.println("[2. Religion               ]");
        System.out.println("[3. Exit                   ]");
        System.out.println("[==========================]");
    }

    public static void clearScreen() {
        System.out.print("\033[H\033[2J");  
        System.out.flush();  
    }

    public static void startMathQuiz(){
       clearScreen();
       
       List<String> questions = Arrays.asList(
        "What is 4 + 4 ? ", 
            "What is 2 / 2 ? "
       );

       List<String> correctAnswer = Arrays.asList(
        "8", "1"
       );

       QuizMath mathQuiz = new QuizMath("Matemathics Quiz", questions, correctAnswer);

       mathQuiz.startQuiz(input);
    }

    public static void startReligionQuiz(){
      clearScreen();     

      List<String> questions = Arrays.asList(
        "Rukun iman ada berapa ?",
        "Nabi ke 25 siapa ?"
       );

       List<String> correctAnswer = Arrays.asList(
        "5", "Nabi Muhammad"
       );

       QuizReligion religionQuiz = new QuizReligion("Religion Quiz", questions, correctAnswer);

       religionQuiz.startQuiz(input);

    }
    

}
