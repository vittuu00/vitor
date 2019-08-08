import java.util.Scanner;

public class Ex_12 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		double salario;
		double salario2 = 0;
		int perc = 0;
		double aumento = 0;
		
		System.out.print("Digite o valor do seu salário: ");
		salario = entrada.nextDouble();
		
		if(salario <= 280) {
			aumento = salario * 0.20;
			salario2 = salario + aumento;
			perc = 20;
		}else if (salario > 280 && salario <= 700) {
			aumento = salario * 0.15;
			salario2 = salario + aumento;
			perc = 15;
		}else if (salario > 700 && salario <= 1500) {
			aumento = salario * 0.10;
			salario2 = salario + aumento;
			perc = 10;
		}else if (salario > 1500) {
			aumento = salario * 0.05;
			salario2 = salario + aumento;
			perc = 5;
		}
		System.out.println("seu salário antes do reajuste era: R$" + salario);
		System.out.println("tendo um percentual de aumento de:" + perc + "%");
		System.out.println("o aumento foi de: R$" + aumento);
		System.out.println("seu salário passou a ser: R$ "+ salario2);
		
		entrada.close();
	}
}
