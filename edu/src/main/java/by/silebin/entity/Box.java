package by.silebin.entity;

import java.util.Objects;

public class Box {

    private Dot a;
    private Dot b;
    private Dot c;
    private Dot d;
    private Dot e;
    private Dot f;
    private Dot g;
    private Dot h;

    public Box(Dot a, Dot b, Dot c, Dot d, Dot e, Dot f, Dot g, Dot h){
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
    }

    public Dot getA() {
        return a;
    }

    public void setA(Dot a) {
        this.a = a;
    }

    public Dot getB() {
        return b;
    }

    public void setB(Dot b) {
        this.b = b;
    }

    public Dot getC() {
        return c;
    }

    public void setC(Dot c) {
        this.c = c;
    }

    public Dot getD() {
        return d;
    }

    public void setD(Dot d) {
        this.d = d;
    }

    public Dot getE() {
        return e;
    }

    public void setE(Dot e) {
        this.e = e;
    }

    public Dot getF() {
        return f;
    }

    public void setF(Dot f) {
        this.f = f;
    }

    public Dot getG() {
        return g;
    }

    public void setG(Dot g) {
        this.g = g;
    }

    public Dot getH() {
        return h;
    }

    public void setH(Dot h) {
        this.h = h;
    }

    @Override
    public boolean equals(Object other) {
        if(this == other) return true;
        if(!(other instanceof Box)) return false;
        Box otherBox = (Box)other;
        if(this.a.getX() == otherBox.a.getX() &&
                a.getY() == otherBox.a.getY() &&
                a.getZ() == otherBox.a.getZ() &&
                b.getX() == otherBox.b.getX() &&
                b.getY() == otherBox.b.getY() &&
                b.getZ() == otherBox.b.getZ() &&
                c.getX() == otherBox.c.getX() &&
                c.getY() == otherBox.c.getY() &&
                c.getZ() == otherBox.c.getZ() &&
                d.getX() == otherBox.d.getX() &&
                d.getY() == otherBox.d.getY() &&
                d.getZ() == otherBox.d.getZ() &&
                e.getX() == otherBox.e.getX() &&
                e.getY() == otherBox.e.getY() &&
                e.getZ() == otherBox.e.getZ() &&
                f.getX() == otherBox.f.getX() &&
                f.getY() == otherBox.f.getY() &&
                f.getZ() == otherBox.f.getZ() &&
                g.getX() == otherBox.g.getX() &&
                g.getY() == otherBox.g.getY() &&
                g.getZ() == otherBox.g.getZ() &&
                h.getX() == otherBox.h.getX() &&
                h.getY() == otherBox.h.getY() &&
                h.getZ() == otherBox.h.getZ()) {
            return true;
        }
            else{
                return false;
            }
    }

    @Override
    public int hashCode() {
        double hash = this.a.getX() * this.b.getX() * this.c.getX() * this.d.getX();
        return (int)hash;
    }
}
