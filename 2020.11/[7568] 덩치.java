import java.io.IOException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(System.in);

        int n = in.nextInt();
        Size[] sizes = new Size[n];

        for(int i = 0; i < sizes.length; i++){
            sizes[i] = new Size(in.nextInt(), in.nextInt());
        }

        for (Size size : sizes) {
            int r = size.rank(sizes);
            System.out.print(r + " ");
        }
    }

}

class Size{
    int height;
    int weight;

    public Size(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }

    //인수가 자신보다 덩치가 더 큰 사람이면 true 반환하는 함수
    boolean compare(Size s){
        return height < s.height && weight < s.weight;
    }

    //자신의 등수를 반환하는 함수
    int rank(Size ... s){
        int r = 0;
        for (Size size : s) {
            if (compare(size)) r++;
        }
        return r + 1;
    }
}