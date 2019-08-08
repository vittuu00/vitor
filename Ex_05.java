import java.util.Scanner;

public class Ex_05 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		char vogal;
		
		System.out.print("Digite uma letra:  ");
		vogal = entrada.next().charAt(0);
		
		if(vogal == 'a' || vogal == 'e' || vogal == 'i'|| vogal == 'o' || vogal == 'u') {
			System.out.println("A letra é vogal");
			
		}else if (vogal == 'A' || vogal == 'E' || vogal == 'I'|| vogal == 'O' || vogal == 'U'){
				System.out.println("A letra é vogal");
		}		
		entrada.close();
	}
}
