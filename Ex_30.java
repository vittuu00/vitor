import java.util.Scanner;

public class Ex_30 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		
		float pesoMo = 0;
		float pesoMa = 0;
		double valorMo = 0;
		double valorMa = 0;
		double valorTotal;
		float pesoTotal;
		
		System.out.print("Digite a quantidade em kg de morangos comprados: ");
		pesoMo = entrada.nextInt();
		System.out.print("Digite a quantidade em kg de maça comprados: ");
		pesoMa = entrada.nextInt();
	
		if (pesoMo <= 5)
			valorMo = pesoMo * 2.50;
		else
			valorMo = pesoMo * 2.20;
		
		if (pesoMa <= 5)
			valorMa = pesoMa * 1.80;
		else
			valorMa = pesoMa * 1.50;
		
		pesoTotal = pesoMo + pesoMa;
		valorTotal = valorMa + valorMo;
		
		if ((pesoTotal) > 8 || (valorTotal) > 25)
			valorTotal = valorTotal - (valorTotal * 0.10); 
		
		System.out.println("O valor total a ser pago é: R$" + valorTotal);
			
		entrada.close();
		}	
}
