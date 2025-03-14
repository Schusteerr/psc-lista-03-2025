import java.util.Scanner;

public class operacoes{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um numero real");
        double nmrUm = scanner.nextDouble();

        System.out.println("Digite outro numero real");
        double nmrDois = scanner.nextDouble();

        System.out.print("Escolha sua operação matemática para os numeor, sendo as opções: \n'+' para calcular soma \n'-' para calcular subtração \n'*' para calcular multiplicação \n'/' para calcular divisão \n'^' para calcular divisão");
        String indicador = scanner.next();

        switch (indicador) {
            case "+" -> {
                double soma = nmrUm+nmrDois;

                System.out.printf("A soma dos dois números é: %.2f", soma);
            }
            case "-" -> {
                double sub = nmrUm-nmrDois;

                System.out.printf("A substração dos dois números é: %.2f", sub);
            }
            case "*" -> {
                double mult = nmrUm-nmrDois;

                System.out.printf("A multiplicação dos dois números é: %.2f", mult);
            }
            case "/" -> {
                double div = nmrUm-nmrDois;

                System.out.printf("A divisão dos dois números é: %.2f", div);
            }
            case "^" ->{
                double pot = Math.pow(nmrUm,nmrDois);

                System.out.printf("A divisão dos dois números é: %.2f", pot);
            }

            default -> System.out.println("o indicador para a operação atual é inválido");
    
        }

    }
}