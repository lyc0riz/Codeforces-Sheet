
import java.util.Scanner;

public class G{
    public static long factorial(int n){
        if (n==0) return 1;
        else
        return n*factorial(n-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int i=0;i<testcases;i++){
            int num = scanner.nextInt();
            System.out.println(factorial(num));
        }
    }
}