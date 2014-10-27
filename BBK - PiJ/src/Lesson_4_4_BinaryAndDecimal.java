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
            if(i == binary.length()-1){
                decimal += Character.getNumericValue(binary.charAt(i));
            }
            else{
                decimal = decimal + (Character.getNumericValue(binary.charAt(i))
                    * Math.pow(2.0, binary.length() - binary.indexOf(i)));
            }
        }
        
        System.out.println("The decimal of binary " + binary + " is " + decimal);
    }
    
    static void Dec2Bin(){
        System.out.println();
        System.out.print("Please enter a decimal (integer) number: ");
        
        String binary = "";
        int decimal = s.nextInt();
        
        while(decimal > 0){
            double sqrRoot = Math.sqrt(decimal);
            if(sqrRoot%2 == 0){
                binary += "1";
                decimal = decimal / 2;
            }
            else{
                binary += "0";
                decimal = decimal / 2;
            }
        }
        
        System.out.println("The binary of decimal " + decimal + " is " + binary);
    }

}