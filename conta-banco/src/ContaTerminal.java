import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        Scanner scanner     = new Scanner(System.in);

        int numeroConta     = 0;
        String agencia      = "";
        String nomeCliente  = "";
        double saldo        = 0.00;

        System.out.println("Digite o número da conta: ");
        numeroConta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Digite o número da agência: ");
        agencia = scanner.nextLine();

        System.out.println("Digite o seu nome: ");
        nomeCliente = scanner.nextLine();

        System.out.println("Digite o saldo: ");
        saldo = scanner.nextDouble();

        System.out.println("Olá, " + nomeCliente + ". Obrigado por criar uma conta em nosso banco!\nSua agência é " + agencia + " e sua conta é " + numeroConta + ".\nSeu saldo de " + saldo + " já está disponível para saque!");

        scanner.close();
    }
}
