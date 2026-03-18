package d.ejerciciosclase7;

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