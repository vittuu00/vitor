import java.util.Scanner;

public class Ex_31 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		
		int code1 = 1; // file duplo
		int code2 = 2; // alcatra
		int code3 = 3; // picanha
		int compra = 0;
		float peso = 0;
		boolean ok = true;
		double valor = 0;
		double valor2 = 0;
		int cartao = 0;
		String carne = null;
		double desc = 0;
		
		while(ok) {
		System.out.println("1 - fil� duplo");
		System.out.println("2 - alcatra");
		System.out.println("3 - picanha\n");
		System.out.println("S� � permitido a compra de apenas uma dessas carnes, sem retri��es de peso");
		System.out.print("Digite o c�digo da �nica carne que foi comprada: ");
		compra = entrada.nextInt();
		System.out.print("Agora digite o peso da carne (em kg): ");
		peso = entrada.nextFloat();
		System.out.print("Voc� possui o cartao Tabaja cliente? digite 1 para SIM ou 2 para nao: ");
		cartao = entrada.nextInt();
		if ((compra == 1 || compra == 2 || compra == 3) && (cartao == 1 || cartao == 2))
			ok = false;
		else
			System.out.println("Alguma informa��o digitada est� errada, fa�a de novo conforme pedido. \n");
	}
		
		if (compra == code1) {
			carne = "Fil� Duplo";
			if (peso <= 5)  // R$4,90
				valor =  peso * 4.90;
			else // R$5,80
				valor = peso * 5.80;
		}
		
		if (compra == code2) {
			carne = "Alcatra";
			if (peso <= 5)  // R$5,90
				valor =  peso * 5.90;
			else // R$6,80
				valor = peso * 6.80;
		}
		
		if (compra == code3) {
			carne = "Picanha";
			if (peso <= 5)  // R$6,90
				valor =  peso * 6.90;
			else // R$7,80
				valor = peso * 7.80;
		}
			
		if (cartao == 1) {
			desc = valor * 0.05;
			valor2 = valor - (desc);
			System.out.println("\n Compra feita no cartao Tabajara.");
		}else {
			valor2 = valor;
			System.out.println("\n Compra feita em dinheiro");
		}
		System.out.println("\nA carne comprada foi: "+ carne +" \nQuantidade de carne comprada: " + peso +" quilos");
		System.out.println("O pre�o total �: R$" + valor +" tendo um desconto de: R$"+ desc +"\nTendo o valor a pagar de: R$"+ valor2 );
		
		
		entrada.close();
		}	
}
