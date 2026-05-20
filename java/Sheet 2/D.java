import java.util.Scanner;
public class D{
    public static void main(String[] args) {
        Scanner scanner= new Scanner(System.in);
        int correct = 1999;
       
        while (true){
            int pass=scanner.nextInt();
            if (pass==correct){
                System.out.println("Correct");
                break;
            }
            else
                System.out.println("Wrong");
        }
    }
}