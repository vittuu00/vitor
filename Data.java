

import java.util.Scanner;

public class Data {
	
	// exercicio 21 da lista 02
	
	public static int dia;
	public static int mes;
	public static int ano;
	static Scanner entrada;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		entrada = new Scanner(System.in);	
		
		boolean sair = true;
		int k = 1;
		
		Data data = new Data();
		while (sair) {
			
		if (k == 1){
				System.out.println("Digite a primeira data, apenas numeros");
				System.out.println("Qual o dia? Ex.: 01");
				Data.dia = Integer.parseInt(entrada.nextLine());
				
				System.out.println("Qual o mês? Ex.: 02");
				Data.mes = Integer.parseInt(entrada.nextLine());
				
				System.out.println("Qual o ano? Ex.: 1998");
				Data.ano = Integer.parseInt(entrada.nextLine());
				
				System.out.println(Data.dia+"/"+Data.mes+"/"+Data.ano);
				
				k++;
		}else if (k == 2) {
			System.out.println(dataValida(data));
			
				sair = false;  
		}		
	}
		entrada.close(); 
	}
	
	public static boolean dataValida(Data data) {
		
		
		if ((dia == 1 || mes == 3 || mes == 5 || mes == 7 || mes == 8 || mes == 10 || mes == 12) && dia == 31) 
			return true;
		else if ((mes == 4 || mes == 6 || mes == 9 || mes == 11) && dia == 30)
			return true;
		else if (mes == 2 && dia == 28 && ano%4 != 0)
			return true;
		else if (mes == 2 && dia == 29 && ano%4 == 0)
			return true;
		else
			return false;
	}	
}
	
	
	
	























