package passwordgenerator;

import java.util.Random;

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

        int length = 10;
        System.out.println("Generating Password...");
        try {
            Thread.sleep(5000);
        } catch (InterruptedException ex) {}
        String generatedPassword = generatePassword();
        
        
    }
    
}
