public class Lesson_5_1a_Recursive_Code {

    public static void main(String[] args) {
        
        printNumbers(6);
        
    }
    
    static void printNumbers(int n){
        if(n <= 0){
            return;
        }
        System.out.println(n);
        printNumbers(n-2);
        printNumbers(n-3);
        System.out.println(n);
    }

}