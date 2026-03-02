package calculadora;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

        // Entrada dos números
        System.out.print("Digite o primeiro número: ");
        double a = sc.nextDouble();

        System.out.print("Digite o operador (+, -, *, /): ");
        char operador = sc.next().charAt(0);

        System.out.print("Digite o segundo número: ");
        double b = sc.nextDouble();

        double resultado = 0.0;
        boolean valido = true;

        // Estrutura de decisão
        switch (operador) {
            case '+':
                resultado = a + b;
                break;
            case '-':
                resultado = a - b;
                break;
            case '*':
                resultado = a * b;
                break;
            case '/':
                if (b == 0) {
                    System.out.println("Erro: divisão por zero não permitida.");
                    valido = false;
                } else {
                    resultado = a / b;
                }
                break;
            default:
                System.out.println("Operador inválido.");
                valido = false;
        }

        // Exibe o resultado apenas se a operação for válida
        if (valido) {
            System.out.printf("%.2f %c %.2f = %.2f\n", a, operador, b, resultado);
        }
        
        sc.close();
	}

}
