
import java.util.Scanner;

public class V{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputA= input.split("\\s+");
        switch (inputA[1]) {
            case ">" :
                if (Integer.parseInt(inputA[0])>Integer.parseInt(inputA[2]))
                    System.out.println("Right");
                else 
                    System.out.println("Wrong");
                break;
            case "<" :
                if (Integer.parseInt(inputA[0])<Integer.parseInt(inputA[2]))
                    System.out.println("Right");
                else
                    System.out.println("Wrong");
                break;
            case "=" :
                if (Integer.parseInt(inputA[0])==Integer.parseInt(inputA[2]))
                    System.out.println("Right");
                else
                    System.out.println("Wrong");
                break;
            default:
                throw new AssertionError();
        }
    }
}