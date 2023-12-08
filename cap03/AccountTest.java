public class AccountTest {
    public static void main(String[] args) {
        // cria dois objetos Account
        Account account1 = new Account("Jane Green");
        Account account2 = new Account("John Blue");

        // exibe o valor inicial de nome para cada Account
        System.out.printf("account1 name is: %s%n", account1.getName());
        System.out.printf("account2 name is: %s%n", account2.getName());
    }
}
