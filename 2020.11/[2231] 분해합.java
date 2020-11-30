import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int n = new Scanner(System.in).nextInt();
        boolean a = false; //생성자 있는지 여부

        for(int i = 1; i < n; i++){
            if(i + i/1000000 + i%1000000/100000 + i%100000/10000
                    + i%10000/1000 + i%1000/100 + i%100/10 + i%10 == n) {
                System.out.println(i);
                a = true;
                break;
            }
        }

        if(!a) System.out.println(0);
    }

}