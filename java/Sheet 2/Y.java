import java.util.Scanner;

public class Y {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        long prev1 = 0;
        long prev2 = 1;
        if(N>=1)
            System.out.print("0 ");
        if(N>=2)
            System.out.print("1 ");
        for(int i=3;i<=N;i++){
            long current= prev1+prev2;
            System.out.printf("%d ",current);
            prev1=prev2;
            prev2=current;
        }
    }
}
