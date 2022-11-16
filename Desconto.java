import java.text.DecimalFormat;
import java.util.Scanner;

public class Desconto {
    public static void main(String[] args) {
            Float total, desconto, totalDesconto, valorPago, troco;
            Scanner teclado = new Scanner(System.in);
            DecimalFormat formatador = new DecimalFormat("#0.00");
            System.out.println("\nValor total: ");
            total = teclado.nextFloat();
            System.out.println("Desconto (%): ");
            desconto = teclado.nextFloat();
            totalDesconto = total - (desconto*total) /100;
            System.out.println("O total com desconto é igual a R$ " + formatador.format(totalDesconto));
            System.out.print("\nQual o valor pago em dinheiro? ");
            valorPago = teclado.nextFloat();
            troco = valorPago - totalDesconto;
            System.out.println("Seu troco é de R$ " + formatador.format(troco));
            teclado.close();
    }    
}
