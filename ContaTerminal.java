import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Bem-vindo ao nosso banco. Para adicionar uma conta, digite:");
        System.out.printf("Seu nome: ");
        String nome = input.nextLine();

        System.out.printf("Sua agência: ");
        String agencia = input.nextLine();

        System.out.printf("O número da sua agência: ");
        int numeroAgencia = input.nextInt();

        System.out.printf("Seu saldo: ");
        double saldo = input.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %f já está disponível para saque"
        , nome, agencia, numeroAgencia, saldo);
    }
}
