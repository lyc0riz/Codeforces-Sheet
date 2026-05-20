import java.util.Scanner;
public class B{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();

        if (N==1){
            System.out.println("-1");
        }
        
        else {
        for (int i =1;i<N+1;i++){
            if (i%2==0)
                System.out.println(i);
        }
        }
    }
}