import java.util.Scanner;

public class Ex_15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quanto custa o produto? \nR$");
        float valor = entrada.nextFloat();

        System.out.println("C�digo de origem");
        System.out.println("1 - Sul\n2 - Norte\n3 - Leste\n4 - Oeste\n5 e 6 - Nordeste\n7 e 8 - Centro-oeste\n ");
        int origem = entrada.nextInt();

        if(origem == 1) {
            System.out.println("Pre�o do produto: R$" +valor);
            System.out.println("Regi�o Sul");
        }else if(origem == 2){
            System.out.println("Pre�o do produto: R$" +valor);
            System.out.println("Regi�o Norte");
        } else if (origem == 3) { 
            System.out.println("Pre�o do produto: R$" +valor);
            System.out.println("Regi�o Leste");
        }else if (origem == 4) { 
            System.out.println("Pre�o do produto: R$" +valor);
            System.out.println("Regi�o Oeste");
        }else if ((origem == 5 || origem == 6)) {
            System.out.println("Pre�o do produto: R$" +valor);
            System.out.println("Regi�o Nordeste ");
        }else if ((origem == 7) || (origem == 8)) {
            System.out.println("Pre�o do produto: R$" +valor);
            System.out.println("Regi�o Centro-Oeste");
        }else {
            System.out.println("Pre�o do produto: R$" +valor);
            System.out.println("Produto Importado");
        }
        entrada.close();
    }
}