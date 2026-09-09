
import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        //Variáveis
        int a, b, c, d, soma;
        //Entrada
        Scanner leia = new Scanner(System.in);
        System.out.println("Digite o primeiro número:");
        a = leia.nextInt();
        System.out.println("Digite o segundo número:");
        b = leia.nextInt();
        System.out.println("Digite o terceiro número:");
        c = leia.nextInt();
        System.out.println("Digite o quarto número:");
        d = leia.nextInt();
        //Processamento
        soma = a + b + c + d;
        //Saída
        System.out.println("O resultado é: " + soma);
    }
}
