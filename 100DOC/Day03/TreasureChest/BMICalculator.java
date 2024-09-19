import java.util.Scanner;
public class BMICalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to BMI Calculator!!");
        System.out.println("Please Enter Your Weight in kilograms: ");
        float weight = sc.nextFloat();
        System.out.println("Please Enter Your Height in centimeters: ");
        int heightInCM = sc.nextInt();
        float heightInMeters = ((float) heightInCM / 100);
        System.out.println(heightInMeters);
        float bmi = (weight/(heightInMeters*heightInMeters));

        System.out.println("Your BMI is " + bmi);
        if (bmi < 18.5) {
            System.out.println("You are UnderWeight");
        } else if (bmi >= 18.5 && bmi < 25) {
            System.out.println("You are in Normal weight range");
        } else {
            System.out.println("You are OverWeight");
        }
    }
}
