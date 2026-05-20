
import java.util.Scanner;


public class H{
    public static boolean checkprime(int num,int divisor){
        if (num==2) return true;
        if (num%2==0) return false;
        if (num%divisor==0) return false;
        if (divisor*divisor>num) return true;
        return checkprime(num, divisor+1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        if (checkprime(num,2))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}