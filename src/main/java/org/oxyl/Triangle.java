package org.oxyl;

public class Triangle {

    double x1;
    double y1;
    double x2;
    double y2;
    double x3;
    double y3;

    public Triangle() {
        x1 = 0;
        y1 = 0;
        x2 = 0;
        y2 = 0.5;
        x3 = 1;
        y3 = 0.5;
    }

    public Triangle(double x1, double y1, double x2, double y2, double x3, double y3) {
        this.x1 = x1;
        this.y1 = y1;
        this.x2 = x2;
        this.y2 = y2;
        this.x3 = x3;
        this.y3 = y3;
    }

    public void deplacer (double distanceX, double distanceY){
        x1 += distanceX;
        y1 += distanceY;
        x2 += distanceX;
        y2 += distanceY;
        x3 += distanceX;
        y3 += distanceY;
    }
}
// Ouais cest Greg. Oui c'est le fils à Greg. Oui c'est le petit fils de greg

//pfg
//fdg
// TATATITATATA