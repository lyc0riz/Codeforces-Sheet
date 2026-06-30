
import java.util.Scanner;

public class N{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S = scanner.next();
        int N = scanner.nextInt();
        for (int i=0;i<N;i++){
            int x=scanner.nextInt();
            for (int j=0;j<x;j++){
                System.out.print(S);
            }
            System.out.println("");
        }
    }
}