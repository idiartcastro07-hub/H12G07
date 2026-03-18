package a;

public class Account { // Se crea la clase Account
    // Atributos privados de la clase
    private String id;
    private String name;
    private int balance = 0;

    // Account con id y name indicados en el print y con el balance determinado en el programa
    public Account(String id, String name) {
        this.id = id;
        this.name = name;
    }


    // Account con los tres atributos indicados en el print
    public Account (String id, String name, int balance) {
        this.id = id;
        this.name = name;
        this.balance = balance;
    }

    // Getters que devuelven los datos de cada uno de los tres atributos
    public String getID() {
        return id;
    }
    public String getName() {
        return name;
    }
    public int getBalance() {
        return balance;
    }

    // Cálculo del credito, sumando una cantidad determinada al balance
    public int credit (int amount) {
        balance += amount;
        return balance; // Se devuelve el balance, con amount ya sumado
    }

    // Cálculo del débito
    public int debit (int amount) {
        if (balance >= amount) { // Si el balance es mayor que la cantidad
            balance -= amount; // Se le resta la cantidad al balance
        } else {
            System.out.println("Amount exceeded balance"); // En caso contrario, se imprime error
        }
        return balance; // Se devuelve el balance
    }

    // Se calculcula la transferencia a traves de una cuenta y una cantidad determinadas
    public int transferTo (Account another, int amount) {
        if (balance >= amount) { // Si el balance supera la cantidad
            this.debit (amount); // Se calcula el debito de la cantidad
            another.credit (amount);  // Se añade el credito a la nueva cuenta
        } else {
            System.out.println("Amount exceeded balance"); // En caso contrario, la cantidad supera el balance
        }
        return amount; // Se retorna la nueva cantidad calculada
    }

    @Override
    public String toString(){
        return "Account[id=" + this.id + ",name=" + this.name + ",balance=" + this.balance + "]";
    }
}