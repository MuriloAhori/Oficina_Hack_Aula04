import java.util.Scanner;

public class Ex2 {
	public static void main (String args[]) {
		Scanner leia = new Scanner(System.in);
		
		double Salario,AguaGasta;
		double ValorConta,TotalConta;
		
		System.out.print("Digite o Salario: ");
		Salario = leia.nextDouble();
		
		System.out.print("Digite a quantidade de agua gasta no mês: ");
		AguaGasta = leia.nextDouble();
		
		ValorConta = AguaGasta*(Salario*0.00002);
		
		TotalConta = ValorConta*0.85;
		
		System.out.println("A conta de agua deste Mês tera o valor de: "+ValorConta);
		
		System.out.println("O valor a ser pago com um desconto de 15%: "+TotalConta);
		leia.close();
	}

}
