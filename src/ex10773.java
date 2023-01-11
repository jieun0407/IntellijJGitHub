import java.io.*;

public class ex10773 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int K = Integer.parseInt(br.readLine());
        int[] arr = new int[K];

        int cnt = 0;
        int sum = 0;

        for(int i = 0; i<K; i++){
            int num = Integer.parseInt(br.readLine());
            if(num!=0){
                arr[cnt++] = num;
            }
            else{
                arr[cnt-1] = 0;
                cnt--;
            }
        }

        for(int a: arr){
            sum += a;
        }

        bw.write(sum+" ");
        bw.flush();
        bw.close();

    }
}
