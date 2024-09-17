import java.util.Scanner;

public class ContaTerminal {
    public static int numero ;
    public static String agencia;
    public static String nomeCliente;
    public static double saldo;
    public static void main(String[] args) throws Exception {
        Scanner input = new Scanner(System.in);

        System.out.println("Seja bem-vindo!");
        System.out.println("Por favor digite seu nome: ");
        nomeCliente = input.nextLine(); 

        System.out.println("Por favor digite o numero da sua agência: ");
        agencia = input.nextLine(); 

        System.out.println("Por favor digite seu numero da conta: ");
        numero = input.nextInt();

        System.out.println("Por favor digite seu Saldo: ");
        saldo = input.nextDouble();


        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");



    }
}
