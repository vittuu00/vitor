import java.util.Scanner;

public class Ex_02 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		double n1;
		
		System.out.print("Digite um n�mero: ");
		n1 = entrada.nextDouble();
		
		if(n1 < 0)
			System.out.println("O n�mero digitado � positivo");
		else if (n1 == 0)
			System.out.println("O n�mero digitado � zero");
		else
			System.out.println("o n�mero digitado � negativo");
		
		entrada.close();
	}
}
