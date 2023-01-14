import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ex10872 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int N = Integer.parseInt(br.readLine());
        int sum = 1;
        if(N!=0){
            for(int i=N; i>0; i--){
                sum *= i;
            }
        }

        System.out.println(sum);

    }
}
