import java.util.Scanner;

public class Lesson_4_5_BinaryAndHexadecimal {

    static Scanner s = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        String number;
        boolean valid = false;
        
        System.out.println("This is a binary to hexadecimal converter.");
        
        while(!valid){
            System.out.print("Enter a binary or hexadecimal now: ");
            number = s.nextLine();
            
            if(number.substring(0, 2).equalsIgnoreCase("Ox")){
                valid = Hex2Bin(number);
            }
            else{
                valid = Bin2Hex(number);
            }
        }
        
        System.out.println("Thanks for using this program.");
        
    }
    
    static boolean Bin2Hex(String number){
        String hexadecimal = "";
        
        for(int i = 0; i < number.length(); i++){
            if(number.charAt(i) != '0' && number.charAt(i) != '1'){
                System.out.println("That string contains invalid characters.");
                return false;
            }
        }
        
        if(number.length() % 4 == 1){
            number = "000" + number;
        }
        else if(number.length() % 4 == 2){
            number = "00" + number;
        }
        else if(number.length() % 4 == 3){
            number = "0" + number;
        }
        
        for(int i = number.length(); i-4 >= 0; i--){
            if(i%4 == 0){
                int temp = 0;
                String sub = number.substring(i-4, i);
                System.out.println(sub);
                for(int j = 0; j < sub.length(); j++){
                    if(j == sub.length() - 1){
                        temp += Character.getNumericValue(sub.charAt(j));
                    }
                    else{
                        temp += Math.pow(2.0, sub.length()-(j+1)) * Character.getNumericValue(sub.charAt(j));
                    }
                }
                switch(temp){
                    case 0: hexadecimal = "0" + hexadecimal;
                        break;
                    case 1: hexadecimal = "1" + hexadecimal;
                        break;
                    case 2: hexadecimal = "2" + hexadecimal;
                        break;
                    case 3: hexadecimal = "3" + hexadecimal;
                        break;
                    case 4: hexadecimal = "4" + hexadecimal;
                        break;
                    case 5: hexadecimal = "5" + hexadecimal;
                        break;
                    case 6: hexadecimal = "6" + hexadecimal;
                        break;
                    case 7: hexadecimal = "7" + hexadecimal;
                        break;
                    case 8: hexadecimal = "8" + hexadecimal;
                        break;
                    case 9: hexadecimal = "9" + hexadecimal;
                        break;
                    case 10: hexadecimal = "a" + hexadecimal;
                        break;
                    case 11: hexadecimal = "b" + hexadecimal;
                        break;
                    case 12: hexadecimal = "c" + hexadecimal;
                        break;
                    case 13: hexadecimal = "d" + hexadecimal;
                        break;
                    case 14: hexadecimal = "e" + hexadecimal;
                        break;
                    case 15: hexadecimal = "f" + hexadecimal;
                        break;
                }
            }
        }
        
        System.out.println("Your converted binary is hexadecimal: " + hexadecimal);
        return true;
    }
    
    static boolean Hex2Bin(String number){
        String convert = "";
        
        for(int i = 2; i < number.length(); i++){
            switch(number.charAt(i)){
                case '0': convert += "0000";
                    break;
                case '1': convert += "0001";
                    break;
                case '2': convert += "0010";
                    break;
                case '3': convert += "0011";
                    break;
                case '4': convert += "0100";
                    break;
                case '5': convert += "0101";
                    break;
                case '6': convert += "0110";
                    break;
                case '7': convert += "0111";
                    break;
                case '8': convert += "1000";
                    break;
                case '9': convert += "1001";
                    break;
                case 'a': convert += "1010";
                    break;
                case 'b': convert += "1011";
                    break;
                case 'c': convert += "1100";
                    break;
                case 'd': convert += "1101";
                    break;
                case 'e': convert += "1110";
                    break;
                case 'f': convert += "1111";
                    break;
                default: System.out.println("This string contains an invalid character.");
                    return false;
            }
            if(i != number.length() - 1){
                convert += " ";
            }
        }
        
        System.out.println(convert);
        
        return true;
    }
}