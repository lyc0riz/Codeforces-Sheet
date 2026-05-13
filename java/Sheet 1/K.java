import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class K {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> inputs = new ArrayList<>();
        
        for (int i=0;i<3;i++){
            inputs.add(scanner.nextInt());
        }

        Collections.sort(inputs);
        System.out.printf("%d %d%n",inputs.get(0),inputs.get(2));
        
    }
}