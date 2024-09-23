import java.util.Scanner;

public class Questao2 {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Ditite uma palavra com a letra 'a'");
        String input = scanner.next();
        System.out.println(isStringWhitLetterA(input));
    }
    public static String isStringWhitLetterA(String string){
        int i = 0;
        int repeticoes = 0;

        while (i < string.length()) {
            char caractere = string.charAt(i);
            if(caractere == 'a' || caractere == 'A'){
                repeticoes++;
            }
            i++;
        }
        return "A letra 'a' se repete " + repeticoes + " vezes!";
    }
}
