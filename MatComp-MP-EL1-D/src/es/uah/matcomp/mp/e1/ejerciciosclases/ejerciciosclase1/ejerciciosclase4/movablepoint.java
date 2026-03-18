package src.es.uah.matcomp.mp.e1.ejerciciosclases.ejerciciosclase1.ejerciciosclase4;

 class movablepoint implements movable {
    //Definimos x, y, xSpeed, ySpeed de tipo int
    int x;
    int y;
    int xSpeed;
    int ySpeed;

    //Constructores
    public movablepoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }

    @Override
    public String toString () {
        return "(" +x+ " , " +y+ ") speed(" +x+ " , " +y+ ")";
    } //Imprime por pantalla

    @Override
    public void moveUp () {
        y -= ySpeed;
    } //Define metodo moveUp para un movable generico

    @Override
    public void moveDown () {
        y += ySpeed;
    }//Define metodo moveDown para un movable generico

    @Override
    public void moveLeft () {
        x -= xSpeed;
    }//Define metodo moveLeft para un movable generico

    @Override
    public void moveRight () {
        x += xSpeed;
    }//Define metodo moveRight para un movable generico

}
