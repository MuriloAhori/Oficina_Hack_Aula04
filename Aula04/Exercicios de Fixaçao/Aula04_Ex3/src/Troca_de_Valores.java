import java.util.Scanner;

public class Troca_de_Valores {
	public static void main (String args[]) {
		
		Scanner leia = new Scanner(System.in);
		
		int Auxiliar=0;
		
		System.out.print("Digite o valor de A : ");
		int a = leia.nextInt();
		
		System.out.print("Digite o valor de B : ");
		int b = leia.nextInt();
		
		Auxiliar = b;
		b = a;
		a = Auxiliar;
		
		
		
		System.out.println("\n-----------TROCANDO OS VALORES---------\n");
		System.out.println("Valor de A : "+a);
		System.out.println("Valor de B : "+b);
		
		leia.close();
	}
}
