public class Lesson_1_14_Up_To_1000_Primes {

    public static void main(String[] args) {
        
        boolean isPrime = true;
        int count = 2;
        
        for(int i = 0; i < 1000; i++){
            
            while(true){
                
                for(int j = 2; j < count; j++){
                    
                    if(count%j == 0){
                        isPrime = false;
                    }
                    
                }
                
                if(isPrime){
                    System.out.println(count);
                    count++;
                    break;
                }
                
                count++;
                isPrime = true;
                
            }
            
        }
    }
}