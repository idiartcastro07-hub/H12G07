package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase6;

public class TestMain6 {
    public static void main (String[] args) {

        cat cat1 = new cat ("Vienna");
        System.out.println(cat1);
        cat1.greets();

        dog d1 = new dog ("Max");
        System.out.println(d1);
        d1.greets();

        dog d2 = new dog ("Minnie");
        System.out.println(d2);
        d2.greets();
        d1.greets(d2); //la funcion greets no sirve para cualquier animal porque solo esta definido para cat y dog

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
