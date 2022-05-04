package Lab8;
import java.io.*;

public class Main {
    public static void main (String [] args) {
        try {
        FileWriter writer = new FileWriter("C://files/file_1.txt, C://files/file_1.txt c", false);
        // запись всей строки
            String text = "Hello CZN!";
            writer.write(text);
            // запись по символам
            writer.append('\n');
            writer.append("APPEND");
            writer.flush();
        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }
    }
}

