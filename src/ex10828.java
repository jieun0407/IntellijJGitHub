import java.io.*;
import java.util.StringTokenizer;

public class ex10828 {

    static int[] arr;
    static int cnt;
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        int N = Integer.parseInt(br.readLine());
        arr = new int[N];

        for(int i=0; i<N; i++){
            st = new StringTokenizer(br.readLine(), " ");
            String str = st.nextToken();
            String num = null;
            if(st.hasMoreTokens()){
                num = st.nextToken();
            }

            switch (str){
                case "pop":
                    bw.write(pop()+"\n");
                    break;
                case "push":
                    push(Integer.parseInt(num));
                    break;
                case "size":
                    bw.write(size()+"\n");
                    break;
                case "empty":
                    bw.write(empty()+"\n");
                    break;
                case "top":
                    bw.write(top()+"\n");
                    break;
            }

        }
        bw.flush();
        bw.close();

    }

    static int pop(){
     if(cnt==0){
         return -1;
     }else{
         int result = arr[cnt-1];
         cnt--;
         return result;
     }

    }

    static void push(int num){
        arr[cnt++] = num;
    }

    static int size(){
        return cnt;
    }

    static int empty(){
        if(cnt == 0) return 1;
        else return 0;
    }

    static int top(){
        if(cnt>0) return arr[cnt-1];
        else return -1;

    }
}
