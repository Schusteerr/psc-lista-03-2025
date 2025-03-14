import java.util.Scanner;

public class segundograu{
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("para calcular uma equacao de segundo grau, primeiro digite o valor de A: ");
        int a = scanner.nextInt();

        System.out.print("agora digite o valor de B: ");
        int b = scanner.nextInt();

        System.out.print("por fim digite o valor de C: ");
        int c = scanner.nextInt();

        if (a == 0 && b == 0 && c!= 0){
            System.out.println("Coeficientes informados incorretamente.");
        }else if (a == 0 && b != 0){
            System.out.println("Essa é uma equação de primeiro grau");
            double x = -((double)c / b);
            System.out.printf("A raiz da equação é: %.2f\n", x);

            
        }else{
            double delta = (b*b) - (4*a*c);

            if (delta < 0){
                System.out.println("Esta equação não possui raízes reais");
            }else if (delta == 0){
                System.out.println("Esta equação possui duas raízes reais iguais.");

                double raizQuadradaDelta = Math.sqrt(Math.abs(delta));

                double x = (-b + raizQuadradaDelta)/(2*a);

                System.out.printf("A raiz da equação é %.2f", x);
            }else{
                
                System.out.println("Esta equação possui duas raízes reais diferentes.");
                double raizQuadradaDelta = Math.sqrt(Math.abs(delta));

                double x1 = (-b + raizQuadradaDelta)/(2*a);
                double x2 = (-b - raizQuadradaDelta)/(2*a);

                System.out.printf("Esta equação possui duas raízes reais diferentes, que são %.2f e %.2f", x1, x2);
            }
            
        }


        

    }
}