import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a = in.nextInt();
        int b = in.nextInt();
        ArrayList<String> answers = new ArrayList<>();

        while(a != 0 && b != 0){
            if(b % a == 0) answers.add("factor");
            else if(a % b == 0) answers.add("multiple");
            else answers.add("neither");

            a = in.nextInt();
            b = in.nextInt();
        }

        for(String s : answers)
            System.out.println(s);


    }

}