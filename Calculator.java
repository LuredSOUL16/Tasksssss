
import java.util.Scanner;

public class Calculator{
    public static void main(String[] args) {
        System.out.println("Welcome to the Calculator");

        int choice = 0;

        while(choice<=5){
            
            Scanner scanner = new Scanner(System.in);  
            System.out.println("Enter the first number on which the operation needs to be performed");
            double a = scanner.nextDouble();
            System.out.println("Enter the Second number with which the operation needs to be performed");
            double b = scanner.nextDouble();

            System.out.println("Choose operation to be performed on the entered values");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("To exit the Calculator enter any number greater than 4:");
            choice = scanner.nextInt();


            switch (choice) {
                case 1 -> {
                    System.out.println("You chose Addition");
                    add(a,b);
                }
                case 2 -> {
                    System.out.println("You chose Subtraction");
                    subtract(a, b);
                }
                case 3 -> {
                    System.out.println("You chose Multiplication");
                    multiply(a, b);
                }
                case 4 -> {
                    System.out.println("You chose Division");
                    divide(a, b);
                }
                default -> System.out.println("Exiting calculator......................................");
            }
        }

    }


    public static double add(double a, double b) {
        double c=a+b;
        System.out.println("The sum of "+a+" and "+b+" is "+c);
        return 0;
    }

    public static double subtract(double a, double b) {
        double c=a-b;
        System.out.println("The diffrence of "+a+" and "+b+" is "+c);
        return 0;
    }

    public static double multiply(double a, double b) {
        double c=a*b;
        System.out.println("The product of "+a+" and "+b+" is "+c);
        return 0;
    }

    public static double divide(double a, double b) {
        double c=a/b;
        System.out.println("The division of "+a+" and "+b+" is "+c);
        return 0;
    }
  
}