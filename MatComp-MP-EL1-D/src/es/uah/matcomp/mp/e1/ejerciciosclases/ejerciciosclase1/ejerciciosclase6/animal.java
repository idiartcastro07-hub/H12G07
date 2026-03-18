package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase6;

public abstract class animal {
    private String name; // definimos name en la clase abstracta

    public animal (String name) {
        this.name = name;
    } //constructores

    abstract void greets (); //metodo que cada subclase implementara a su manera
}
