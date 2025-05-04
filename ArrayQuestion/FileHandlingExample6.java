package ArrayQuestion;

import java.io.Console;

public class FileHandlingExample6 {
    public static void main(String[] args) {
        Console c=System.console();
        System.out.println("Enter your name: ");
        String n=c.readLine();
        System.out.println("Welcome"+n);
        System.out.println("Enter password: ");
        char[] ch=c.readPassword("Enter your password for user %s: ","admin");
        String pass=String.valueOf(ch);

        System.out.println(pass);
    }
}
