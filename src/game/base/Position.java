package game.base;

import game.enums.States;

import static game.enums.States.*;

public class Position {

    private double x, y;
    private States state;

    public Position(double x, double y, States state) {
        this.x = x;
        this.y = y;
        this.state = ACTIVE;
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public States getState() {
        return state;
    }

    public void setState(States state) {
        this.state = state;
    }
}
