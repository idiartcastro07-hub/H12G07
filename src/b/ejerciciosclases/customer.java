package b.ejerciciosclases;

public class customer {
    //atributos
    private int id;
    private String name;
    private int discount;

    //Contructores
    public customer (int id, String name, int discount) {
        this.id = id;
        this.name = name;
        this.discount = discount;
    }

    //Getters y setters
    public int getId () {
        return id;
    }

    public String getName () {
        return name;
    }

    public int getDiscount () {
        return discount;
    }

    public void setDiscount (int discount) {
        this.discount = discount;
    }

    public String toString () {
        return name+ " (" +id+ ")(" +discount+ " %)";
    }//imprimir
}
