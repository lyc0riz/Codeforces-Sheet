import java.util.Scanner;

public class O{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        String exp = scanner.next();
        int opindex = -1;

        for (int i=0;i<=exp.length();i++){
            char c = exp.charAt(i);

            if(!Character.isDigit(c)){
                opindex = i;
                break;
            }
        }

        int A= Integer.parseInt(exp.substring(0,opindex));
        int B = Integer.parseInt(exp.substring(opindex+1));
        char symbol = exp.charAt(opindex);

        switch (symbol) {
            case '+' -> System.out.println(A+B);
            case '-' -> System.out.println(A-B);
            case '*' -> System.out.println(A*B);
            case '/' -> System.out.println(A/B);
            default -> throw new AssertionError();
        }

    }
}