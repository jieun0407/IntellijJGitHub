public class ex4673 {
    public static void main(String[] args) {
        boolean[] check = new boolean[10001];
        for(int i =1; i<10001; i++){
            int n =d(i);
            if(n<10001){
                check[n] = true;
            }
        }

        //StringBuilder sb = new StringBuilder();

        for(int i=1; i<10001; i++){
            if(!check[i]){
                System.out.println(i);

            }
        }

    }

    public static int d(int number){

        //int n = number + number/100 + number/10%10 + number%10;
        int sum = number;

        while(number!=0){
            sum = sum + (number%10); //첫째자리수
            number = number/10; //10을 나누어 첫째자리를 없앤다
        }
        return sum;
    }
}
