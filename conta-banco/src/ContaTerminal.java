import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Por favor, digite o número da conta: ");
        int numero = sc.nextInt();

        System.out.print("Por favor, digite o número da agência: ");
        String agencia = sc.next();

        System.out.print("Por favor, digite o nome do cliente: ");
        String nomeCliente = sc.next();

        System.out.print("Por favor, digite o saldo: ");
        String saldo = sc.next();

        String mensagem = "Olá ".concat(nomeCliente)
                .concat(", obrigado por criar uma conta em nosso banco, sua agência é ").concat(agencia)
                .concat(", conta ").concat(Integer.toString(numero)).concat(" e seu saldo ")
                .concat((saldo)).concat(" já está disponível para saque.");

        System.out.println(mensagem);
    }
}