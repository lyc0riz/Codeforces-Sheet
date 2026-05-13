
import java.util.Scanner;

public class Y{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long X=1;
        
        for (int i=0;i<4;i++){
            X *= scanner.nextLong();
            X%=100;
        }
        System.out.printf("%02d",X);
    }
}