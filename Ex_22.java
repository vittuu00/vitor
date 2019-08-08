import java.util.Scanner;

public class Ex_22 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		int n = 0;
		boolean ok = true;
		int cen = 0;
		int dez = 0;
		int und = 0;
		int aux;
		
		while (ok){
		System.out.print("Digite um numero menor que 1000: ");
		n = Integer.parseInt(entrada.nextLine());
			if (n < 1000)
				ok = false;
			else
				System.out.println("numero invalido");
		}
		
		if (n > 99) {
			cen = n / 100;
			aux = n % 100;
		}else
			aux = n;
		
		if (aux > 9) {
			dez = aux / 10;
			aux = aux % 10;
		}
		if (aux > 0)
			und = aux;
		
			System.out.println("Centenas: "+ cen);
			System.out.println("Dezenas: "+ dez);
			System.out.println("Unidades: "+ und);
			
		entrada.close();
	}
}