import java.util.Scanner;

public class TreasureChest {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String treasureChest = """
            Welcome to Treasure Island.
            Your mission is to find the treasure. \n\
                \t         888                        888
                \t         888                        888
                \t         888                        888
                \t .d8888b 88888 b.   .d88b.  .d888   8b888888
                \td88P"    888  "88b d8P  Y8 b88K     888
                \t888      888   888 8888888 8"Y8888b 888
                \tY88b.    888   888 Y8b.         X88 Y88b.
                \t "Y8888P 888   888  "Y8888  88888P'  "Y888
                """;
        System.out.println(treasureChest);
        System.out.println("You are at a crossroad, where do you want to go? [L or R] :");
        String dir = sc.nextLine();
        switch (dir) {
            case "L" -> {
                System.out.println("You discovered a Pond. Do you want to swim or wait ? [S or W] :");
                String choice = sc.nextLine();
                switch (choice) {
                    case "W" -> {
                        System.out.println(
                                "Four magical doors appear before you.\n\tRed\n\tBlue\n\tYellow\n\tGreen.\nWhich do you choose? [R or B or Y or G]");
                        String door = sc.nextLine();
                        switch (door) {
                            case "R" -> {
                                System.out.println("You fell into a fiery pit. You are burned to death. GAME OVER!!!");
                                break;
                            }
                            case "B" -> {
                                System.out.println("You are surrounded by beasts of hell. You are eaten. GAME OVER!!!");
                                break;
                            }
                            case "G" -> {
                                System.out.println("You are caught in a trap and starved to death. GAME OVER!!!");
                                break;
                            }
                            case "Y" -> {
                                System.out.println(
                                        "You discovered the treasure room! You have become the King of the Pirates. YOU WIN!!!");
                                break;
                            }
                            default -> {
                                System.out.println("GAME OVER!!");
                                break;
                            }
                        }
                    }
                        
                    default -> {
                        System.out.println("You are eaten by Piranhas. Game Over");
                        break;
                    }
                }
            }
            default -> {
                System.out.println("You are run over by a Truck. Game Over"); 
                break;
            }
        }
}
    
}
