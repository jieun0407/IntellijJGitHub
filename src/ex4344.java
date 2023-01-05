import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class ex4344 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int C = Integer.parseInt(br.readLine());

        for(int i=0; i<C; i++){
            StringTokenizer st = new StringTokenizer(br.readLine()," ");
            int sum = 0;
            double avg = 0;
            int N = Integer.parseInt(st.nextToken());
            int arr [] = new int[N];
            for(int j=0; j<N; j++){
                arr[j] = Integer.parseInt(st.nextToken());
                sum += arr[j];
                avg = sum/(double)N;
            }
            int cnt=0;
            for(int a : arr){

                if(a>avg){
                    ++cnt;
                }
            }

            double result = cnt/(double)N * 100;

            System.out.println(String.format("%.3f", result) + "%");

        }
    }
}
