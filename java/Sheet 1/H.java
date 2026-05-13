import java.util.Scanner;
import java.lang.Math;

public class H{
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        int A = scanner.nextInt();
        int B = scanner.nextInt();
        double round =(double) A/B;
        System.out.printf("floor %d / %d = %d%n",A,B,Math.floorDiv(A, B));
        System.out.printf("ceil %d / %d = %d%n",A,B,Math.ceilDiv(A, B));
        System.out.printf("round %d / %d = %d%n",A,B,Math.round(round));

    }
}