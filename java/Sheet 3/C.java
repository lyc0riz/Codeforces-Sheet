import java.util.Scanner;

public class C {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0;i<N;i++){
            int X = scanner.nextInt();
            if(X>0)
                System.out.print("1 ");
            if(X==0)
                System.out.print("0 ");
            if(X<0)
                System.out.print("2 ");
        }
    }
}
