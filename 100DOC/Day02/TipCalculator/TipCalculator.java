import java.util.Scanner;

public class TipCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the tip calculator.");
        System.out.println("What was the total bill?");
        Float bill = sc.nextFloat();
        System.out.println("How many people to split the bill?");
        int people = sc.nextInt();
        System.out.println("What percentage tip would you like to give,  10 or 12 or 15  %");
        int tipPercent = sc.nextInt();

        float tipAmount = (bill * tipPercent) / 100;
        
        float shareAmount = (bill + tipAmount) / people;
        System.out.println("Each person should pay: $"+shareAmount);
        System.out.println("You are tipping a total of $"+tipAmount);
    }    
}
