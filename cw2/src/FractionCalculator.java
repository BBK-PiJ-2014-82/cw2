import java.util.Scanner;

public class FractionCalculator {
    private Scanner scan;
    
    public FractionCalculator(){}
    
    public static void main(String[] args) {
        FractionCalculator calculator = new FractionCalculator();
        calculator.launch();
    }
    
    private void launch(){
        
        // variables
        String input = "";
        Fraction value = new Fraction(0,1);
        
        // create Scanner
        scan = new Scanner(System.in);
        
        // welcome message
        System.out.println("Welcome to James Hill's Fraction Calculator.");
        System.out.println("Please enter a calculation below:");
        
        // take commands from the user, display the result or exit
        while(scan != null){
            input = scan.nextLine();
            value = evaluate(value, input);
            if(scan != null){
                System.out.println(" = " + value.toString());
            }
        }
        
        // closing
        System.out.println("Goodbye.");
    }
    
    // Evauluate the input string and return the result as a fraction.
    public Fraction evaluate(Fraction current, String inputString) {
        
        // create variables
        String operator = "";
        String item;
        String delims = "[ ]+";
        String[] tokens = inputString.split(delims);
        Fraction tempFraction = current;
        boolean isFraction = false;
        
        // parse the string and perform calculations
        for(int i = 0; i < tokens.length; i++) {
            item = tokens[i];
            
            if(checkForDigit(item)){
                if(checkIsFraction(item)){
                    isFraction = true;
                    tempFraction = parseFraction(item);
                }
            }
            
            // read the token and perform appropriate operation
            if(isFraction){
                // parse numerals
                switch(operator){
                    case "+":
                        current = current.add(tempFraction);
                        operator = "";
                        break;
                    case "-":
                        current = current.subtract(tempFraction);
                        operator = "";
                        break;
                    case "*":
                        current = current.multiply(tempFraction);
                        operator = "";
                        break;
                    case "/":
                        current = current.divide(tempFraction);
                        operator = "";
                        break;
                    default:
                        current = tempFraction;
                        break;
                }
                isFraction = false;
            } else {
                // check and note the operation or respond to other commands
                switch(item.toLowerCase()){
                    case "+":
                        // no break
                    case "-":
                        // no break
                    case "*":
                        // no break
                    case "/":
                        if(operator.equalsIgnoreCase("")){
                            operator = item;
                            break;
                        } else {
                            System.out.println("Error : 2 consecutive operators. Resetting calculator.");
                            return new Fraction(0, 1);
                        }
                    case "a":
                        // no break
                    case "abs":
                        current = current.absValue();
                        break;
                    case "n":
                        // no break
                    case "neg":
                        // no break
                    case "negative":
                        current = current.negate();
                        break;
                    case "c":
                        // no break
                    case "clear":
                        current = new Fraction(0, 1);
                        break;
                    case "q":
                        // no break
                    case "quit":
                        scan.close();
                        scan = null;
                        return new Fraction(0, 1);
                    case "":
                        break;
                    default:
                        System.out.println("Error");
                        return new Fraction(0, 1);
                }
            }
        }
        return current;
    }
    
    boolean checkForDigit(String item){
        // loop through item checking each character for a digit
        for(int j = 0; j < item.length(); j++){
            if(Character.isDigit(item.charAt(j))){return true;}
        }
        return false;
    }
    
    boolean checkIsFraction(String item){
        String delim = ("[/]");
        String parts[] = item.split(delim);
        
        // check that the strings are valid integers, ignoring plus and minus signs
        if(parts.length > 2){
            return false;
        } else {
            for(int i = 0; i < parts.length; i++){
                for(int j = 0; j < parts[i].length(); j++){
                    if(!Character.isDigit(parts[i].charAt(j))){
                        if(j == 0){
                            if(parts[i].charAt(j) != '-' && parts[i].charAt(j) != '+'){
                                return false;
                            }
                        } else {
                            return false;
                        }
                    }
                }
            }
        }
        return true;
    }
    
    Fraction parseFraction(String item){
        // create variables
        int num, denom;
        String delim = ("[/]");
        String parts[] = item.split(delim);

        // get 1st integer
        num = Integer.valueOf(parts[0]);

        // check for 2nd integer & return either the resulting
        // whole number or fraction
        if(parts.length == 2){
            denom = Integer.valueOf(parts[1]);
            return new Fraction(num, denom);
        } else {
            return new Fraction(num, 1);
        }
    }
}