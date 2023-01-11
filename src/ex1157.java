import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;

public class ex1157 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String str = br.readLine();
        String[] arr = new String[str.length()];
        HashSet<String> set = new HashSet<>(str.length());

        for(int i = 0; i<str.length(); i++){
            arr[i] = String.valueOf(str.charAt(i));
            for(int j=0; j<i; j++){

                if(arr[j].equalsIgnoreCase(arr[i])){

                    set.add(arr[i]);
                }
            }
        }

        if(arr.length==1){
            System.out.println(arr[0].toUpperCase());
        }

        else if(set.size()>1){
            System.out.println("?");
        }else{
            for(String s: set){
                System.out.println(s.toUpperCase());
            }
        }
    }
}
