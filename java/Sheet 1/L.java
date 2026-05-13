import java.util.Scanner;

public class L{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] p1 = scanner.nextLine().split(" ");
        String[] p2 = scanner.nextLine().split(" ");
        System.out.println((p1[1].equals(p2[1]))? "ARE Brothers": "NOT");
    }
}