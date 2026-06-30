import java.util.Scanner;

public class R{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) { 
            int M = scanner.nextInt();
            int N = scanner.nextInt();
            
            if (N<=0 || M<=0)
                break;
            
            int min = Integer.min(N,M);
            int max = Integer.max(N,M);
            int sum=0;

            for(int i=min;i<=max;i++){
                System.out.print(i+" ");
                sum+=i;
            }
            System.out.printf("sum ="+sum+"%n");

        }
    }
}