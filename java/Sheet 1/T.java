
import java.util.ArrayList;
import java.util.Scanner;

public class T{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> input = new ArrayList<>();
        for (int i=0;i<3;i++){
            input.add(scanner.nextInt());
        }
        ArrayList<Integer> cinput = (ArrayList)input.clone();

        input.sort(null);

        for (int i: input){
            System.out.println(i);
        }
        System.out.println("");
        for (int i: cinput){
            System.out.println(i);
        }
    }
}