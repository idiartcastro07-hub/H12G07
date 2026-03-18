package d.ejerciciosclase3;

//Programa probador
public class TestMain3 {
    public static void main(String[] args) {

        //Creamos movable point con sus respectivos valores  y calculamos sus datos
        movable m1 = new movablepoint(3,4,6,2);
        System.out.println(m1);
        m1.moveUp();
        System.out.println(m1);
        m1.moveDown();
        System.out.println(m1);
        m1.moveLeft();
        System.out.println(m1);
        m1.moveRight();
        System.out.println(m1);

    }
}
