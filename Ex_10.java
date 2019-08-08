import java.util.Scanner;

public class Ex_10 {

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o primeiro numero: ");

    int num1 = scan.nextInt();
    int maior = num1;
    System.out.println("Digite o segundo: ");
    int num2 = scan.nextInt();
    int menor = num2;
    if(menor > maior) {
         int num3 = maior;
         maior = menor;
         menor = num3;
    }
    System.out.println("Digite o terceiro: ");
    int num3 = scan.nextInt();
    if (num3 > maior) {
        menor = maior;
        maior = num3;
    }
    else if (num3<menor) {
        menor = num3;
    }
    System.out.println("O maior é: "+ maior);

    System.out.println("O menor é: "+ menor);
        scan.close();
    }

}