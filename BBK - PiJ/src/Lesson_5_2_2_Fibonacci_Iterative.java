import java.util.Scanner;

public class Lesson_5_2_2_Fibonacci_Iterative {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        System.out.print("Enter your integer here: ");
        int yourInt = s.nextInt();
        int fibonacci = 1;
        int f1 = 1;
        int f2 = 1;
        
        if(yourInt <= 2){
            fibonacci = 1;
        }
        else{
            for(int i = 2; i < yourInt; i++){
                fibonacci = f1 + f2;
                f1 = f2;
                f2 = fibonacci;
            }
        }
        
        System.out.println(fibonacci);
    }

}