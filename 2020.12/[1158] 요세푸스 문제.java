import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        YArray a = new YArray(n, k);
        System.out.print("<");
        for (int i = 0; i < a.firstSize; i++) {
            if (i != a.firstSize - 1)
                System.out.print(a.nextNumber() + ", ");
            else
                System.out.print(a.nextNumber() + ">");
        }

    }

}

class YArray {
    int firstSize;
    int size;
    int[] arr;
    int index;

    public YArray(int size, int index) {
        this.firstSize = size;
        this.size = size;
        this.index = index - 1;
        this.arr = new int[this.size];
        for (int i = 0; i < this.size; i++)
            arr[i] = i + 1;
    }

    int nextNumber() {
        int index = this.index;
        if (index >= arr.length) {
            index %= arr.length;
        }
        int n = this.arr[index++];
        int[] arr = new int[size - 1];
        int i = 0;
        for (; index < this.size; i++, index++) {
            arr[i] = this.arr[index];
        }
        for (int j = 0; i < this.size - 1; i++, j++)
            arr[i] = this.arr[j];
        this.arr = arr;
        this.size--;
        return n;
    }

}