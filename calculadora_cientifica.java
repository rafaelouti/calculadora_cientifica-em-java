
import java.util.Scanner;

public class calculadora_cientifica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Calculadora Científica");
        System.out.println("Selecione uma operação: ");
        System.out.println("1: Adição");
        System.out.println("2: Subtração");
        System.out.println("3: Multiplicação");
        System.out.println("4: Divisão");
        System.out.println("5: Seno");
        System.out.println("6: Cosseno");
        System.out.println("7: Tangente");
        System.out.println("8: Raiz Quadrada");
        System.out.println("9: Potência");

        int operacao = scanner.nextInt();
        double num1, num2, resultado = 0;

        switch (operacao) {
            case 1 -> {
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextDouble();
                resultado = num1 + num2;
                System.out.println("Resultado: " + resultado);
            }
            case 2 -> {
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextDouble();
                resultado = num1 - num2;
                System.out.println("Resultado: " + resultado);
            }
            case 3 -> {
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextDouble();
                resultado = num1 * num2;
                System.out.println("Resultado: " + resultado);
            }
            case 4 -> {
                System.out.println("Digite o primeiro número:");
                num1 = scanner.nextDouble();
                System.out.println("Digite o segundo número:");
                num2 = scanner.nextDouble();
                if (num2 != 0) {
                    resultado = num1 / num2;
                    System.out.println("Resultado: " + resultado);
                } else {
                    System.out.println("Erro: Divisão por zero!");
                }
            }
            case 5 -> {
                System.out.println("Digite o ângulo (em graus):");
                num1 = Math.toRadians(scanner.nextDouble());
                resultado = Math.sin(num1);
                System.out.println("Resultado (Seno): " + resultado);
            }
            case 6 -> {
                System.out.println("Digite o ângulo (em graus):");
                num1 = Math.toRadians(scanner.nextDouble());
                resultado = Math.cos(num1);
                System.out.println("Resultado (Cosseno): " + resultado);
            }
            case 7 -> {
                System.out.println("Digite o ângulo (em graus):");
                num1 = Math.toRadians(scanner.nextDouble());
                resultado = Math.tan(num1);
                System.out.println("Resultado (Tangente): " + resultado);
            }
            case 8 -> {
                System.out.println("Digite o número:");
                num1 = scanner.nextDouble();
                if (num1 >= 0) {
                    resultado = Math.sqrt(num1);
                    System.out.println("Resultado (Raiz Quadrada): " + resultado);
                } else {
                    System.out.println("Erro: Número negativo não tem raiz quadrada real.");
                }
            }
            case 9 -> {
                System.out.println("Digite a base:");
                num1 = scanner.nextDouble();
                System.out.println("Digite o expoente:");
                num2 = scanner.nextDouble();
                resultado = Math.pow(num1, num2);
                System.out.println("Resultado (Potência): " + resultado);
            }
            default -> System.out.println("Operação inválida");
        }

        scanner.close();
    }
}
