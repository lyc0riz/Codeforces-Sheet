import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        int low = scanner.nextInt();
        int pos = 1;
        for(int i=2;i<N-1;i++){
            int X = scanner.nextInt();
            if(X<low){
                low = X;
                pos=i;
            }
        }
        System.out.printf("%d %d",low,pos);

    }
}
