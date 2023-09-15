public class Multiples {
    public static void main(String[] args) {
        int count = 0, i = 0;
        while (i < 1000){
            if(i % 3 == 0){
                count = count + 1;
            } else if (i % 5 == 0){
                count = count + 1;
            }
            i++;
        } System.out.println(i);
    }
}
