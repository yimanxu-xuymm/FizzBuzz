public class Reduce {
    public static void main(String[] args) {
        int n = 100, i = 0;
        while(n != 0){
            if(n % 2 == 0){
                n = n / 2; i = i + 1;
            } else if(n % 2 != 0){
                n = n - 1; i = i + 1;
            }
        }System.out.println(i);
    }
}
