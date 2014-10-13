public class Lesson_1_12_Number_Pyramids {

    public static void main(String[] args) {
        
        int count = 1;
        
        for(int i = 0; i < 7; i++){
            for(int j = 0; j < count; j++){
                System.out.print(count);
            }
            
            System.out.println();
            count++;
        }
        
    }
    
}