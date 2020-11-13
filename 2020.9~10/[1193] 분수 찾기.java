import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = in.nextInt();
        int[] arr = new int[2];

        int c = 0;
        int s = 2;
        int e = 0;

        do{
            for(int i = 1; i < s; i++, c++){
                if(c == count) {
                    e = 1;
                    break;
                }
                if(s % 2 == 0) {
                    arr[0] = s-i;
                    arr[1] = i;
                } else {
                    arr[0] = i;
                    arr[1] = s-i;
                }
            }
            s++;
        } while(e == 0);

        System.out.println(arr[0] + "/" + arr[1]);
    }
}