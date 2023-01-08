import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex1152 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String str = br.readLine();
        str = str.trim();
        String[] arr = str.split(" ");

        if(str.isEmpty() == false) System.out.println(arr.length);
        else System.out.println(0);

    }
}
