import java.io.*;
import java.util.ArrayDeque;

public class ex10866 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int N = Integer.parseInt(br.readLine());

        ArrayDeque<Integer> ad = new ArrayDeque<>();

        for(int i=0; i<N; i++){
            String str[] = br.readLine().split(" ");

            switch (str[0]){
                case "push_front":
                    ad.addFirst(Integer.parseInt(str[1]));
                    break;
                case "push_back" :
                    ad.addLast(Integer.parseInt(str[1]));
                    break;
                case "pop_front" :
                    if(ad.size()>0) bw.write(ad.pollFirst()+"\n");
                    else bw.write(-1+"\n");
                    break;
                case "pop_back":
                    if(ad.size()>0) bw.write(ad.pollLast()+"\n");
                    else bw.write(-1+"\n");
                    break;
                case "size" :
                    bw.write(ad.size()+"\n");
                    break;
                case "empty" :
                    if(ad.isEmpty()) bw.write(1+"\n");
                    else bw.write(0+"\n");
                    break;
                case "front" :
                    if(ad.isEmpty()) bw.write(-1+"\n");
                    else bw.write(ad.getFirst()+"\n");
                    break;
                case "back" :
                    if(ad.isEmpty()) bw.write(-1+"\n");
                    else bw.write(ad.getLast()+"\n");
            }
        }

        bw.flush();
        bw.close();
    }

}
