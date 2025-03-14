import java.util.Arrays;
import java.util.Scanner;

public class arraynumeros {
    public static void main(String[] args) {
        int[] numeros = new int[3];

        Scanner scanner = new Scanner(System.in);



        System.out.println("Insira tres numeros:");

        for (int i = 0; i < 3; i++) {

            numeros[i] = scanner.nextInt();
        }

        Arrays.sort(numeros);

        int min = numeros[0];
        int mid = numeros[1];
        int max = numeros[2];


        double media = (min + mid + max) / 3.0;

        System.out.printf("O maior número digitado foi: %d \n", max);
        System.out.printf("O menor número digitado foi: %d \n", min);
        System.out.printf("A média dos três números é: %.2f \n", media);
    }
}
