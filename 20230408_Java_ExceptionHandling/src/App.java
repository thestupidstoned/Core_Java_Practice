import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

public class App {

    public static void fileCheck(String filename) throws IOException{
        System.out.println("FUNCTION:START");
        int pos = 0;
        File file = new File(filename);
     
            FileInputStream fis = new FileInputStream(file);

            int i = fis.read();

            while (i != -1) {
                System.out.print((char) i);
                i = fis.read();
                pos++;

        
       
    }
    System.out.println("FUNCTION:END" + pos);
}

    public static void main(String[] args) throws IOException {

        String filename = "src\\input.txt";
        File file= new File(filename);
      
        System.out.println(  file.exists());

    fileCheck(filename);
        System.out.println("MAIN:FUNCTION REMAMING CODE");

    }
}
