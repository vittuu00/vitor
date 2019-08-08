import java.util.Scanner;

public class Ex_01 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		double n1;
		double n2;
		
		System.out.print("Digite um número: ");
		n1 = entrada.nextDouble();
		
		System.out.print("Digite outro número: ");
		n2 = entrada.nextDouble();
		
		if(n1 < n2)
			System.out.println("O maior número digitado foi: " + n1 );
		else 
			System.out.println("O maior número digitado foi: " + n2 );
		
		entrada.close();
	}
}
