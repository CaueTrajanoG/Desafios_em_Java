import java.util.Scanner;

public class Exercicio1008 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int number = input.nextInt();
        double hours = input.nextDouble();
        double price = input.nextDouble();
        double salary = price * hours;
        System.out.println("NUMBER = "+ number);
        System.out.printf("SALARY = U$ %.2f", salary);
    }
}
