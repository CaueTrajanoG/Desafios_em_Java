import java.util.Scanner;

public class calculoSimples {
    public static void main(String[] args) {
            int codigo = 0;
            int quantidade = 0;
            double valor = 0;
            double valorTotal = 0;
            Scanner teclado = new Scanner(System.in);
            for(int i = 0;i<2;i++){
                codigo = teclado.nextInt();
                System.out.print("Digite a quantidade: ");
                quantidade = teclado.nextInt();
                System.out.print("Digite o preco: ");
                valor = teclado.nextFloat();
                valorTotal += valor * quantidade;
            }
            System.out.printf("VALOR A PAGAR: R$ %.2f", valorTotal);

    }
}
