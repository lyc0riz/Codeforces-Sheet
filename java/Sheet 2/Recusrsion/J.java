import java.util.Scanner;

public class J{
    public static boolean checkprime(int num,int divisor){
        if (num==2) return true;
        if (num%divisor==0) return false;
        if (divisor*divisor>num) return true;
        return checkprime(num, divisor+1);
    }
    public static void checknext(int currentNum,int N){
        if (currentNum>N) return;
        if (checkprime(currentNum,2))
            System.out.print(currentNum+" ");
        checknext(currentNum+1, N);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        checknext(2, N);
    }
}