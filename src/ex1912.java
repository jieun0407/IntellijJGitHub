import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1912 {
    static int[] arr;
    static Integer[] dp;
    static int max;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine());

        /*int[] arr = new int[n];
        int[] dp = new int[n];

        for(int i=0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        int max = arr[0];

        for(int i =1; i<n; i++){
            dp[i] = Math.max(dp[i-1] + arr[i], arr[i]);

            max = Math.max(max, dp[i]);

        }

        System.out.println(max);*/
        /*dp[1] = arr[0] > arr[1] ? arr[0] : arr[1];
        for(int i=2; i<n; i++){
            int sum = 0;
            for(int j=0; j<=i-1; j++){
                sum += arr[j];
            }
            System.out.println(i);
            dp[i] = Math.max(dp[i-1], sum) + arr[i];

        }
        //dp[2] = dp[1] + arr[2] > arr[0] + arr[1] + arr[2]  ? dp[1] + arr[2] : arr[0] + arr[1] + arr[2];
        System.out.println(dp[n-1]);*/

        arr= new int[n];
        dp = new Integer[n];

        for(int i =0; i<n; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        dp[0] = arr[0];
        max = arr[0];

        recur(n-1);

        System.out.println(max);
    }

    static int recur(int n){
        if(dp[n] == null){
            dp[n] = Math.max(recur(n-1) + arr[n], arr[n]);
            max = Math.max(dp[n], max);

        }

        return dp[n];
    }
}
