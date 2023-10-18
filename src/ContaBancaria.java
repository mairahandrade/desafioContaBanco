import java.util.InputMismatchException;
import java.util.Locale;
import java.util.Scanner;

public class ContaBancaria {

        public static void main(String[] args) {
            try {
                Scanner scanner = new Scanner(System.in).useLocale(Locale.US);


                System.out.println("Por favor, digite o número da Agência: ");
                String agencia = scanner.nextLine();


                System.out.print("Por favor, digite o número da Conta: ");
                String numeroConta = scanner.nextLine();


                System.out.println("Digite seu nome:  ");
                String nomeCliente = scanner.next();

                System.out.println("Digite seu sobrenome: ");
                String sobrenome = scanner.next();


                System.out.print("Por favor, digite o saldo: ");
                double saldo = scanner.nextDouble();


                System.out.println("Olá" + nomeCliente + sobrenome + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e o seu saldo " + saldo +  " já está disponível para saque.");

                scanner.close();
            } catch (InputMismatchException e) {
                System.out.println("Erro: Entrada inválida. Certifique-se de inserir valores numéricos corretos para o número da conta e saldo.");
            }
        }




}
