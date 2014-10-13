public class Lesson_1_13_Primes_To_1000 {

    public static void main(String[] args) {
        
        boolean isPrime = true;
        
        for(int i = 2; i < 1000; i++){
            
            for(int j = 2; j < i; j++){
                
                if(i%j == 0){
                    isPrime = false;
                }
                
            }
            
            if(isPrime){
                System.out.println(i);
            }
            
            isPrime = true;
        }
    }
}