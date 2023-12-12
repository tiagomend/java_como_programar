import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // cria dois objetos Account
        Account account1 = new Account("Jane Green", 50.00);
        Account account2 = new Account("John Blue", -7.53);

        // exibe saldo inicial de cada objeto
        System.out.printf("%s balance: $%.2f %n", 
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", 
            account2.getName(), account2.getBalance());

        // cria um Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        System.out.print("Enter deposit amount for account1: ");
        double depositAmount = input.nextDouble(); // obtém entrada
        System.out.printf("%nadding %.2f to account1 balance%n%n", depositAmount);
        account1.deposit(depositAmount);

        // exibe os saldos
        System.out.printf("%s balance: $%.2f %n",
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n",
            account2.getName(), account2.getBalance());

        System.out.print("Enter deposit amount for account2: ");
        depositAmount = input.nextDouble(); // obtém entrada
        System.out.printf("%nadding %.2f to account2 balance%n%n", depositAmount);
        account2.deposit(depositAmount);

        // exibe os saldos
        System.out.printf("%s balance: $%.2f %n", 
            account1.getName(), account1.getBalance());
        System.out.printf("%s balance: $%.2f %n", 
            account2.getName(), account2.getBalance());

        input.close();
    }
}
