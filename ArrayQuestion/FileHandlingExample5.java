package ArrayQuestion;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileHandlingExample5 {
    public static void main(String[] args) {
        try{
            FileWriter fwrite =new FileWriter("C:\\Users\\kyabh\\Desktop\\FIlehaandling\\file1.text");

            FileReader reader=new FileReader("C:\\Users\\kyabh\\Desktop\\FIleHandling\\file1.text");
            fwrite.write("hello my Name is abhishek");
            fwrite.close();
            System.out.println("Contant copy successfyl");
            int character;
            while ((character=reader.read())!=-1){
                System.out.println((char)character);
            }
            reader.close();
        }catch (IOException e){
            System.out.println(e.getMessage());
        }
    }
}
