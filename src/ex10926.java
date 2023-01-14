import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10926 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        StringBuilder sb = new StringBuilder(str);

        sb.append("??!");
        System.out.println(sb);
    }
}
