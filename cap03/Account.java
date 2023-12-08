public class Account {
    private String name;

    // o construtor inicializa name com nome do parâmetro
    public Account(String name){
        this.name = name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }
}