import java.util.Scanner;

public class Ex_25 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		int n;
		
		System.out.print("Digite um numero inteiro: ");
		n = Integer.parseInt(entrada.nextLine());
		
		if (n%2 == 0)
		System.out.println("O n�meroinformado � par ");
		else
			System.out.println("o n�mero informado � impar");
		
		entrada.close();
	}
}
