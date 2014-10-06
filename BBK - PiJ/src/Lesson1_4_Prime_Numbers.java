import java.util.Scanner;

public class Lesson1_4_Prime_Numbers {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        int i;
        boolean isPrime = true;
        
        System.out.println("Please enter a number (integer).");
        System.out.println("Enter '0' to exit the program.");
        
        String str = s.nextLine();
        i = Integer.parseInt(str);
                
        while(i != 0){

            if(i <= 1){
                System.out.println("Please enter a positive integer greater than 1.");
            }
            else{
                for(int a = 2; a < i; a++){
                    if(i%a == 0){
                        isPrime = false;
                    }
                }
            
                if(isPrime){
                    System.out.println(i + " is a prime number.");
                }
                else{
                    System.out.println(i + " is not a prime number.");
                }
            }
            
            isPrime = true;
            System.out.print("Please try another number: ");
            
            str = s.nextLine();
            i = Integer.parseInt(str);
        }
    }
    
}