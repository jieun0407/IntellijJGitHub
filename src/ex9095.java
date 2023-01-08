import java.io.*;

public class ex9095 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int T = Integer.parseInt(br.readLine());
        int[] arr = new int[11];

        arr[0] = 0;
        arr[1] = 1;
        arr[2] = 2;
        arr[3] = 4;

        int a = 0;
        for(int i=0; i<T; i++){

            a = Integer.parseInt(br.readLine());
            for(int j=4; j<=a; j++){
                arr[j] = arr[j-1] + arr[j-2] + arr[j-3];
            }

            bw.write(arr[a]+"\n");
        }

        bw.flush();
        bw.close();
    }
}
