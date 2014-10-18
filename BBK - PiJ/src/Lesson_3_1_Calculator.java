import java.util.Scanner;

public class Lesson_3_1_Calculator {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        double num1, num2, result;
        String operation;
        boolean error = false;
        
        System.out.println("This program will perform a calculation on 2 numbers you input.");
        System.out.print("Please enter your first number: ");
        num1 = s.nextDouble();
        System.out.print("Please enter your second number: ");
        num2 = s.nextDouble();
        System.out.println("Now please select the operation you wish to perform:");
        System.out.println("Plus :      +");
        System.out.println("Minus :     -");
        System.out.println("Multiply :  *");
        System.out.println("Divide :    /");
        operation = s.next();
        
        switch(operation){
            case "+":
                result = num1 + num2;
                break;
            case "-":
                result = num1 - num2;
                break;
            case "*":
                result = num1 * num2;
                break;
            case "/":
                result = num1 / num2;
                break;
            default:
                error = true;
                result = 0;
                break;
        }
        
        if(error){
            System.out.println("You did not enter a valid operator.");
        }
        else{
            System.out.println("The result of your operation is : " + result);
        }
    }
    
}