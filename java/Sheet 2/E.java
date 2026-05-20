
import java.util.Scanner;

public class E{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int X= scanner.nextInt();
        int max=-1;
        for (int i=0;i<X;i++){
            int num = scanner.nextInt();
            if (num>max)
                max=num;
        }
        
        System.out.println(max);

    }
}