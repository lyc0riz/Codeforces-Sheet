import java.util.Scanner;

public class S{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        for(int i=0;i<t;i++){
            int N = scanner.nextInt();
            int M = scanner.nextInt();
            int sum=0;
            for(int j=Integer.min(N,M)+1;j<Integer.max(N,M);j++){
                if(j%2!=0){
                    sum+=j;
                }
            }
            System.out.println(sum);   
        }
    }
}