import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex2193 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        //Math.pow(10, 3);

        long[] dp = new long[N+1];

        dp[0] = 0;
        dp[1] = 1;
        /*dp[2] = 1;
        dp[3] = 2;
        dp[4] = 3;
        dp[5] = 5;
        dp[6] = 7;
        dp[7] = 10;*/
        for(int i=2; i<=N; i++){
            dp[i] = dp[i-1] + dp[i-2];
        }


        System.out.println(dp[N]);
    }

}
