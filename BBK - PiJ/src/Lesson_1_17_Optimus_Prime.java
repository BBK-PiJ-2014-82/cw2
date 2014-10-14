import java.util.Scanner;

public class Lesson_1_17_Optimus_Prime {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        System.out.println("Please enter a positive integer.");
        System.out.println("I will then tell you the nearest prime number.");
        System.out.println("Your integer: ");
        
        boolean isPrime = true;
        boolean isLowPrime = true;
        boolean isHighPrime = true;
        
        int yourInt = s.nextInt();
        int lowPrime = 0;
        int highPrime = 0;
        int countFromInt = 1;
        
        for(int i = 2; i < yourInt; i++){
            if(yourInt%i == 0){
                isPrime = false;
            }
        }
        
        if(isPrime){
            System.out.println(yourInt + " is a prime number.");
        }
        else{
            while(!isPrime){
                
                for(int i = 2; i < yourInt - countFromInt; i++){
                    if(yourInt - countFromInt == 0){
                        isLowPrime = false;
                    }
                }
                
                for(int i = 2; i < yourInt + countFromInt; i++){
                    if(yourInt + countFromInt == 0){
                        isHighPrime = false;
                    }
                }
                
                if(isLowPrime || isHighPrime){
                    if(isLowPrime){
                        lowPrime = yourInt - countFromInt;
                    }
                    if(isHighPrime){
                        highPrime = yourInt + countFromInt;
                    }
                    break;
                }
                countFromInt++;
            }
            
            if(isLowPrime && isHighPrime){
                System.out.println("There are 2 primes an equal distance from your integer.");
                System.out.println("The lowest is: " + lowPrime + ".");
                System.out.println("The highest is: " + highPrime + ".");
            }
            else if(isLowPrime){
                System.out.println("The nearest prime to " + yourInt + " is " + lowPrime);
            }
            else{
                System.out.println("The nearest prime to " + yourInt + " is " + highPrime);
            }
        }
        
    }
    
}