import java.util.Scanner;

public class SumOfThreeNumbers {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double num1, num2, num3, sum;
        
        // Prompt user to enter three numbers
        System.out.print("Enter the first number: ");
        num1 = getDoubleInput(input);
        System.out.print("Enter the second number: ");
        num2 = getDoubleInput(input);
        System.out.print("Enter the third number: ");
        num3 = getDoubleInput(input);
        
        // Calculate the sum
        sum = num1 + num2 + num3;
        
        // Display the result
        System.out.println("The sum of " + num1 + ", " + num2 + ", and " + num3 + " is " + sum + ".");
    }
    
    // Method to get double input from user with error handling
    public static double getDoubleInput(Scanner input) {
        double num = 0.0;
        boolean validInput = false;
        do {
            try {
                num = input.nextDouble();
                validInput = true;
            } catch (Exception e) {
                System.out.println("Invalid input. Please enter a number.");
                input.nextLine();
            }
        } while (!validInput);
        return num;
    }
}
