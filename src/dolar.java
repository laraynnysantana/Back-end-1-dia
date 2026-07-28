import java.util.Scanner;

public class dolar {
        static void main() {
            Scanner sc = new Scanner(System.in);

            IO.println("Vamos converter seu dinheiro!");


            IO.println("Digite o valor em Reais:");
            double reais = sc.nextDouble();


            IO.println("Digite a cotacao do Dolar hoje:");
            double cotacaoDolar = sc.nextDouble();

            IO.println("Digite a cotacao do Euro hoje:");
            double cotacaoEuro = sc.nextDouble();


            double resultDolar = reais / cotacaoDolar;
            double resultEuro = reais / cotacaoEuro;


            IO.println("Valor em Dolar:  " + resultDolar);
            IO.println("Valor em Euro:  " + resultEuro);
        }
    }

