package projetoDio;
import java.util.Scanner;
import java.text.DecimalFormat;
import java.util.Locale;
public class ContaTerminal {

	public static void main(String[] args) {
		// TODO: Conhecer e importar a classe Scanner
		
		// Exibir as mensagens para o nosso usuário
		
		// Obter pela Scanner os valores digitados no terminal
		
		// Exibir a mensagem: conta criada.
		
		int numero;
		String agencia;
		String nomeCliente;
		double saldo;
		
		Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
		DecimalFormat decimal = new DecimalFormat("0.00");
		
		System.out.println("Por favor, digite o número da Agência: ");
		agencia = scanner.next();
		
		System.out.println("Digite o número da Conta: ");
		numero = scanner.nextInt();
		
		System.out.println("Digite o seu nome: ");
		nomeCliente = scanner.next();
		
		System.out.println("Digite o valor do saldo: ");
		saldo = scanner.nextDouble();
		
		
		System.out.println("Olá "+nomeCliente+", obrigado por criar uma conta em nosso banco, sua agência é "
				+ agencia+", conta "+numero+" e seu saldo "+decimal.format(saldo)+ " já está disponível para saque.");
		
		
		scanner.close();

	}

}
