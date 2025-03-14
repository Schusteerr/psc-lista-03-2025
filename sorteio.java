import java.util.Arrays;
import java.util.Scanner;

public class sorteio {
    public static void main(String[] args) {
        int[] numeros = new int[2];

        Scanner scanner = new Scanner(System.in);



        System.out.println("Insira dois numeros para gerar um numero aleatorio:");

        for (int i = 0; i < 2; i++) {

            numeros[i] = scanner.nextInt();
        }
        System.out.println("Gerando um numero aleatório a partir destes...");
        Arrays.sort(numeros);

        int min = numeros[0];
        int max = numeros[1];

        int randomNum = (int)((Math.random() * (max - min)) + min);

        if ((randomNum % 2) == 0) {
            System.out.printf("O numero Aleatório gerado é par, sendo ele: %d", randomNum);
        } else {
            System.out.printf("O numero Aleatório gerado é impar, sendo ele: %d", randomNum);
        }
    }
}
