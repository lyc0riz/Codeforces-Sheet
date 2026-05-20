
import java.util.Scanner;

public class H{
    public static void main(String[] args) {
        Scanner scanner  = new Scanner(System.in);
        int num = scanner.nextInt();
        boolean flag= false;
        for (int i =2;i<=Math.sqrt(num);i++){
            if (num%i==0){
                flag=true;
                break;
            }
        }
        if(flag)
            System.out.println("NO");
        else
            System.out.println("YES");
    }
}