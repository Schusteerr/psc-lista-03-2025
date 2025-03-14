import java.util.Scanner;

public class maquinavendas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o valor do item comprado: ");
        int valor = scanner.nextInt();
        System.out.print("Digite o valor que voce esta pagando: ");
        int pago = scanner.nextInt();

        if (pago < valor) {
            System.out.printf("Sua compra não poderá ser feita pois o valor do item é de %d reais\n", valor);
        } else {
            int troco = pago - valor; 

            System.out.printf("Troco: R$ %d,00\n", troco);

            int troco1 = troco / 50;
            troco %= 50;

            int troco2 = troco / 20;
            troco %= 20;

            int troco3 = troco / 10;
            troco %= 10;

            int troco4 = troco / 5;
            troco %= 5;

            int troco5 = troco / 2;
            troco %= 2;

            int troco6 = troco;

            if (troco1 > 0) System.out.println("Notas de R$ 50,00: " + troco1);
            if (troco2 > 0) System.out.println("Notas de R$ 20,00: " + troco2);
            if (troco3 > 0) System.out.println("Notas de R$ 10,00: " + troco3);
            if (troco4 > 0) System.out.println("Notas de R$ 5,00: " + troco4);
            if (troco5 > 0) System.out.println("Notas de R$ 2,00: " + troco5);
            if (troco6 > 0) System.out.println("Notas de R$ 1,00: " + troco6);
        }
        
   
    }
}
