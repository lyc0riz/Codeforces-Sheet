
import java.util.Scanner;

public class M{
    public static void buildlucky(int min,int max,int current){
        if (current>max) return;
        if ((current>=min && current<=max) && current!=0) System.out.print(current+" ");
        buildlucky(min, max, (current*10)+4);
        buildlucky(min, max, (current)*10+7);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int x = scanner.nextInt();
        int y = scanner.nextInt();
        buildlucky(x, y, 0);
    }
}