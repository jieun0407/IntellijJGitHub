import java.io.*;
import java.util.StringTokenizer;

public class ex1920 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());
        int[] A = new int[N];

        StringTokenizer st = new StringTokenizer(br.readLine());

        for(int i=0; i<N; i++){
            A[i] = Integer.parseInt(st.nextToken());
        }

        int M = Integer.parseInt(br.readLine());


        StringTokenizer st1 = new StringTokenizer(br.readLine());
        for (int i=0; i<M; i++){
            boolean result = false;
            int num = Integer.parseInt(st1.nextToken());
            for(int a: A){

                if (num == a) {
                    result = true;
                    break;
                }
            }

            if(result){
                bw.write(1+"\n");
            }else{
                bw.write(0+"\n");
            }
        }

        bw.flush();
        bw.close();
    }
}
