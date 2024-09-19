import java.util.Scanner;

public class PizzaPrizeCalculator {
    
    static String size;
    static String wantPepporoni;
    static String wantExtraCheese;
    
    public static int sizePrize(String size) {
        switch (size) {
            case "L" -> {
                return 25;
            }
            case "M" -> {
                return 20;
            }
            case "S" -> {
                return 15;
            }
            default -> throw new AssertionError();
        }
    }
    
    public static int pepporoniCharge(String wantPepporoni, String size) {
        switch (wantPepporoni) {
            case "Y" -> {
                switch (size) {
                    case "S" -> {
                        return 2;
                    }
                    default -> {
                        return 3;
                    }
                }
            }
            default -> {
                return 0;
            }
        }
    }

    public static int cheeseCharge(String wantExtraCheese) {
        switch (wantExtraCheese) {
            case "Y" -> {
                return 1;
            }
            default -> {
                return 0;
            }
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("What size pizza do you want [S , M, L] :");
        size = sc.nextLine();
        System.out.println("Do you want to add pepporoni [Y / N]? :");
        wantPepporoni = sc.nextLine();
        System.out.println("Do you want to add Extra Cheese [Y / N]? :");
        wantExtraCheese = sc.nextLine();
        
        float total = (float)sizePrize(size) + (float)pepporoniCharge(wantPepporoni, size) + (float)cheeseCharge(wantExtraCheese);
        
        System.out.println("Your total bill is $" +total);
    }
    
}
