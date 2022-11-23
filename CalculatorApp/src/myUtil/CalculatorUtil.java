package myUtil;
import java.util.Scanner;

public class CalculatorUtil {
    public static double calculate() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first number:");
        double firstNumber = sc.nextInt();
        System.out.println("Enter operation:");
        String operation = "";
        sc.nextLine();
        operation = sc.nextLine();
        System.out.println("Enter second number:");
        double secondNumber = sc.nextInt();

        double result = 0;
        if (operation.equals("+")) {
            result = MathUtil.plus(firstNumber, secondNumber);
        } else if (operation.equals("-")) {
            result = MathUtil.minus(firstNumber, secondNumber);
        } else if (operation.equals("*")) {
            result = MathUtil.multiply(firstNumber, secondNumber);
        } else if (operation.equals("/")) {
            if(secondNumber!=0){
                result = MathUtil.divide(firstNumber, secondNumber);
            }else {
                System.out.println("Can't divide by zero");
            }
        } else {
            System.out.println("Please enter one of the right operation (+ - * /)");
        }
        return result;
    }
}
