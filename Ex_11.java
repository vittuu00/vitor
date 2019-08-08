import java.util.Scanner;

public class Ex_11 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		char turno;
		
		System.out.println("Em que turno você estuda?");
		System.out.print("Digite M para Matutino ou V para Vespertino ou N Noturno: ");
		turno = entrada.next().charAt(0);
		
		if(turno == 'V' || turno == 'v')
			System.out.println("Boa tarde!");
		
		if(turno == 'M' || turno == 'm')
			System.out.println("Bom dia!");
		
		if(turno == 'N' || turno == 'n')
			System.out.println("Boa noite!");
		
		entrada.close();
	}
}