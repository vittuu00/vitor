import java.util.Scanner;

public class Ex_19 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		float a;
		float b;
		float c;
		boolean ok = true;
		
		while (ok) {
		System.out.print("Digite o n�mero de ax^2:  ");
		a = entrada.nextFloat();
		
		if(a == 0)  
			System.out.println("O n�mero ax^2 tem que ser difirente de 0, n�o � equa��o de 2� grau");
		else {
		System.out.print("Digite o n�mero de bx:  ");
		b = entrada.nextFloat();

		System.out.print("Digite o n�mero de c:  ");
		c = entrada.nextFloat();	
			float delta = (b * b) - 4 * a * c;
			
			if (delta < 0) {
				System.out.println("n�o existe uma raiz real");
				ok = false;
			}
			if (delta == 0)
				System.out.print("s� possui uma raiz real: "+ (-1 * b) / (2 * a));
			
			if (delta > 0) {
				double raiz1 = (-b - Math.sqrt(delta)) / (2 * a);
				double raiz2 = (-b + Math.sqrt(delta)) / (2 * a);
				
				System.out.println("raiz 1 linha: " + raiz1);
				System.out.println("raiz 2 linha: " + raiz2);
				
				ok = false;
			}
		}
			
				
		entrada.close();
		
		
		}
	}
}
