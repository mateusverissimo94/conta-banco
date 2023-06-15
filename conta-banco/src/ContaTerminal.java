import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        // importando a classe Scanner e criando as variaveis do banco
        Scanner scan = new Scanner(System.in);
        String agencia, NomeCliente;
        int numero;
        double saldo;

        // Exibindo as mensagens para o usuário e Obtendo pelo Scanner os valores
        // digitados no terminal
        System.out.println("Por favor, digite o nome do Cliente!");
        NomeCliente = scan.nextLine();

        System.out.println("Por favor, digite o número da Agência!");
        agencia = scan.next();

        System.out.println("Por favor, digite o número da Conta!");
        numero = scan.nextInt();

        System.out.println("Por favor, digite o saldo da conta!");
        saldo = scan.nextDouble();

        // Exibindo a mensagem conta criada
        System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
                + agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque.");
    }
}
