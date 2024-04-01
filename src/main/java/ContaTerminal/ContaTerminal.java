package ContaTerminal;
import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO: conhecer e importar a classe scanner
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        //Exibir a mensagem criada

        Scanner sc1 = new Scanner(System.in);

        System.out.println("Por favor, digíte o seu nome: ");
        String NomeCliente = sc1.nextLine();

        System.out.println("Por favor, digíte o número da sua conta (Apenas números!):");
        int Numero = sc1.nextInt();

        System.out.println("Por favor, digíte o número da agência no formato três números mais digito (123-4):");
        String Agencia = sc1.next();

        System.out.println("Por favor, digíte o seu saldo:");
        float Saldo = sc1.nextFloat();

       System.out.println("Olá " + NomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + Agencia + ", conta " + Numero + " e seu saldo " + Saldo + " já está disponível para saque.");

    }
}
