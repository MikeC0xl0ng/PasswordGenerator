package passwordgenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    
    public static String generatePassword(){
        String password = "";
        int i;
        for(i = 0; i < 10; i++)
            password = password + generateRandomChar();
        return password;
    }

    public static char generateRandomChar(){
        Random rand = new Random();
        int randomCharASCII = rand.nextInt(126-33)+33;
        return (char)randomCharASCII;
    }
    public static void main(String[] args) {

        System.out.println("HEY! I'm a random password generator, do you want to start?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Press Enter to begin....");
        sc.nextLine();
        
        int length = 10;
        System.out.println("Generating Password...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {}
        String generatedPassword = generatePassword();
        System.out.println("Your new password is: " + generatedPassword);
        
        
    }
    
}
