import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Solicitar e ler as informações do usuário
        System.out.println("Por favor, digite o número da Agência:");
        String agencia = sc.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        int numeroConta = sc.nextInt();
        sc.nextLine(); // Limpar o buffer do Scanner

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = sc.nextLine();

        System.out.println("Por favor, digite o saldo da Conta:");
        double saldo = sc.nextDouble();

        // Exibir mensagem de agradecimento com as informações inseridas pelo usuário
        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " +
                           agencia + ", conta " + numeroConta + " e seu saldo de R$" + saldo + " já está disponível para saque.");

        // Fechar o Scanner para liberar recursos
        sc.close();
    }
}