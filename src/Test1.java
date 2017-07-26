import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by 1 on 26.07.2017.
 */
public class Test1 {
    public static void main(String[] args) throws IOException {

        System.out.println("Enter your name and press Enter:");

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String n = br.readLine();

        System.out.println("\n Hello " + n);
        System.out.println("Bye...");
    }
}
