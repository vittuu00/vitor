import java.util.Scanner;

public class Ex_28 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int resp = 0;
        System.out.println("Voc� est� sendo interrogado!\nResponda as perguntas com apenas True e False (Diga somente a verdade)");

        System.out.println("Telefonou para a v�tima?");
        boolean resp1 = entrada.nextBoolean();

        if (resp1 == true) { 
            resp = resp + 1;
        }
        System.out.println("Esteve no local do crime?");
        boolean resp2 = entrada.nextBoolean();

        if (resp2 == true) {
            resp = resp + 1;
        }

        System.out.println("Mora perto da v�tima?");
        boolean resp3 = entrada.nextBoolean();

        if (resp3 == true) {
            resp = resp + 1;
        }

        System.out.println("Devia para a v�tima?");
        boolean resp4 = entrada.nextBoolean();

        if (resp4 == true) {
            resp = resp + 1;
        }

        System.out.println("J� trabalhou com a v�tima?");
        boolean resp5 = entrada.nextBoolean();

        if (resp5 == true) {
            resp = resp + 1;
        }

        System.out.println();
        if (resp == 2) {
            System.out.println("Suspeita");
        }else if ((resp == 3) | (resp == 4)) {
            System.out.println("C�mplice");
        }else if (resp == 5) {
            System.out.println("Assassino");
        }else 
            System.out.println("Inocente");

    }

}