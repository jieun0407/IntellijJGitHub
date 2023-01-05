import java.io.*;

public class ex8958 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));
        int N = Integer.parseInt(br.readLine());
        int sum;
        int score;
        String[] arr;

        for(int i=0; i<N; i++){
            score = 0;
            sum = 0;
            String str = br.readLine();
            arr = new String[str.length()];
            for(int j=0; j<str.length(); j++){
                arr[j] = String.valueOf(str.charAt(j));
                if(arr[j].equals("O")){
                    ++score;
                    sum += score;
                }else if(arr[j].equals("X")){
                    score =0;
                }

            }
            bw.write(sum+"\n");

        }

        bw.flush();
        bw.close();
    }
}
