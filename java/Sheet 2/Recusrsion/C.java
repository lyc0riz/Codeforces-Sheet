import java.util.Scanner;

public class C{
    static int even=0;
    static int odd=0;
    static int positive=0;
    static int negative=0;

    public static void numcount(int numleft, Scanner scanner){
        
        if (numleft==0) return;
        
        int currentnumber = scanner.nextInt();

        if (currentnumber>0)
            positive+=1;
        if (currentnumber<0)
            negative+=1;
        if (currentnumber%2==0)
            even+=1;
        else
            odd+=1;
        
        numcount(numleft-1,scanner);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X= scanner.nextInt();

        numcount(X,scanner);
        System.out.printf("Even: %d%n",even);
        System.out.printf("Odd: %d%n",odd);
        System.out.printf("Positive: %d%n",positive);
        System.out.printf("Negative: %d%n",negative);
    }
}