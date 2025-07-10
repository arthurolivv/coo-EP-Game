package game.base;

public class Explosion {

    private double explosionStart;
    private double explosionEnd;

    public Explosion(double explosionStart, double explosionEnd) {
        this.explosionStart = explosionStart;
        this.explosionEnd = explosionEnd;
    }

    public double getExplosionStart() {
        return explosionStart;
    }

    public void setExplosionStart(double explosionStart) {
        this.explosionStart = explosionStart;
    }

    public double getExplosionEnd() {
        return explosionEnd;
    }

    public void setExplosionEnd(double explosionEnd) {
        this.explosionEnd = explosionEnd;
    }
}
