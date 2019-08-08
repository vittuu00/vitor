import java.util.Scanner;

public class Ex_17 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Digite a nota 1: ");
        float nota1 = entrada.nextFloat();

        System.out.print("Digite a nota 2: ");
        float nota2 = entrada.nextFloat();

        float media = (nota1 + nota2) / 2;

        System.out.println();

        if ((media >= 9) && (media <= 10)) {
            System.out.println("Nota 1: " +nota1);
            System.out.println("Nota 2: " +nota2);
            System.out.println("Sua média foi: "+media );
            System.out.println("Média de Aproveitamento: A\nAPROVADO");

        }else if ((media >= 7.5) && (media <= 9)) {
            System.out.println("Nota 1: " +nota1);
            System.out.println("Nota 2: " +nota2);
            System.out.println("Sua média foi: "+media );
            System.out.println("Média de Aproveitamento: B\nAPROVADO");

        }else if ((media >= 6) && (media <= 7.5)) {
            System.out.println("Nota 1: " +nota1);
            System.out.println("Nota 2: " +nota2);
            System.out.println("Sua média foi: "+media );
            System.out.println("Média de Aproveitamento: C\nAPROVADO");
        }else if ((media >= 4) && (media <= 6)) {
            System.out.println("Nota 1: " +nota1);
            System.out.println("Nota 2: " +nota2);
            System.out.println("Sua média foi: "+media );
            System.out.println("Média de Aproveitamento: D\nREPROVADO");
        }else if ((media >= 0) && (media <= 4)) {
            System.out.println("Nota 1: " +nota1);
            System.out.println("Nota 2: " +nota2);
            System.out.println("Sua média foi: "+media );
            System.out.println("Média de Aproveitamento: E\nREPROVADO");
    }
    }
}