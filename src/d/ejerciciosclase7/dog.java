package d.ejerciciosclase7;

public class dog extends animal {
    @Override
    public void greeting() {
        System.out.println("Woof!");
    }//saludo del perro

    public void greeting(dog another) {
        System.out.println("Woooooooooof!");
    }//saludo a otro perro
}