import java.util.Scanner;

public class Ex_04 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		String ano = "";
		boolean ok = true;
		
		while (ok) {
		System.out.print("Digite um ano, de 4 digítos: ");
		ano = entrada.next();
		int length = ano.length();
		
			if (length == 4)
				ok = false;
			else
				System.out.println("apenas 4 digítos");
		}
		
		int anoInt = Integer.parseInt(ano); 
		
		if(anoInt % 4 == 0)
			System.out.println("Este ano é bissexto");
		else
			System.out.println("Este ano não é bissexto");
	
		entrada.close(); 
	}
}
