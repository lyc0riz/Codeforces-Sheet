
import java.util.Scanner;

public class Z{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Long[] inputs = new Long[4];
        for (int i = 0; i < 4; i++){
            inputs[i]= scanner.nextLong();
        }
        if((inputs[1] * Math.log(inputs[0])) > inputs[3] * Math.log(inputs[2]))
            System.out.println("YES");
        else
            System.out.println("NO");
    }
}