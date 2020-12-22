import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();

        ArrayList<Integer> arr = new ArrayList<>();

        //배열의 가장 마지막 인덱스
        int index = -1;

        for(int i = 0; i < n; i++){
            int number = in.nextInt();
            if(number != 0) {
                arr.add(number);
                index++;
            }
            else arr.remove(index--);
        }

        int total = 0;
        for(int a : arr)
            total += a;
        System.out.println(total);
    }
}