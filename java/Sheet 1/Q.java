import java.util.Scanner;

public class Q{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var X = scanner.nextDouble();
        var Y = scanner.nextDouble();
        
        if (X==0 && Y==0) 
            System.out.println("Origem");
        else if (X!=0 && Y==0)
            System.out.println("Eixo X");
        else if (X==0 && Y!=0)
            System.out.println("Eixo Y");
        else if (X>0){
            if (Y>0)
            System.out.println("Q1");
            else
            System.out.println("Q4");
        }
        else if (X<0){
            if (Y<0)
            System.out.println("Q3");
            else 
            System.out.println("Q2");
        }
        
    }
}