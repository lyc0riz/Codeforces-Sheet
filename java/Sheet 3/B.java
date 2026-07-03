import java.util.Scanner;

public class B {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int N= scanner.nextInt();
        int pos =-1;
        int[] arr = new int[N];
        for(int i=0;i<N;i++){
            arr[i]=scanner.nextInt();
        }
        
        int X= scanner.nextInt();

        for(int i=0;i<N;i++){
            if(arr[i]==X){
                pos=i;
                break;
            }
        }
        System.out.println(pos);
    }
}
