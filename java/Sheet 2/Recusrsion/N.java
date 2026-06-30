
import java.util.Scanner;

public class N{
     static Scanner scanner = new Scanner(System.in);
    public static void printer(int n, String s){
        if(n==0) return;
        System.out.print(s);
        printer(n-1, s);
    }
    public static void picker(int N, String s){
        if(N==0) return;
        int x = scanner.nextInt();
        printer(x, s);
        System.out.println("");
        picker(N-1, s);
    }
    public static void main(String[] args) {
        String S = scanner.next();
        int N  = scanner.nextInt();
        picker(N, S);
    }
}