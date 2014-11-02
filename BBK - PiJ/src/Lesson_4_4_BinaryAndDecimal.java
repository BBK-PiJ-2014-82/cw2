import java.util.Scanner;

public class Lesson_4_4_BinaryAndDecimal {

    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        System.out.println("This is a binary to decimal converter.");
        System.out.println("Please choose your option:");
        System.out.println("1. Convert binary to decimal.");
        System.out.println("2. Convert decimal to binary.");
        System.out.println();
        System.out.print("Enter your choice now: ");
        
        int choice = s.nextInt();
        s.nextLine();
        
        if(choice == 1){
            Bin2Dec();
        }
        else if(choice == 2){
            Dec2Bin();
        }
        else{
            System.out.println("You did not make a valid choice.");
        }
    }
    
    static void Bin2Dec(){
        System.out.println();
        System.out.print("Please enter a binary number containing only 0s and 1s: ");
        String binary = s.nextLine();
        
        for(int i = 0; i < binary.length(); i++){
            if(binary.charAt(i) != '0' && binary.charAt(i) != '1'){
                System.out.println("That is not a valid binary number.");
                return;
            }
        }
        
        double decimal = 0;
        
        for(int i = 0; i < binary.length(); i++){
            decimal = decimal + (Character.getNumericValue(binary.charAt(i)) * Math.pow(2.0, binary.length() - (i+1)));
        }
        
        System.out.println("The decimal of binary " + binary + " is " + decimal);
    }
    
    static void Dec2Bin(){
        System.out.println();
        System.out.print("Please enter a decimal (integer) number: ");
        
        String binary = "";
        int decimal = s.nextInt();
        double temp = decimal;
        int logarithm = (int)Math.sqrt(decimal) + 1;
        
        System.out.println(logarithm);
        
        for(int i = logarithm; i >= 0; i--){
            if(temp == 1 && i != 0){
                binary += "0";
            }
            else if(Math.pow(2,i) > temp){
                System.out.println(temp);
                binary += "0";
            }
            else{
                System.out.println(temp);
                binary += "1";
                temp -= Math.pow(2,i);
            }
        }
        
        System.out.println("The binary of decimal " + decimal + " is " + binary);
    }

}