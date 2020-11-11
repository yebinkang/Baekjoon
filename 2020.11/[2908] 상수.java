import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String a = in.next();
        String b = in.next();

        int ar = 0;
        int br = 0;


        //배열 값에서 배열의 인덱스만큼 10을 제곱하면, 원래의 수를 거꾸로한 것이 된다.
        /* ex) 123은 arr[0] = 1, arr[1]=2, arr[2]=3이고,
        1*10^1 + 2*10^1 + 3*10^2 = 321가 된다. */
        for(int i = 0; i < a.length(); i++)
            ar += ((int)a.charAt(i) -48) * Math.pow(10, i);

        for(int i = 0; i < b.length(); i++)
            br += ((int)b.charAt(i) -48) * Math.pow(10, i);

        System.out.println(Math.max(ar, br));

    }
}
