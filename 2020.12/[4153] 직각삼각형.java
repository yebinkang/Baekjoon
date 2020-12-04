import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        ArrayList<String> arr = new ArrayList<>();
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();

        while(a != 0 || b != 0 || c != 0){
            if(Math.pow(a, 2) + Math.pow(b, 2) == Math.pow(c, 2) ||
                    Math.pow(b, 2) + Math.pow(c, 2) == Math.pow(a, 2) ||
                    Math.pow(a, 2) + Math.pow(c, 2) == Math.pow(b, 2))
                arr.add("right");
            else arr.add("wrong");

            a = in.nextInt();
            b = in.nextInt();
            c = in.nextInt();
        }

        for (String s : arr)
            System.out.println(s);
    }

}