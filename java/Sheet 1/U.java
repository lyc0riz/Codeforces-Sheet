
import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String S= scanner.next();

        String[]input = S.split("\\.");
        
        if (input.length>1 && Integer.parseInt(input[1])>0)
            System.out.printf("float %s 0.%s%n",input[0],input[1]);
        else 
            System.out.printf("int %s%n",input[0]);
    }
}