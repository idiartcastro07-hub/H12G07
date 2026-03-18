package b.ejerciciosclases;

public class invoice {
    //definir atributos
    private int id;
    private customer customer;
    private double amount;

    //Contructores
    public invoice (int id, customer customer, double amount) {
        this.id = id;
        this.customer = customer;
        this.amount = amount;
    }

    //Getters y setters
    public int getId () {
        return id;
    }

    public customer getCustomer () {
        return customer;
    }

    public  void setCustomer (customer customer) {
        this.customer = customer;
    }

    public double getAmount () {
        return amount;
    }

    public void setAmount (double amount) {
        this.amount = amount;
    }

    public int getCustomerId () {
        return customer.getId();
    }

    public String getCustomerName () {
        return customer.getName();
    }

    public int getCustomerDiscount () {
        return customer.getDiscount();
    }

    public double getAmountAfterDiscount () {
        return amount - (amount*customer.getDiscount()/100);
    }

    public String toString () {
        return "Invoice [ id = " +id+customer+ ", amount = " +amount+ "]";
    }//muestra resultado
}
