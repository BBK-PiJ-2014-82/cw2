import java.util.Scanner;

public class Lesson_3_11_Text2Number {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        String number;
        boolean hasPoint = false;
        boolean hold5 = false;
        
        System.out.println("Please enter a number with commas and decimals.");
        number = s.nextLine();
        
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) == '.'){
                System.out.print(".");
                hasPoint = true;
            }
            else if(Character.isDigit(number.charAt(i))){
                if(i == 0 && number.charAt(i) == '0'){
                    System.out.print("");
                }
                else if(Character.getNumericValue(number.charAt(i))%2 == 0){
                    if(hold5){
                        System.out.print((Character.getNumericValue(number.charAt(i))/2)+5);
                        hold5 = false;
                    }
                    else{
                        System.out.print(Character.getNumericValue(number.charAt(i))/2);
                    }
                }
                else if(Character.getNumericValue(number.charAt(i))%2 != 0){
                    if(hold5){
                        System.out.print((Character.getNumericValue(number.charAt(i))/2)+5);
                    }
                    else{
                        System.out.print((Character.getNumericValue(number.charAt(i))/2));
                    }
                    hold5 = true;
                }
            }
        }
        
        if(hold5){
            if(!hasPoint){
                System.out.print(".");
            }
            System.out.print("5");
        }
        
        System.out.println();
        
    }
    
}