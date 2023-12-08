import java.util.Scanner;

public class AccountTest {
    public static void main(String[] args) {
        // Cria um objeto Scanner para obter entrada a partir da janela de comando
        Scanner input = new Scanner(System.in);

        // Cria um objeto Account e o atribui a myAccount
        Account myAccount = new Account();

        // exibe o valor inicial do nome (null)
        System.out.printf("Initial name is: %s%n%n", myAccount.getName());

        // Solicita e lê o nome
        System.out.println("Please enter the name:");
        String theName = input.nextLine(); // Lê uma linha de texto
        myAccount.setName(theName); // Insere theName em myAccount
        System.out.println(); // Gera saída de uma linha em branco

        // exibe o nome armazenado no objeto myAccount
        System.out.printf("Name in object myAccount is: %n%s%n",
            myAccount.getName());

        input.close();
    }
}
