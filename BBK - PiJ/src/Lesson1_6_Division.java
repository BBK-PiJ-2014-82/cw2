import java.util.Scanner;

public class Lesson1_6_Division {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String str;
        Integer a, b, c, d;
        
        System.out.println("This program will divide two numbers that you enter.");
        System.out.print("Please enter your first number: ");
        
        str = s.nextLine();
        a = Integer.parseInt(str);
        
        System.out.print("Please enter your second number: ");
        
        str = s.nextLine();
        b = Integer.parseInt(str);
        
        if(a < b){
            System.out.println("Your first integer must be larger than your divisor.");
            System.out.println("Exiting program . . .");
        }
        else{
            c = 0;
            d = a;
            
            while(d > b){
                d = d - b;
                c++;
            }
            
            System.out.println(a + " divided by " + b + " is " + c + ", remainder " + d);
        }
        
    }
    
}