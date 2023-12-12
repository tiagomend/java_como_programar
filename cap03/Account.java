public class Account {
    private String name;
    private double balance;

    // o construtor inicializa name com nome do parâmetro
    public Account(String name, double balance){
        this.name = name;

        // valida que o balance é maior que 0.0
        if (balance > 0.0){
            this.balance = balance;
        }
    }

    // método que deposita apenas uma quantia válida no saldo
    public void deposit(double depositAmount){
        if (depositAmount > 0.0){
            balance = balance + depositAmount;
        }
    }

    public double getBalance(){
        return balance;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}