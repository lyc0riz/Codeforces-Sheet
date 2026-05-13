import java.util.Scanner;

public class R{
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int age= scanner.nextInt();
        int year = age/365;
        int months = (age-year*365)/30;
        int days = ((age-year*365)-months*30);

        System.out.printf("%d years%n",year);
        System.out.printf("%d months%n",months);
        System.out.printf("%d days%n",days);

    }
}