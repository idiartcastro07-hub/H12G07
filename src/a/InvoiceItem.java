package a;

public class InvoiceItem {
    // Atributos privados de la clase
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    // Item determinado por los difetenes atributos
    public InvoiceItem(String id, String desc, int qty, double unitPrice) {
        this.id = id;
        this.desc = desc;
        this.qty = qty;
        this.unitPrice = unitPrice;
    }

    // Getters y setters de los diferentes atributos
    public String getId() {
        return id;
    }
    public String getDesc() {
        return desc;
    }
    public int getQty() {
        return qty;
    }
    public void setQty (int qty) {
        this.qty = qty;
    }
    public double getUnitPrice() {
        return unitPrice;
    }
    public void setUnitPrice(double unitPrice) {
        this.unitPrice = unitPrice;
    }

    // Calculo del precio total
    public double getTotal() {
        return unitPrice * qty;
    }

    public String toString() {
        return "InvoiceItem[id=" + id +  ",desc=" + desc + ",qty=" + qty + ",unitPrice=" + unitPrice + "]";
    }
}