import java.util.Scanner;

public class Ex_32 {
	
	static Scanner entrada;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		entrada = new Scanner(System.in);
		char questao[] = new char[10]; 
		int nota = 0;
		int k = 0;
		
		while (k != 10) {
		System.out.print("Digite a resposta da questão nº "+ (k + 1)+" digite apenas em minusculo (a, b, c, d ou e): ");
		questao[k] = entrada.next().charAt(0);
		if (questao[k] == 'a' || questao[k] == 'b' || questao[k] == 'c' || questao[k] == 'd' || questao[k] == 'e')
			k++;
			else
			System.out.println("alternativa inexistente, digite de novo");
		}
		
		if(questao[0] == 'a')
			nota++;
		if(questao[1] == 'a')
			nota++;
		if(questao[2] == 'b')
			nota++;
		if(questao[3] == 'b')
			nota++;
		if(questao[4] == 'c')
			nota++;
		if(questao[5] == 'c')
			nota++;
		if(questao[6] == 'd')
			nota++;
		if(questao[7] == 'd')
			nota++;
		if(questao[8] == 'e')
			nota++;
		if(questao[9] == 'e')
			nota++;
		
		System.out.println("resposta dada questão 1: ("+ questao[0] +") resposta correta: (a)");
		System.out.println("resposta dada questão 2: ("+ questao[1] +") resposta correta: (a)");
		System.out.println("resposta dada questão 3: ("+ questao[2] +") resposta correta: (b)");
		System.out.println("resposta dada questão 4: ("+ questao[3] +") resposta correta: (b)");
		System.out.println("resposta dada questão 5: ("+ questao[4] +") resposta correta: (c)");
		System.out.println("resposta dada questão 6: ("+ questao[5] +") resposta correta: (c)");
		System.out.println("resposta dada questão 7: ("+ questao[6] +") resposta correta: (d)");
		System.out.println("resposta dada questão 8: ("+ questao[7] +") resposta correta: (d)");
		System.out.println("resposta dada questão 9: ("+ questao[8] +") resposta correta: (e)");
		System.out.println("resposta dada questão 10: ("+ questao[9] +") resposta correta: (e)");
		System.out.println("sua pontuação: " + nota);
		
		
		entrada.close();
		
		}	
}
