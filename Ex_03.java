import java.util.Scanner;

public class Ex_03 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		char letra;
		boolean sair = true;
		
		while (sair) {
		System.out.print("Digite M para masculino e F para feminino: ");
		letra = entrada.next().charAt(0);
		if(letra == 'M' || letra == 'm') {
			System.out.println("masculino");
			sair = false;
		}else if(letra == 'f' || letra == 'F') {
			System.out.println("feminino" );
			sair = false;
		}else 
			System.out.println("informação errada, digite novamente");
		}
		entrada.close();
	}
}
