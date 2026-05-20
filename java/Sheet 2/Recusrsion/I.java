
import java.util.Scanner;


public class I{
    public static int palindrome(int num, int reversednum){
        if (num==0) return reversednum;
        int x = num%10;
        reversednum=(reversednum*10)+x;
        return palindrome(num/10, reversednum);

    }
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        int bnum = num;
        System.out.println(palindrome(num,0));
        if (bnum==palindrome(num,0))
            System.out.println("YES");
        else
            System.out.println("NO");

    }
}