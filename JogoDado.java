import java.util.Scanner;

public class JogoDado{
    public static void main(String[] args) {
        char opcao = 's';
        try (Scanner teclado = new Scanner(System.in)) {
            while (opcao == 's'){
                System.out.println("Lançamento do dado: ");
                int dado = (int) (Math.random() * 6 + 1);
                System.out.println("Face: "+ dado);
                System.out.println("\nDeseja jogar o dado novamente? Sim ou não?");
                opcao = teclado.next().charAt(0);
            }
        }
    }
}