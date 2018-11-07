/** BMICalculator.java can calculate ones health risk based on weight.
 *  @author Phillip Turner
 *  @version for Alice+Java, Alice 3 edition
 */
import java.util.Scanner;

public class BMICalculator {
    
    public static void main(String[] args){
        Scanner keyboard = new Scanner(System.in);
        // Gets required input from users from line 12 to 19, then calculates input on line 20 to 21
        System.out.print("How many pounds do you weigh?");
        System.out.printf("%nWeight:");
        double userWeight = keyboard.nextDouble();
        System.out.print("How how many feet and inches tall are you?");
        System.out.printf("%nFeet:");
        double userFeet = keyboard.nextDouble();
        System.out.print("by:");
        double userInches = keyboard.nextDouble();
        double userHeight = (userFeet * 12) + userInches;
        double BMI = ((userWeight / (userHeight * userHeight)) * 703);
        //Will tell user if they are under, normal, or overweight based on thier BMI
        if(BMI < 18.5){
            System.out.printf("You are underweight with your BMI being %2.2f.", BMI);
        } else {
            if (BMI > 18.8 && BMI < 24.9){
                System.out.printf("You may be normal weight and health with your BMI %2.2f.", BMI);
                } else {
                    if (BMI > 30){
                        System.out.printf("You are overweight with your BMI being %2.2f.", BMI);
                    } else {
                    }
            }
        }
    }
}
