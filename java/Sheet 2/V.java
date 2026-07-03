import java.util.Scanner;

public class V {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        for(int i=1;i<=N*4;i++){
            if(i%4!=0){
                System.out.printf("%d ",i);
            }
            else{
                System.out.printf("PUM%n");
            }
        }
    }
}
