import java.util.Scanner;

public class F{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var  N = scanner.nextLong();
        var M =  scanner.nextLong();
        System.out.println((N%10)+(M%10));
    }
}