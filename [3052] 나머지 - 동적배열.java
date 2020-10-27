import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<Integer> remainder = new ArrayList<>();
        int[] numbers = new int[10];

        for(int i = 0; i < numbers.length; i++)
            numbers[i] = in.nextInt();

        for (int n : numbers) {
            boolean m = true;
            int r = n % 42;
            for (int i : remainder) {
                if (i == r) {
                    m = false;
                    break;
                }
            }
            if(m) remainder.add(r);
        }

        System.out.println(remainder.size());
    }

}