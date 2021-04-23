package passwordgenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    
    public static Scanner sc = new Scanner(System.in);
    
    public static String generatePassword(int length){
        System.out.println("Generating Password...");
        String password = "";
        int i;
        for(i = 0; i < length; i++)
            password = password + generateRandomChar();
        return password;
    }

    public static char generateRandomChar(){
        Random rand = new Random();
        int randomCharASCII = rand.nextInt(126-33)+33;
        return (char)randomCharASCII;
    }
    
    public static void greetingMessage(){
        System.out.println("HEY! I'm a random password generator, do you want to start?");
        System.out.print("Press Enter to begin....");
        sc.nextLine();
    }
    
    public static  int getLength(){
        int length = -1;
        while (length > 30 || length < 4) {
           System.out.print("-----> ");
           length = sc.nextInt();    
        }
        return length;
    }
    
    public static void main(String[] args) {

        greetingMessage();
        System.out.println("Password should be at least 4 characters, meanwhile a strong passwords are longer than 8");
        System.out.print("Let me know how long must your password be: \r\n");
        int length = getLength();
        String generatedPassword = generatePassword(length);
        System.out.println("Your new password is: " + generatedPassword);    
        
    } 
}