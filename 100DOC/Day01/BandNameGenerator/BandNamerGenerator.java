import java.util.Scanner;

class BandNamerGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to the Band Name Generator.");
        System.out.println("What's the name of the city you grew up in?");
        String city = sc.nextLine();
        System.out.println("What is your pet's name?");
        String pet = sc.nextLine();
        System.out.println("Congrats!!! Your Band Name is \""+city+" "+pet+"\"!!!");
    }
}