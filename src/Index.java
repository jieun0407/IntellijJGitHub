import java.io.*;
import java.util.Scanner;

public class Index {
    public static void main(String[] args) throws IOException {
        //Scanner sc = new Scanner(System.in);
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        int cnt = 0;
        int copy = N;

        do{
            N = ((N%10)*10) + ((N/10) + (N%10)) % 10;
            cnt++;
        }while(copy!=N);

        //int a = (N%10)*10; //10의 자릿수
        //int b = ((N/10)+(N%10))%10; //1의 자릿수
        //System.out.println(cnt);
        bw.write(cnt+"");

        bw.flush();
        bw.close();



    }
}
