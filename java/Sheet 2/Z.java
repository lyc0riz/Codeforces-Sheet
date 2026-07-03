import java.util.Scanner;

public class Z {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int K = scanner.nextInt();
        int S = scanner.nextInt();
        int count =0;
        for(int i = 0;i<=K;i++){
            for(int j =0;j<=K;j++){
                int z =S-i-j ;
                if (z>=0 && z<=K){
                    count+=1;
                }
            }
        }
        System.out.println(count);
    }
}
