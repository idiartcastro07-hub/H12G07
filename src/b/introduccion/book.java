package b.introduccion;

import b.ejerciciosclases.author;

public class book {
    //definimos atributos
    private String isbn;
    private String name;
    private author author;
    private double price;
    private int qty = 0;

    //Constructores
    public book (String isbn, String name, author author, double price) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
    }

    public book (String isbn, String name, author author, double price, int qty) {
        this.isbn = isbn;
        this.name = name;
        this.author = author;
        this.price = price;
        this.qty = qty;
    }

    //Getters y setters
    public String getIsbn () {
        return isbn;
    }

    public String getName () {
        return name;
    }

    public author getAuthor () {
        return author;
    }

    public double getPrice () {
        return price;
    }

    public void setPrice (double price) {
        this.price = price;
    }

    public int getQty () {
        return qty;
    }

    public void setQty (int qty) {
        this.qty = qty;
    }

    public String getAuthorname () {
        return author.getName();
    }

    public String toString () {//imprime
        return "Book [(isbn = " +isbn+ ", name = " +name+ ", " +author+ ", price = " +price+ ", qty = " +qty+ ")]";
    }
}
