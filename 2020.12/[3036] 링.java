import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < arr.length; i++)
            arr[i] = in.nextInt();

        String[] answer = new String[n];
        for (int i = 1; i < arr.length; i++) {
            answer[i] = irreducibleFraction(arr[0], arr[i]);
        }

        for (int i = 1; i < arr.length; i++)
            System.out.println(answer[i]);

    }

    static String irreducibleFraction(int a, int b) {

        //최대 공약수 구하기
        int max = Math.max(a, b);
        int g = 1;
        for (int i = 1; i <= max; i++)
            if (a % i == 0 && b % i == 0) g = i;

        //기약분수로 변환해 반환
        return (a / g) + "/" + (b / g);
    }

}
