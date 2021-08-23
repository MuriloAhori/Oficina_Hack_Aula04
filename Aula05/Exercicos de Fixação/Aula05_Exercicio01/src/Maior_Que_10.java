import java.util.Scanner;

public class Maior_Que_10 {
	public static void main(String args[]) {
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro valor: ");
		int n1 = leia.nextInt();
		
		System.out.print("Digite o Segundo valor: ");
		int n2 = leia.nextInt();
		
		verifica(n1,n2);
		leia.close();
	}

	
	public static void verifica(int n1 , int n2) {
		if ((n1 >= 10) && (n2 >= 10)){
			
		
			int Soma = n1+n2 ;
			int Subtracao = n1-n2 ;
			
			System.out.println("\nA soma dos Valores é: "+ Soma);
			System.out.println("A Subtração dos Valores é: "+ Subtracao);
		}
		
		else {
			System.out.print("\n***************** Digite Valores que são Maiores que 10 *****************");
		}
		
	}
}





