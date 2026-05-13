import java.util.Scanner;

public class M{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        char X = scanner.next().charAt(0);
        
        if (X>='0'&& X<='9'){
            System.out.println("IS DIGIT");
        }
        else {
            System.out.println("ALPHA");
            if(X>='A' && X<='Z'){
                System.out.println("IS CAPITAL");
            }
            else{
                System.out.println("IS SMALL");
            }
        }
    }
}