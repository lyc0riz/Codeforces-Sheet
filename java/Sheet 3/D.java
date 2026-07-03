import java.util.Scanner;

public class D {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=0;i<N;i++){
            int X=scanner.nextInt();
            if(X<=10){
                System.out.printf("A[%d] = %d%n",i,X);
            }
        }
    }
}
