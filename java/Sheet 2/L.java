import java.util.Scanner;

public class L{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        while(y!=0){
            int temp=y;
            y=x%y;
            x=temp;
        }
        System.out.println(x);
    }
}