import java.util.Scanner;

public class Ex_16 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Nota 1: ");
        float nota1 = entrada.nextFloat();

        System.out.print("Nota 2: ");
        float nota2 = entrada.nextFloat();

        System.out.print("Nota 3: ");
        float nota3 = entrada.nextFloat();

        System.out.print("Nota 4: ");
        float nota4 = entrada.nextFloat();

        float media = (nota1+nota2+nota3+nota4)/4;

        if(media <= 3) {
            System.out.println("Sua média é: " +media+" - Reprovado");
        }else if (media <= 6.9) {
            System.out.println("Sua média é: " +media+" - Exame");
        }else if(media <= 10 ) {
            System.out.println("Sua média é: " +media+" - Aprovado");
        }
        entrada.close();
    }

}