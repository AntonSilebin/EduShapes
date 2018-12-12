package by.silebin.entity;

import java.util.Objects;

public class Dot {

    private double x;
    private double y;
    private double z;

    public Dot(double x, double y, double z){
        this.x = x;
        this.y = y;
        this.z = z;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void setZ(double z) {
        this.z = z;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public double getZ() {
        return z;
    }

    @Override
    public boolean equals(Object other) {
        Dot otherDot = (Dot)other;
        return this.x == otherDot.x &&
                this.y == otherDot.y &&
                this.z == otherDot.z;
    }

    @Override
    public int hashCode() {
        return (int)x;
    }
}
