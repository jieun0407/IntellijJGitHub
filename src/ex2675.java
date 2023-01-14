import java.io.*;
import java.util.StringTokenizer;

public class ex2675 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;


        int T = Integer.parseInt(br.readLine());

        for (int i=1; i<=T; i++){
            StringBuilder sb = new StringBuilder();
            st = new StringTokenizer(br.readLine());
            int R = Integer.parseInt(st.nextToken());
            String S = st.nextToken();
            for (int j=0; j<S.length(); j++){

                for(int k=1; k<=R; k++){

                    sb.append(S.charAt(j));
                }

            }

            System.out.println(sb);
        }
    }
}
