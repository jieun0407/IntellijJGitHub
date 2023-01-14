import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex1260 {
    static StringBuilder sb = new StringBuilder();
    static boolean[] check;
    static int N;
    static int[][] arr;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        N = Integer.parseInt(br.readLine());
        int M = Integer.parseInt(br.readLine());
        int V = Integer.parseInt(br.readLine());

        arr = new int[N+1][N+1];
        check = new boolean[N+1];

        for(int i=0; i<M; i++){
            StringTokenizer str = new StringTokenizer(br.readLine());

            int a = Integer.parseInt(str.nextToken());
            int b = Integer.parseInt(str.nextToken());

            arr[a][b] = arr[b][a] = 1;

        }

    }

    public static void dfs(int start){
        check[start] = true;
        sb.append(start + " ");

        for(int i =0; i<=N; i++){
            if(arr[start][i] == 1 && !check[i]){
                dfs(i);
            }
        }
    }

    public static void bfs(int start){

    }
}
