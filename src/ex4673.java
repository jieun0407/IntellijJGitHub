public class ex4673 {
    public static void main(String[] args) {
        int arr[] = new int[10000];
        for(int i =1; i<=10000; i++){
            int n =d(i);
            arr[i-1]=n;
        }
        int arr2[] = new int[10000];
        for(int i=1;i<=10000;i++){
            boolean result = false;
            for(int a: arr){
                if(a==i){

                    result = true;
                }
            }

            if(result==false){

                arr2[i++] = i;

            }
        }

        for(int b: arr2){
            System.out.println(b);
        }
    }

    public static int d(int number){
        int n = number + number/100 + number/10%10 + number%10;
        return n;
    }
}
