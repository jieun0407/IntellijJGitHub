import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex11654 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        int num = str.charAt(0);

        System.out.println(num);
    }
}
