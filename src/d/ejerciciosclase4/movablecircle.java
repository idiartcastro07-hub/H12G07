package d.ejerciciosclase4;

public class movablecircle implements movable{
    //Definimos radio y center que es de tipo movablepoint
    private int radius;
    private movablepoint center;

    //Constructores
    public movablecircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new movablepoint(x,y,xSpeed,ySpeed);
        this.radius = radius;

    }

    @Override
    public String toString () {
        return center.toString()+ ", radius = " +radius;
    } //Imprime resultado

    @Override
    public void moveUp () {
        center.moveUp();
    } //Mueve el circulo hacia arriba segun y

    @Override
    public void moveDown () {
        center.moveDown();
    }//mueve circulo hacia abajo segun y

    @Override
    public void moveLeft () {
        center.moveLeft();
    }//mueve circulo hacia la izquierda segun x

    @Override
    public void moveRight () {
        center.moveRight();
    }//mueve hacia la derecha segun x

}
