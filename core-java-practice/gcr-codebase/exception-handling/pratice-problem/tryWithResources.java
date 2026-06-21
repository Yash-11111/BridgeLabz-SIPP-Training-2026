import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class tryWithResources {
    static void readFile(){
        try(BufferedReader br = new BufferedReader(new FileReader("data.txt"))){
            String line = br.readLine();
            System.out.println(line);
        }
        catch(IOException e){
            System.out.println("Error reading file");
        }
    }
    public static void main(String[] args) {
        readFile();
    }
}
