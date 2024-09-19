
import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

    public static String[] choices = { "R", "P", "S" };
    
    public static String asciiArt(String choice) {
        switch (choice) {
            case "R" -> {
                String art = """
                                                    888\n                            888\n                            888\n888d888 .d88b.  .d8888b888  888 \n888P"  d88""88bd88P"   888 .88P  \n888    888  888888     888888K  \n888    Y88..88PY88b.   888 "88b \n888     "Y88P"  "Y8888P888  888
                        """;

                return art;

            }
            case "P" -> {
                String art = """
                        88888b.  8888b. 88888b.  .d88b. 888d888 \n888 "88b    "88b888 "88bd8P  Y8b888P"   \n888  888.d888888888  88888888888888     \n888 d88P888  888888 d88PY8b.    888     \n88888P" "Y88888888888P"  "Y8888 888     \n888             888                     \n888             888                     \n888             888
                                """;
                return art;
            }
            case "S" -> {
                String art = """
                                        d8b                                        \n                Y8P                                        \n                                                           \n.d8888b  .d8888b888.d8888b .d8888b  .d88b. 888d888.d8888b  \n88K     d88P"   88888K     88K     d88""88b888P"  88K      \n"Y8888b.888     888"Y8888b."Y8888b.888  888888    "Y8888b. \n     X88Y88b.   888     X88     X88Y88..88P888         X88 \n 88888P' "Y8888P888 88888P' 88888P' "Y88P" 888     88888P'
                        """;
                return art;
            }
            default -> {
                return "INVALID CHOICE";
            }

        }

    }

    public static String computerChoice() {
        int rnd = new Random().nextInt(choices.length);
        return choices[rnd]; 
    }
    
    public static void game() {
        Scanner sc = new Scanner(System.in);
        System.out.println("WELCOME TO ROCK PAPER SCISSORS!!!");
        System.out.println("WHAT DO YOU CHOOSE, Rock or Paper or Scissors? [R P S] : ");
        String humanChoice = sc.nextLine();
        String compChoice = computerChoice();
        
        switch (humanChoice) {
            case "R" -> {
                switch (compChoice) {
                    case "R" -> {
                        System.out.println("You Chose Rock... ");
                        asciiArt("R");
                        System.out.println("Computer Chose Rock... ");
                        asciiArt("R");
                        System.out.println("Its a DRAW");
                    }
                    case "P" -> {
                        System.out.println("You Chose Rock... ");
                        asciiArt("R");
                        System.out.println("Computer Chose Paper... ");
                        asciiArt("P");
                        System.out.println("Computer WINS");
                    }
                    case "S" -> {
                        System.out.println("You Chose Rock... ");
                        asciiArt("R");
                        System.out.println("Computer Chose Scissors... ");
                        asciiArt("S");
                        System.out.println("You WIN");
                    }
                    default -> {
                        System.out.println("HI");
                    }
                }
            }
            case "P" -> {
                switch (compChoice) {
                    case "R" -> {
                        System.out.println("You Chose Paper... ");
                        asciiArt("P");
                        System.out.println("Computer Chose Rock... ");
                        asciiArt("R");
                        System.out.println("You WIN");
                    }
                    case "P" -> {
                        System.out.println("You Chose Paper... ");
                        asciiArt("P");
                        System.out.println("Computer Chose Paper... ");
                        asciiArt("P");
                        System.out.println("Its a DRAW");
                    }
                    case "S" -> {
                        System.out.println("You Chose Paper... ");
                        asciiArt("P");
                        System.out.println("Computer Chose Scissors... ");
                        asciiArt("S");
                        System.out.println("Computer WINS");
                    }
                    default -> {
                        System.out.println("HI");
                    }
                }
            }
            case "S" -> {
                switch (compChoice) {
                    case "R" -> {
                        System.out.println("You Chose Scissors... ");
                        asciiArt("S");
                        System.out.println("Computer Chose Rock... ");
                        asciiArt("R");
                        System.out.println("Computer WINS");
                    }
                    case "P" -> {
                        System.out.println("You Chose Scissors... ");
                        asciiArt("S");
                        System.out.println("Computer Chose Paper... ");
                        asciiArt("P");
                        System.out.println("You WIN");
                    }
                    case "S" -> {
                        System.out.println("You Chose Scissors... ");
                        asciiArt("S");
                        System.out.println("Computer Chose Scissors... ");
                        asciiArt("S");
                        System.out.println("Its a DRAW");
                    }
                    default -> {
                        System.out.println("HI");
                    }
                }
            }
            default -> {
                System.out.println("Invalid Choice");
            }
        }


    }

    public static void main(String[] args) {
        game();
    }
}
