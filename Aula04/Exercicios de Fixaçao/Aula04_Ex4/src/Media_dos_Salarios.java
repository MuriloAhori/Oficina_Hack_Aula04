import java.util.Scanner;

public class Media_dos_Salarios {
	public static void main (String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		double Salario1,Salario2,Salario3,Salario4,Media,Soma;
		
		System.out.print("Digite o valor do Primeiro Sal�rio : ");
		 Salario1 = leia.nextDouble();
		
		System.out.print("Digite o valor do Segundo Sal�rio : ");
		 Salario2 = leia.nextDouble();
		
		System.out.print("Digite o valor do Terceiro Sal�rio : ");
		Salario3 = leia.nextDouble();
		
		System.out.print("Digite o valor do Quarto Sal�rio : ");
		Salario4 = leia.nextDouble();
		
		Soma = Salario1+Salario2+Salario3+Salario4;
		
		Media = Soma/4;
		
		System.out.println("\n----------Folha de PAgamento---------\n");
		System.out.println("A soma dos Salarios dos Funcionarios : "+Soma);
		System.out.println("A Media da soma dos Salarios : "+Media);
		
		leia.close();
	}
}
