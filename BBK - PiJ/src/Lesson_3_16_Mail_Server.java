import java.util.Scanner;

public class Lesson_3_16_Mail_Server {

    public static void main(String[] args) {
        
        Scanner s = new Scanner(System.in);
        
        String yourAdd;
        String theirAdd = "";
        String text = "";
        
        System.out.println("This program will allow you to create an email.");
        
        while(true){
            System.out.print(">>> ");
            yourAdd = s.nextLine();
            
            if((yourAdd.substring(0,4)).equals("QUIT")){
                return;
            }
            
            if((yourAdd.length()) > 9 &&
                (yourAdd.substring(0, 10)).equals("MAIL FROM:") &&
                yourAdd.contains("@")){
                yourAdd = yourAdd.substring(10);
                System.out.println("OK");
                break;
            }
            
            System.out.println("Invalid command.");
        }
        
        while(true){
            System.out.print(">>> ");
            theirAdd = s.nextLine();
            
            if((theirAdd.substring(0,4)).equals("QUIT")){
                return;
            }
            
            if((yourAdd.length()) > 9 &&
                (theirAdd.substring(0, 8)).equals("RCPT TO:") &&
                theirAdd.contains("@")){
                theirAdd = theirAdd.substring(10);
                System.out.println("OK");
                break;
            }
            
            System.out.println("Invalid command.");
        }
        
        while(true){
            System.out.print(">>> ");
            text = s.nextLine();
            
            if((text.substring(0,4)).equals("QUIT")){
                return;
            }
            
            if((text.substring(0, 4)).equals("DATA")){
                text = "";
                String tempText;
                
                while(true){
                    tempText = s.nextLine();
                    if(tempText.equals(".")){
                        System.out.println("OK");
                        break;
                    }
                    else{
                        text = text + tempText + "\r\n";
                    }
                }
                break;
            }
            
            System.out.println("Invalid command.");
        }
        
        System.out.println("Sending email . . .");
        System.out.println("from: " + yourAdd);
        System.out.println("to: " + theirAdd);
        System.out.println(text);
        
    }
    
}