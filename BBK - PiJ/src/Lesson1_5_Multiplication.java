import java.util.Scanner;

public class Lesson1_5_Multiplication {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str;
        Integer a, b, c;
        
        System.out.println("This program will multiply two numbers that you enter.");
        System.out.print("Please enter your first number: ");
        
        str = s.nextLine();
        a = Integer.parseInt(str);
        
        System.out.print("Please enter your second number: ");
        
        str = s.nextLine();
        b = Integer.parseInt(str);
        
        c = 0;
        
        for(int i = 0; i < a; i++){
            c = c + b;
        }
        
        System.out.println("The product of these two numbers is: " + c);
        
    }
    
}