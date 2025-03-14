import java.util.Scanner;

public class circulo{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Escolha sua operação digitando o numero da mesma: \n1: calcular e imprimir o perímetro do círculo. \n2: calcular e imprimir a área do círculo. \n3: calcular e imprimir o volume da esfera. ");
        int indicador = scanner.nextInt();


        switch (indicador) {
            case 1 -> {
                System.out.print("Digite o raio do circulo ou esfera: ");
                double raio = scanner.nextDouble();
                double perimetro = 2 * Math.PI * raio;

                System.out.printf("O perimetro é: %.2f", perimetro);
            }
            case 2 -> {
                System.out.print("Digite o raio do circulo ou esfera: ");
                double raio = scanner.nextDouble();
                double area  = Math.PI * (raio*raio);

                System.out.printf("A area é: %.2f", area);
            }
            case 3 -> {
                System.out.print("Digite o raio do circulo ou esfera: ");
                double raio = scanner.nextDouble();
                double volume = (4/3) * Math.PI * (raio*raio*raio);

                System.out.printf("O volume é: %.2f", volume);
            }

            default -> System.out.println("o indicador para a operação atual é inválido");
    
        }

    }
}