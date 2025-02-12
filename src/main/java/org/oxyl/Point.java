package org.oxyl;

public class Point {
    double x;
    double y;
    int test;

    public Point() {
        x=0;
        y=0;
    }
    public Point(Point point){
        this.x = point.x;
        this.y = point.y;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }

    public void setX(double x) {
        this.x = x;
    }

    public void setY(double y) {
        this.y = y;
    }

    public boolean equals(Object objet) {
    if (objet instanceof Point){
        objet = (Point) objet;
    } else return false;
    if (x == objet.getX() && y==objet.getY()){
        return true;
    } else return false;
    }
}
