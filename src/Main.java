import java.io.*;
import java.util.HashSet;
import java.util.StringTokenizer;

public class Main {
    public static <dobule> void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        HashSet<Integer> hs = new HashSet<Integer>();

        for(int i=0; i<10; i++){
            hs.add(Integer.parseInt(br.readLine())%42);
        }

        System.out.println(hs.size());
    }


}