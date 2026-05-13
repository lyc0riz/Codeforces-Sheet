import java.util.Scanner;

public class B{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[] input = scanner.nextLine().split(" ");
        for (String i :input) {
            System.out.println(i);
        }
    }
}