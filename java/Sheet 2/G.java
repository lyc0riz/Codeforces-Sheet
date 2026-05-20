import java.util.Scanner;

public class G{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int testcases = scanner.nextInt();
        for (int i=0;i<testcases;i++){
            int num = scanner.nextInt();
            long fact=1;
            for (int j=1;j<=num;j++)
                fact*=j;
            System.out.println(fact);
        }
    }
}