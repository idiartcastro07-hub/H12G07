package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase7;

public class dog extends animal {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }

    public void greeting(dog another) {
        System.out.println("Woooooooooof!");
    }
}