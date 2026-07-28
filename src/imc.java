import java.util.Scanner;

public class imc {
    static void main(){



        Scanner sc = new Scanner(System.in);
        IO.println(" vamos calcular seu imc");

        IO.println("digite qual sua altura");
        double altura = sc.nextDouble();

        IO.println("digite qual o seu peso");
        double peso = sc.nextDouble();

        double result = peso / ( altura * altura);
        IO.println("Seu imc é: " + result);
    }
}
