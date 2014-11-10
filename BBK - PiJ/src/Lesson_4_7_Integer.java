import java.util.Scanner;

public class Lesson_4_7_Integer {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        Integer2 i2 = new Integer2();
        System.out.println("Enter a number: ");
        String str = s.nextLine();
        int i = Integer.parseInt(str);
        i2.setValue(i);
        System.out.println("The number you entered is :");
        if(i2.isEven()){
            System.out.println("Even.");
        }
        else if(i2.isOdd()){
            System.out.println("Odd.");
        }
        else{
            System.out.println("Undefined!  Your code is buggy!");
        }
        int parsedInt = Integer.parseInt(i2.toString());
        if(parsedInt == i2.getValue()){
            System.out.println("Your toString() method seems to work fine.");
        }
    }

}

class Integer2 {
    
    int value;
    
    int getValue(){
        return value;
    }
    
    void setValue(int a){
        this.value = a;
    }
    
    boolean isEven(){
        if(value%2 == 0){
            return true;
        }
        else{
            return false;
        }
    }
    
    boolean isOdd(){
        if(value%2 == 0){
            return false;
        }
        else{
            return true;
        }
    }
    
    void prettyPrint(){
        System.out.println(value);
    }
    
    public String toString(){
        return ""+value;
    }
    
}