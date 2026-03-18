package b.ejerciciosclases2;

public class account {
    //definir atributos
    private int id;
    private customer customer;
    private double balance = 0.0;

    //Constructores
    public account (int id, customer customer, double balance) {
        this.id = id;
        this.customer = customer;
        this.balance = balance;
    }

    public account (int id, customer customer) {
        this.id = id;
        this.customer = customer;
    }

    //Getters y setters
    public int getId () {
        return id;
    }

    public customer getCustomer () {
        return customer;
    }

    public double getBalance () {
        return balance;
    }

    public void setBalance (double balance) {
        this.balance = balance;
    }

    public String toString () {
        return customer.toString()+"("+id+") balance = %" +String.format("%2f",balance);
    }//imprimir resultado

    public String getCustomerName () {
        return customer.getName();
    }

    public account deposit (double amount) {//añadir al balance el amount y devolverlo
      balance += amount;
      return this;
    }
    public account withdraw (double amount) {
        if (balance >= amount){//balance mayor a amount se resta
           balance -= amount;
        } else {
            System.out.println("Amount withdrawn exceeds the current balance");//imprimir por pantalla
        }
        return this;
    }

}
