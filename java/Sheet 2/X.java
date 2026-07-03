import java.util.Scanner;

public class X {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0;i<N;i++){
            int a=scanner.nextInt();
            int count = Integer.bitCount(a);
            System.out.println((1<<count)-1);
        }
    }
}
