import java.util.Scanner;

public class Ex_09 {

    public static void main(String[]args) {

        Scanner entrada = new Scanner(System.in);

        float pideal = 0;

        System.out.println("Informe a altura: ");
        float alt = entrada.nextFloat();

        System.out.println("Informe o peso: ");
        float peso = entrada.nextFloat();

        System.out.println("Informe o sexo: \n 1- Masculino\n 2 - Feminino\n ");
        int sexo = entrada.nextInt();

        String sexo1 = "null";

        switch (sexo) {

        case 1:
            System.out.println("");
            System.out.println("Masculino");
            System.out.println("");
            pideal = (float) ((72.7 * alt) - 58);

            if (peso > pideal) {
                System.out.println("Você esta acima do peso");
                System.out.println("Seu peso ideal é : " +pideal);
            } else if (peso < pideal) {
                System.out.println("Você está abaixo do peso");
                System.out.println("Seu peso ideal é : " +pideal);
                 } 

            break;

            case 2:
                System.out.println("");
                System.out.println("Feminino");
                System.out.println("");
                pideal = (float) ((62.1 * alt) - 44.7);

            if (peso > pideal) {
                System.out.println("Você esta acima do peso");
                System.out.println("Seu peso ideal é : " +pideal);
            } else if (peso < pideal) {
                System.out.println("Você está abaixo do peso");
                System.out.println("Seu peso ideal é : " +pideal);

            }

            break;
        }
            entrada.close();
        }

}