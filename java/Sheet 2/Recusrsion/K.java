import java.util.Scanner;
public class K{
    public static void divisiors(int i,int N){
        if (i>N) return;
        if (N%i==0)
            System.out.println(i);
        divisiors(i+1,N);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        divisiors(1,N);
    }
}