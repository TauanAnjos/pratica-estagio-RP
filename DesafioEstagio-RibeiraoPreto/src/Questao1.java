import java.util.Scanner;

public class Questao1 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número inteiro: ");
        int num = scanner.nextInt();

        if (isFibonacci(num) == true){
            System.out.println("O número " + num + " pertence a sequência de Fibonacci!");
        }else {
            System.out.println("O número " + num + " não pertence a sequÊncia de Fibonacci!");
        }

    }
    public static boolean isFibonacci(long number) {
        if (number == 0 || number == 1) {
            return true;
        }

        long anterior = 0, atual = 1, proximo;

        while (atual <= number) {
            proximo = anterior + atual;
            anterior = atual;
            atual = proximo;

            if (atual == number) {
                return true;
            }
        }
        return false;
    }
}
