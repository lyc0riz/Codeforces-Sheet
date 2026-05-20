
import java.util.Scanner;


public class I{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int num = scanner.nextInt();
        int bnum = num;
        int reversenum=0;
        while (num!=0){
            int x=num%10;
            reversenum = (reversenum*10)+x;
            num=num/10;
        }
        System.out.println(reversenum);
        if(bnum==reversenum)
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}