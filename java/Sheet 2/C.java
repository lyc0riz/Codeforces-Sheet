import java.util.Scanner;

public class C{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        int even=0;
        int odd=0;
        int positive=0;
        int negative=0;
        for (int i =0; i<x;i++){
            int z=scanner.nextInt();
            if (z>0)
                positive+=1;
            if (z<0)
                negative+=1;
            if (z%2==0)
                even+=1;
            else
                odd+=1;
        }
        System.out.printf("Even: %d%n",even);
        System.out.printf("Odd: %d%n",odd);
        System.out.printf("Positive: %d%n",positive);
        System.out.printf("Negative: %d%n",negative);
    }
}