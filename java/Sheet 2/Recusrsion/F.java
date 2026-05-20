
import java.util.Scanner;

public class F{
    public static void table(int num,int x){
        if (x==13) return;
        System.out.printf("%d * %d = %d%n",num,x,num*x);
        table(num,x+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int x=1;
        table(num,x);
    }
}