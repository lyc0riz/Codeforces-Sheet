import java.util.Scanner;

public class U {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int finsum = 0;
        for(int i=1;i<=N;i++){
            int temp=i;
            int sum=0;
            while (temp!=0) {
                sum+=temp%10;
                temp=temp/10;
            }
            if((a<=sum) && (sum<=b)){
                finsum+=i;
            }
        }
        System.out.println(finsum);
        scanner.close();
    }

}
