import java.util.Scanner;

public class Ex_27 {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        float result = 0;
        System.out.println("Digite um n�mero: ");
        float num = scan.nextInt();

        System.out.println("Digite mais um numero: ");
        float num2 = scan.nextInt();

        System.out.println("Agora, que opera��o deseja fazer: (1: +)(2: -)(3: *)(4: /)");
        int op = scan.nextInt();
        switch(op) {
            case 1:
                result = num + num2;
            break;
            case 2:
                result = num - num2;
            break;
            case 3:
                result = num * num2;
            break;
            case 4:
                result = num / num2;
            break;
        }
        System.out.println(result);

        if (result % 2 == 0) {
            System.out.println("O resultado � par");
        }
        else {
            System.out.println("O resultado � impar");
        }
        if(result >= 0) {
            System.out.println("positivo");
        }
        else {
            System.out.println("negativo");
        }
        if(result % 1 == 0 ) {
            System.out.println("inteiro");
        }
        else {
            System.out.println("decimal");
        }