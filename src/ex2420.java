import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex2420 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());
        long N = Integer.parseInt(st.nextToken()), M=Integer.parseInt(st.nextToken());
        long dif = N-M;
        System.out.println(Math.abs(dif));
    }
}
