
import java.util.Scanner;

public class E{
    static int max=Integer.MIN_VALUE;
    public static void checkmax(Scanner scanner,int numleft){
        if (numleft==0) return;
        int num = scanner.nextInt();
        
        if (num>max)
            max=num;
        checkmax(scanner, numleft-1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x= scanner.nextInt();
        checkmax(scanner, x);
        System.out.println(max);
    }
}