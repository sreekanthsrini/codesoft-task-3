import java.util.Random;
import java.util.Scanner;

public class numbergame {
    public static void main(String[] args) {
        boolean play=true;
       
        while (play==true) {

            
        
        System.out.println("WELCOME TO THE GAME");
        Scanner obj=new Scanner(System.in);
        System.out.print("ENTER YOUR VALUE :");
        int uvalue=obj.nextInt();
        
        
        
        int min = 1;
        int max = 100;
        Random random = new Random();
        int randomNumber = random.nextInt(max - min + 1) + min;
        System.out.println("Random number: " + randomNumber);
        
            
    
        if (uvalue==randomNumber) {
            System.out.println("CONGRAZ YOU WON");
            
        }
        else{
            System.out.println("YOU LOSSE");
            System.out.println("BETTER LUCK NEXT TIME");
        }

    }
}
}
