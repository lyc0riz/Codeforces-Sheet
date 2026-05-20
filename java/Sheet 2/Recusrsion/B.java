import java.util.Scanner;
public class B{
    public static void printEven(int current,int N){
        if (current>N) return;

        System.out.println(current);
        
        printEven(current+2, N);

    }
    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        
        if (N==1)
            System.out.println("-1");
        else
            printEven(2, N);
    }
}