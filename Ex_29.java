import java.util.Scanner;

public class Ex_29 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		
		int code1 = 1; // alcool
		int code2 = 2; // gasolina
		int combustivel = 0;
		float litros = 0;
		boolean ok = true;
		double valor = 0;
		double valor2 = 0;
		
		while(ok) {
		System.out.println("1 - alcool");
		System.out.println("2 - gasolina");
		System.out.print("Digite o código do único combústivel que foi comprado: ");
		combustivel = entrada.nextInt();
		System.out.print("Agora digite a quantidade comprada (em litros): ");
		litros = entrada.nextFloat();
		
		if ((combustivel == 1 || combustivel == 2))
			ok = false;
		else
			System.out.println("Alguma informação digitada está errada, faça de novo conforme pedido. \n");
	}
		
		if (combustivel == code2) {
			if (litros <= 20) {  
				valor =  litros * 2.50;
			    valor2 = valor - (valor * 0.04);
			}else { 
				valor = litros * 2.50;
				valor2 = valor - (valor * 0.06);
			}
		}
		
		if (combustivel== code1) {
			if (litros <= 20) {  
				valor = litros * 1.90;
				valor2 = valor - (valor * 0.03);
			}else { 
				valor = litros * 1.90;
				valor2 = valor - (valor * 0.05);
			}
		}
		
		
		System.out.println("O valor a pagar é: R$" + valor2);
		
		
		entrada.close();
		}	
}
