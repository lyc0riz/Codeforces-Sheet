
import java.util.Scanner;

public class D{
    public static void checkpass(Scanner scanner){
        int pass = scanner.nextInt();
        if (pass==1999){
            System.out.println("Correct");
        }
        else {
            System.out.println("Wrong");
            checkpass(scanner);
        }

    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        checkpass(scanner);
    }
}