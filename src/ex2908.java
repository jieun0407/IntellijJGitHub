import java.io.*;
import java.util.StringTokenizer;

public class ex2908 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int A = change(Integer.parseInt(st.nextToken()));
        int B = change(Integer.parseInt(st.nextToken()));


        System.out.println(Math.max(A, B));

    }

    static int change(int num){
        num = (num%10)*100 + (num%100/10) * 10 + (num/100);
        return num;
    }
}
