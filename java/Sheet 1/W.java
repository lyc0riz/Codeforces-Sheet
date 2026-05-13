
import java.util.Scanner;

public class W{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();
        String[] inputA= input.split("\\s+");

        
        switch (inputA[1]) {
            case "+" -> {
                if (Integer.parseInt(inputA[0])+Integer.parseInt(inputA[2])==Integer.parseInt(inputA[4]))
                    System.out.println("Yes");
                else 
                    System.out.println(Integer.parseInt(inputA[0])+Integer.parseInt(inputA[2]));
            }
            
            case "-" -> {
                if (Integer.parseInt(inputA[0])-Integer.parseInt(inputA[2])==Integer.parseInt(inputA[4]))
                    System.out.println("Yes");
                else
                    System.out.println(Integer.parseInt(inputA[0])-Integer.parseInt(inputA[2]));
            }
            
            case "*" -> {
                if (Integer.parseInt(inputA[0])*Integer.parseInt(inputA[2])==Integer.parseInt(inputA[4]))
                    System.out.println("Yes");
                else
                    System.out.println(Integer.parseInt(inputA[0])*Integer.parseInt(inputA[2]));
            }
            
            case "/" -> {
                if (Integer.parseInt(inputA[0])/Integer.parseInt(inputA[2])==Integer.parseInt(inputA[4]))
                    System.out.println("Yes");
                else
                    System.out.println(Integer.parseInt(inputA[0])/Integer.parseInt(inputA[2]));
            }

            default -> throw new AssertionError();
        }
    }
}