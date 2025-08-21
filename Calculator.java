package AlfidoTechIntern;
import java.util.Scanner;

public class Calculator {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the First value: ");
        double Value1 = sc.nextDouble();

        System.out.println("Enter the Second Value :");
        double Value2 = sc.nextDouble();

        System.out.println("Select Operator: ");
        char Operator = sc.next().charAt(0);

        double result;

        switch(Operator) {
            case '+':
            result = Value1 + Value2;
            System.out.println("Result: " + result);
            break;

            case '-':
            result = Value1 - Value2;
            System.out.println("Result :" + result);
            break;

            case '*':
            result = Value1 * Value2;
            System.out.println("Result :" + result);
            break;

            case '/':
            if(Value2 != 0){
                result = Value1 / Value2;
                System.out.println("Result :" + result);
            }else{
                System.out.println("Error : Divisible by zero is not allowed");
                break;
            }
         }
    }
}
    

