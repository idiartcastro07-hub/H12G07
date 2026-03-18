package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase4;

public class movablecircle implements movable{
    private int radius;
    private movablepoint center;

    public movablecircle (int x, int y, int xSpeed, int ySpeed, int radius) {
        this.center = new movablepoint(x,y,xSpeed,ySpeed);
        this.radius = radius;

    }

    @Override
    public String toString () {
        return center.toString()+ ", radius = " +radius;
    }

    @Override
    public void moveUp () {
        center.moveUp();
    }

    @Override
    public void moveDown () {
        center.moveDown();
    }

    @Override
    public void moveLeft () {
        center.moveLeft();
    }

    @Override
    public void moveRight () {
        center.moveRight();
    }

}
