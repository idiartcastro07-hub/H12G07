package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase4;

public class movablepoint implements movable {
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    public movablepoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString () {
        return "(" +x+ " , " +y+ ") speed(" +x+ " , " +y+ ")";
    }

    @Override
    public void moveUp () {
        y -= ySpeed;
    }

    @Override
    public void moveDown () {
        y += ySpeed;
    }

    @Override
    public void moveLeft () {
        x -= xSpeed;
    }

    @Override
    public void moveRight () {
        x += xSpeed;
    }

}
