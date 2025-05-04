package ArrayQuestion;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.InputMismatchException;

public class FIleHandlingExample4 {
    public static void main(String[] args) {
        try{
            FileOutputStream fout=new FileOutputStream("C:\\Users\\kyabh\\Desktop\\FileHandling2");
            FileInputStream input=new FileInputStream("C:\\Users\\kyabh\\Desktop\\FIlehaandlingk");

            String s="Erlcome to greater Noida";
            byte[] b=s.getBytes();
            fout.write(b);
            fout.close();
            System.out.println("Success");
            int byteData;

            while ((byteData= input.read())!=-1){
                System.out.println((char)byteData);
            }
        } catch (Exception e) {
            throw new RuntimeException(e);

        }
    }
}
