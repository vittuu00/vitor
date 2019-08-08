import java.util.Scanner;

public class Ex_15 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        System.out.print("Quanto custa o produto? \nR$");
        float valor = entrada.nextFloat();

        System.out.println("Código de origem");
        System.out.println("1 - Sul\n2 - Norte\n3 - Leste\n4 - Oeste\n5 e 6 - Nordeste\n7 e 8 - Centro-oeste\n ");
        int origem = entrada.nextInt();

        if(origem == 1) {
            System.out.println("Preço do produto: R$" +valor);
            System.out.println("Região Sul");
        }else if(origem == 2){
            System.out.println("Preço do produto: R$" +valor);
            System.out.println("Região Norte");
        } else if (origem == 3) { 
            System.out.println("Preço do produto: R$" +valor);
            System.out.println("Região Leste");
        }else if (origem == 4) { 
            System.out.println("Preço do produto: R$" +valor);
            System.out.println("Região Oeste");
        }else if ((origem == 5 || origem == 6)) {
            System.out.println("Preço do produto: R$" +valor);
            System.out.println("Região Nordeste ");
        }else if ((origem == 7) || (origem == 8)) {
            System.out.println("Preço do produto: R$" +valor);
            System.out.println("Região Centro-Oeste");
        }else {
            System.out.println("Preço do produto: R$" +valor);
            System.out.println("Produto Importado");
        }
        entrada.close();
    }
}