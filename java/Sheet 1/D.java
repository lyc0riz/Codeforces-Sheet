import java.util.Scanner;

public class D{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var A = scanner.nextLong();
        var B = scanner.nextLong();
        var C = scanner.nextLong();
        var D = scanner.nextLong();
        System.out.println("Difference = " + ((A*B)-(C*D)));
    }
}