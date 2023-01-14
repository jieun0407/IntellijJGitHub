import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex11053 {
    static int[] arr;
    static Integer[] dp;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        /*int[] arr = new int[N];
        int[] dp = new int[N];

        for(int i=0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());
        }

        for(int i=0; i<N; i++){
            dp[i] = 1;

            for(int j=0; j<i; j++){
                //j번째 원소가 i번째 원소보다 작으면서 i번째 dp가 j번째 dp+1 값보다 작을 경우
                if(arr[j] < arr[i] && dp[i] < dp[j] + 1){
                    dp[i] = dp[j] + 1;
                }
            }
        }*/

       /* int max = -1;
        for(int i=0; i<N; i++){
            max = dp[i] > max ? dp[i] : max;

        }*/

        arr = new int[N];
        dp = new Integer[N];

        for(int i =0; i<N; i++){
            arr[i] = Integer.parseInt(st.nextToken());

        }

        for(int i =0; i<N; i++){
            LIS(i);
        }

        int max = dp[0];
        for(int i =0; i<N; i++){
            max = Math.max(max, dp[i]);
        }


        System.out.println(max);

    }

    static int LIS(int N){
        if(dp[N] == null){
            dp[N] = 1;

            for(int i = N-1; i>=0; i--){
                if(arr[i]< arr[N]){
                    dp[N] = Math.max(dp[N], LIS(i) + 1);
                }
            }

        }

        return dp[N];
    }

}
