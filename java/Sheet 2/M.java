
import java.util.Scanner;

public class M{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        boolean foundlucky=false;

        for(int i=x;i<=y;i++){
            int temp=i;
            while (temp>0){
                int digit = temp%10;
                if (digit==4 || digit==7){
                    temp = temp/10;
                }
                else
                break;
            }
            if (temp==0){
                System.out.print(i+" ");
                foundlucky=true;
            }
        }
        if(foundlucky==false){
            System.out.println("-1");
        }
    }
}