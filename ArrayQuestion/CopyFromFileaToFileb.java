package ArrayQuestion;

//import java.io.File;
//import java.io.FileInputStream;
//import java.io.FileNotFoundException;
//import java.io.FileOutputStream;
//
//public class FileHandlingExample {
//    public static void main(String[] args) {
//        try{
//            FileOutputStream fout=new FileOutputStream("C:\\Users\\kyabh\\Desktop\\FIlehaandling\\IMG-20241226-WA0011");
//            FileInputStream iout=new FileInputStream("C:\\Users\\kyabh\\Desktop\\FileHandling2\\File2.img");
//        }catch (FileNotFoundException e){
//            System.out.println(e.getMessage());
//        }
//
//
//    }
//}


import java.io.*;
import java.util.*;

public class CopyFromFileaToFileb {

    public static void copyContent()
            throws Exception
    {
        FileInputStream in = new FileInputStream("C:\\Users\\kyabh\\Desktop\\FileHandling2\\file1.text");
        FileOutputStream out = new FileOutputStream("C:\\Users\\kyabh\\Desktop\\FileHandling2\\file2.text");

        try {
            int n;
            while ((n = in.read()) != -1) {

                out.write(n);
            }
        }
        finally {
            if (in != null) {
                in.close();
            }
            if (out != null) {
                out.close();
            }
        }
        System.out.println("File Copied");
    }

    public static void main(String[] args) throws Exception
    {
    copyContent();
    }
}

