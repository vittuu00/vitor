import java.util.Scanner;

public class Ex_13 {

	public static void main(String[] args) {
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.print("Quantos reais você ganha por hora? ");
		float porh = entrada.nextFloat();
		
		System.out.print("Quantas horas você trabalha por mês? ");
		int hrs = entrada.nextInt();
		
		float sb = porh*hrs;
		
		float fgts = (float) (sb * 0.11);
		float inss = (float) (sb * 0.10);
		float ir = 0;
		
		if(sb < 900) {
			
			System.out.println("\nSem Desconto IR");
			
			System.out.println("\nSeu salario bruto esse mês foi de: R$ " +sb);
			
			System.out.println("(-) INSS (10%): R$ " +inss);
			System.out.println("    FGTS (11%): R$" +fgts);
			
			float salarl = (fgts+ sb) - inss;
			System.out.println("Salario liquido: R$" +salarl);
		
		} else if (sb < 1500) {

			System.out.println("\nDesconto do IR: 5%");
			ir = (float) (sb * 0.05);
			System.out.println("\nSeu salario bruto esse mês foi de: R$ " +sb);
			
			System.out.println("(-) IR    (5%): R$" +ir);
			System.out.println("(-) INSS (10%): R$ " +inss);
			System.out.println("    FGTS (11%): R$" +fgts);
			
			float salarl = ((fgts + sb) - (ir + inss));
			System.out.println("Salario liquido: R$" +salarl);
		
		} else if (sb < 2500) {

			System.out.println("\nDesconto do IR: 10%");
			ir = (float) (sb * 0.10);
			System.out.println("\nSeu salario bruto esse mês foi de: R$ " +sb);
			
			System.out.println("(-) IR   (10%): R$" +ir);
			System.out.println("(-) INSS (10%): R$ " +inss);
			System.out.println("    FGTS (11%): R$" +fgts);
			
			float salarl = ((fgts + sb) - (ir + inss));
			System.out.println("Salario liquido: R$" +salarl);
		
		}else if (sb > 2500) {

			System.out.println("\nDesconto do IR: 20%");
			ir = (float) (sb * 0.20);
			System.out.println("\nSeu salario bruto esse mês foi de: R$ " +sb);
			
			System.out.println("(-) IR   (10%): R$" +ir);
			System.out.println("(-) INSS (10%): R$ " +inss);
			System.out.println("    FGTS (11%): R$" +fgts);
			
			float salarl = ((fgts + sb) - (ir + inss));
			System.out.println("Salario liquido: R$" +salarl);
		}
		
		entrada.close();
				
	}
}