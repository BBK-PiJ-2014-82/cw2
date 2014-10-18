import java.util.Scanner;

public class Lesson_3_2_Command_Line_Calculator {

    public static void main(String[] args) {
        
        System.out.println("Enter a caculation with one operator.");
        System.out.println("You can use the following operators:");
        System.out.println("Plus :      +");
        System.out.println("Minus :     -");
        System.out.println("Multiply :  *");
        System.out.println("Divide :    /");
        System.out.println("Enter your calculation below.");
        
        Scanner s = new Scanner(System.in);
        String calculation;
        
        double num1, num2, result;
        String operator = "";
        int opPosition = -1;
        
        calculation = s.nextLine();
        
        for(int i = 0; i < calculation.length(); i++){
            if(calculation.charAt(i) == '+' ||
                calculation.charAt(i) == '-' ||
                calculation.charAt(i) == '/' ||
                calculation.charAt(i) == '×'){
                opPosition = i;
                operator = String.valueOf(calculation.charAt(i));
                break;
            }
        }
        
        if(opPosition != -1){
            num1 = Double.parseDouble(calculation.substring(0, opPosition));
            num2 = Double.parseDouble(calculation.substring(opPosition+1));
            
            switch(operator){
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
                    result = 0;
                    break;
            }
            
            System.out.println("The result is : " + result);
        }
        else{
            System.out.println("Sorry but that wasn't a valid calculation.");
        }
        
    }
    
}