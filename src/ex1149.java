import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1149 {
    final static int RED = 0;
    final static int GREEN = 1;
    final static int BLUE = 2;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(br.readLine());
        StringTokenizer st;
        int[][] DP = new int[N+1][3];


        for(int i = 1; i<=N; i++){
            st = new StringTokenizer(br.readLine(), " ");

            /*DP[i][RED] = Integer.parseInt(st.nextToken());
            DP[i][GREEN] = Integer.parseInt(st.nextToken());
            DP[i][BLUE] = Integer.parseInt(st.nextToken());*/

            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());
            int B = Integer.parseInt(st.nextToken());

            DP[i][0] = Math.min(DP[i-1][1], DP[i-1][2]) + R;
            DP[i][1] = Math.min(DP[i-1][0], DP[i-1][2]) + G;
            DP[i][2] = Math.min(DP[i-1][0], DP[i-1][1]) + B;

        }

        System.out.println(Math.min(DP[N][0], Math.min(DP[N][1], DP[N][2])));


    }
}
