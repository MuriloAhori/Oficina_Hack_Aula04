import java.util.Scanner;

public class Comissao_de_Vendas {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		int Salario = 3000;
		int vendas;
		double comissao, SalarioFinal;
		
		System.out.print("Digite a Quantidade de Vendas :");
		vendas = leia.nextInt();
		
		comissao = vendas*(Salario*2/100);	
		SalarioFinal = comissao + Salario;
				
		
		System.out.print("\nO salario total junto com a comissão :"+SalarioFinal);
		
		leia.close();
	}
}
