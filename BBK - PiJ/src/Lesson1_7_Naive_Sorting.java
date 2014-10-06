import java.util.Scanner;

public class Lesson1_7_Naive_Sorting {

    public static void main(String[] args) {
        
        Scanner in = new Scanner(System.in);
        double a, b, c;
        double i;
        String str;
        
        System.out.println("This program will sort from lowest to highest 3 numbers.");
        System.out.print("Please enter your first number: ");
        str = in.nextLine();
        a = Double.parseDouble(str);
        System.out.print("Please enter your second number: ");
        str = in.nextLine();
        b = Double.parseDouble(str);
        
        if(b < a){
            i = a;
            a = b;
            b = i;
        }
        
        System.out.print("Please enter your third number: ");
        str = in.nextLine();
        c = Double.parseDouble(str);
        
        if(c < a){
            i = c;
            c = b;
            b = a;
            a = i;
        }
        else if(c < b){
            i = c;
            c = b;
            b = i;
        }
        
        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        
    }
    
}