public class Questao3 {

    public static void main(String[] args) {

        System.out.println("O valor da soma é " + imprimirSoma());

    }
    public static int imprimirSoma(){
        int INDICE = 12, SOMA = 0, K = 1;
        while (K < INDICE ){
            K = K + 1; SOMA = SOMA + K;
        }
        return SOMA;
    }
}
