import java.util.Scanner;

public class Ex_23 {

    public static void main(String[] args) {

        Scanner entrada = new Scanner(System.in);

        int id1;
        int id2;
        int id3;
        
        
        System.out.println("Qual a idade do primeiro aluno?");
        id1 = entrada.nextInt();

        System.out.println("Qual a idade do segundo aluno?");
        id2 = entrada.nextInt();

        System.out.println("Qual a idade do terceiro aluno?");
        id3 = entrada.nextInt();
         
        float media = (id1+ id2 + id3) / 3;
        
        if (media < 25)
        	System.out.println("Turma Jovem");
        else if (media >= 25 && media < 40)
        	System.out.println("Turma Adulta");
        else
        	System.out.println("Turma Idosa");


    entrada.close();

    }

}