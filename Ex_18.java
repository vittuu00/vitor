import java.util.Scanner;

public class Ex_18{
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);

        float lado1 = 0;
        float lado2 = 0;
        float lado3 = 0;
        float menor1 = 0;
        float menor2 = 0;
        float maior = 0;
        String tipo = "";
        
        System.out.println("Digite o primeiro lado do tri�ngulo: ");
        lado1 = entrada.nextFloat();

        System.out.println("Digite o segundo lado do tri�ngulo: ");
        lado2 = entrada.nextFloat();

        System.out.println("Digite o terceiro lado do tri�ngulo: ");
        lado3 = entrada.nextFloat();

        entrada.close();
        
        if(lado1 > lado2 && lado1 > lado3){
            maior = lado1;
            menor1 = lado2;
            menor2 = lado3;
        }else if(lado2 > lado1 && lado2 > lado3){
            maior = lado2;
            menor1 = lado1;
            menor2 = lado3;
        }else{
            maior = lado3;
            menor1 = lado1;
            menor2 = lado2;
        }

        if(menor1 + menor2 > maior){
            if(lado1 == lado2 && lado2 == lado3){
                tipo = "Tri�ngulo Equil�tero!";
            }else if(lado1 == lado2 || lado1 == lado3 || lado2 == lado3){
                tipo = "Tri�ngulo Is�sceles";
            }else{
                tipo = "Tri�ngulo Escaleno!";
            }
        }else{
            tipo = "N�o � um tri�ngulo";
        }
        System.out.println(tipo);
    }
}