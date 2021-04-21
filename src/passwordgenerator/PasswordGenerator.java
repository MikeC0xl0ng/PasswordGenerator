package passwordgenerator;

import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    
    public static String generatePassword(int length){
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
    public static void main(String[] args) {

        System.out.println("HEY! I'm a random password generator, do you want to start?");
        Scanner sc = new Scanner(System.in);
        System.out.print("Press Enter to begin....");
        sc.nextLine();
        
        System.out.print("Let me know how long must your password be: \r\n"
                                        + "-----> ");
        
        int length = -1;
        while (length > 20 || length < 4) {
           while(!sc.hasNextInt())
           {
               System.out.print("The Length must be an integer between 4 and 20");
               sc.next() ;
           }
           length = sc.nextInt();
        }
        System.out.println("Generating Password...");
        try {
            Thread.sleep(3000);
        } catch (InterruptedException ex) {}
        String generatedPassword = generatePassword(length);
        System.out.println("Your new password is: " + generatedPassword);
        
        
    }
    
}
