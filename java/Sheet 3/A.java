import java.util.Scanner;

public class A {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        long sum=0;
        for(int i=0;i<N;i++){
            sum+=scanner.nextInt();
        }
        System.out.println(Math.abs(sum));
    }
}
