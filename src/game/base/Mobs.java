package game.base;

public class Mobs {

    private double v, rv, angle;

    public Mobs(double v, double rv, double angle) {
        this.v = v;
        this.rv = rv;
        this.angle = angle;
    }

    public double getV() {
        return v;
    }

    public void setV(double v) {
        this.v = v;
    }

    public double getRv() {
        return rv;
    }

    public void setRv(double rv) {
        this.rv = rv;
    }

    public double getAngle() {
        return angle;
    }

    public void setAngle(double angle) {
        this.angle = angle;
    }
}
