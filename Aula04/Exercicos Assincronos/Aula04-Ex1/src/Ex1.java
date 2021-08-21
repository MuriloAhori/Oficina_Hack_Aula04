import java.util.Scanner;

public class Ex1 {
	public static void main (String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		System.out.print("Digite o Primeiro valor :");
		int a = leia.nextInt();
		
		System.out.print("Digite o Segundo valor :");
		int b = leia.nextInt();
		int soma = a + b;
		
		System.out.println("A soma dos Valores é : "+soma);
		
		leia.close();
	}
	
}
