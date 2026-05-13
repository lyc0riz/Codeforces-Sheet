import java.util.Scanner;

public class X{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] inputs = new int[4];
        
        for (int i=0;i<4;i++){
            inputs[i]= scanner.nextInt();
        }
        
        if (inputs[0]<=inputs[2] && inputs[3]<=inputs[1])
            System.out.printf("%d %d%n",inputs[2],inputs[3]);
        else if (inputs[2]<=inputs[0] && inputs[1]<=inputs[3])
            System.out.printf("%d %d%n",inputs[0],inputs[1]);
        else if(inputs[2]<inputs[0] && inputs[0]<=inputs[3] && inputs[3]<inputs[1])
            System.out.printf("%d %d%n",inputs[0],inputs[3]);
        else if(inputs[0]<inputs[2] && inputs[2]<=inputs[1] && inputs[1]<inputs[3])
            System.out.printf("%d %d%n",inputs[2],inputs[1]);
        else
            System.out.println("-1");
        
    }
}