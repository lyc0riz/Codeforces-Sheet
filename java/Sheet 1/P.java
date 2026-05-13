import java.util.Scanner;

public class P{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String num = scanner.next();
        System.out.println(((int) num.charAt(0)%2==0)?"EVEN":"ODD");
    }
}