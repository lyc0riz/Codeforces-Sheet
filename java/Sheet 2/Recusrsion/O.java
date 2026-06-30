import java.util.Scanner;
public class O{
    public static void pyramid(int N,int col,int row){
        if (row>N) return;
        if (col<=row){
            System.out.print("*");
            pyramid(N, col+1, row);
        }
        else
        {
            System.out.printf("%n");
            pyramid(N,1, row+1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        pyramid(N,1,1);
    }
}