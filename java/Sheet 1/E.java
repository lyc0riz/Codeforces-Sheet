import java.util.Scanner;

public class E {
    public static void main(String[] args) {
        Scanner scanner =  new Scanner(System.in);
        double pi=3.141592653;
        double r=scanner.nextDouble();
        System.out.printf("%.9f%n",pi*Math.pow(r, 2));
    }
}