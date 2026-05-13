import java.util.Scanner;

public class C{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var x = scanner.nextLong();
        var y = scanner.nextLong();
        System.out.printf("%d + %d = %d%n",x,y,x+y);
        System.out.printf("%d * %d = %d%n",x,y,x*y);
        System.out.printf("%d - %d = %d%n",x,y,x-y);
    }
}