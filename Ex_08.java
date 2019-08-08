import java.util.Scanner;

public class Ex_08 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		float n1;
		float n2;
		
		System.out.print("Digite a primeira nota:  ");
		n1 = entrada.nextFloat();
		
		System.out.print("Digite a segunda nota:  ");
		n2 = entrada.nextFloat();
		
		float media = (n1 + n2) / 2;
		
		if(media >= 7 ) 
			System.out.println("Aprovado");
			
		else 
				System.out.println("Reprovado");
				
		entrada.close();
	}
}
