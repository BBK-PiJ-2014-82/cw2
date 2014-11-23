import java.util.Scanner;

public class FractionCalculator {
    
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
        Scanner scan = new Scanner(System.in);
        
        // welcome message
        System.out.println("Welcome to James Hill's Fraction Calculator.");
        System.out.println("Please enter a calculation below:");
        
        // take commands from the user, display the result or exit
        while(scan.hasNext()){
            input = scan.nextLine();
            value = evaluate(value, input);
            System.out.println(" = " + value.toString());
            }
        
        // closing
        System.out.println("Goodbye.");
    }
    
    // Evauluate the input string and return the result as a fraction.
    // This method can TERMINATE the program (this was necessary because ...
    // the specification requires an 'Exit from program' resulting from ...
    // 'q', 'Q', 'quit' etc. and these items can appear anywhere in an input ...
    // line according to the specification.)
    public Fraction evaluate(Fraction current, String inputString) {
        
        // create variables
        String operator = "";
        String item;
        String delims = "[ ]+";
        Fraction tempFraction = current;
        String[] tokens = inputString.split(delims);
        boolean hasDigit = false;
        boolean isFraction = false;
        
        // parse the string and perform calculations
        for(int i = 0; i < tokens.length; i++) {
            item = tokens[i];
            
            // check if there is a digit in the token
            for(int j = 0; j < item.length(); j++){
                if(Character.isDigit(item.charAt(j))){hasDigit = true;}
            }
            
            // check if this is a fraction & create one if so
            if(hasDigit){
                // create variables
                int num, denom;
                String delim = ("[/]");
                String parts[] = item.split(delim);
                
                // get 1st integer
                num = Integer.valueOf(parts[0]);

                // check for 2nd integer & return either the resulting
                // whole number or fraction
                if(parts.length > 1){
                    denom = Integer.valueOf(parts[1]);
                    tempFraction = new Fraction(num, denom);
                } else {
                    tempFraction = new Fraction(num, 1);
                }
                isFraction = true;
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
                hasDigit = false;
                isFraction = false;
            } else {
                // check and note the operation or respond to other commands
                switch(item){
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
                    case "A":
                        // no break
                    case "abs":
                        // no break
                    case "Abs":
                        current = current.absValue();
                        break;
                    case "n":
                        // no break
                    case "N":
                        // no break
                    case "neg":
                        // no break
                    case "Neg":
                        // no break
                    case "negative":
                        // no break
                    case "Negative":
                        current = current.negate();
                        break;
                    case "c":
                        // no break
                    case "C":
                        // no break
                    case "clear":
                        // no break
                    case "Clear":
                        current = new Fraction(0, 1);
                        break;
                    case "q":
                        // no break
                    case "Q":
                        // no break
                    case "quit":
                        // no break
                    case "Quit":
                        System.out.println("Quit command entered. Goodbye");
                        System.exit(0);
                        break;
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
}