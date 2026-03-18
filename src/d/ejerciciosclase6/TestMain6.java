package d.ejerciciosclase6;

public class TestMain6 {
    public static void main (String[] args) {

        //Creamos un gato con nombre y hacemos que salude
        cat cat1 = new cat ("Vienna");
        System.out.println(cat1);
        cat1.greets();

        //Creamos un perro y hacemos que salude
        dog d1 = new dog ("Max");
        System.out.println(d1);
        d1.greets();

        //Creamos otro perro y hacemos que ambos se saluden
        dog d2 = new dog ("Minnie");
        System.out.println(d2);
        d2.greets();
        d1.greets(d2); //la funcion greets no sirve para cualquier animal porque solo esta definido para cat y dog

        //Creamos un bigdog y hacemos que salude, salude al perro anterior y a un bigdog nuevo

        bigdog b1 = new bigdog("Max");
        System.out.println(b1);
        b1.greets();

        bigdog b2 = new bigdog("Minnie");
        System.out.println(b2);
        b2.greets();
        d1.greets(b2);
        b1.greets(b2);

    }
}
