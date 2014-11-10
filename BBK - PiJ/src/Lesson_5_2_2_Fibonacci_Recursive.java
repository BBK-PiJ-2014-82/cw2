import java.util.Scanner;

public class Lesson_5_2_2_Fibonacci_Recursive {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your integer here: ");
        int yourInt = s.nextInt();
        int fibonacci = 2;
        
        if(yourInt <= 2){
            fibonacci = 1;
        }
        else{
            
        }
        
        System.out.println(fibonacci);
    }
    
    static int fibonacciRecursive(){
       
    }

}