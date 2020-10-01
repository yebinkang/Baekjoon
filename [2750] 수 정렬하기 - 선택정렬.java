import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int size = in.nextInt();
        int[] numbers = new int[size];
        for(int i = 0; i < size; i++)
            numbers[i] = in.nextInt();

        //선택정렬
        for(int i = 0; i < size - 1; i++){
            int minIndex = i;
            int j;
            for(j = i + 1; j < size; j++){
                if(numbers[minIndex] > numbers[j]) {
                    minIndex = j;
                }
            }
            int tmp = numbers[i];
            numbers[i] = numbers[minIndex];
            numbers[minIndex] = tmp;
        }

        for(int i = 0; i < size; i++)
            System.out.println(numbers[i]);
    }
}
