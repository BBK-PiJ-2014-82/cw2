public class Lesson_5_1d_Recursive_Code1 {

    public static void main(String[] args) {
        
        mcCarthy91(50);
        
    }
    
    static int mcCarthy91(int n){
        if(n > 100){
            System.out.println(n);
            return n-10;
        } else {
            System.out.println(n);
            return mcCarthy91(mcCarthy91(n+11));
        }
    }
    
}