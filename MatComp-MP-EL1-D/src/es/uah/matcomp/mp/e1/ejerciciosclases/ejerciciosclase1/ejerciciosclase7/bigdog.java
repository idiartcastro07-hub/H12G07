package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase7;

public class bigdog extends dog {
    @Override
    public void greeting() {
        System.out.println("Woow!");
    }//saludo del bigdog

    @Override
    public void greeting(dog another) {
        System.out.println("Woooooowwwww!");
    }//saludo a otro perro
}