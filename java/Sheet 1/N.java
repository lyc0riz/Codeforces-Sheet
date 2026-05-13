import java.util.Scanner;

public class N {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char x = scanner.next().charAt(0);
        
        if (x>='a' && x<='z'){
            System.out.println((char)(x-32));
        }
        else
            System.out.println((char)(x+32));
    }
}