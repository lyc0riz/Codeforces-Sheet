import java.util.Scanner;

public class Q{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            String N = scanner.next();
            StringBuilder n = new StringBuilder(N).reverse();
            for(int j=0;j<n.length();j++){
                System.out.print(n.charAt(j)+" ");
            }
            System.out.printf("%n");
        }
    }
}