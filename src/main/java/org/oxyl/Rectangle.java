package org.oxyl;

public class Rectangle {
    double centreX;
    double centreY;
    double longueur;
    double largeur;
    double angle;

    public Rectangle() {
        centreX = 0.0;
        centreY = 0.0;
        longueur = 1.0;
        largeur = 1.0;
        angle = 0.0;
    }

    public Rectangle(Rectangle rectangle){
        this.centreX = rectangle.centreX;
        this.centreY = rectangle.centreY;
        this.longueur = rectangle.longueur;
        this.largeur = rectangle.largeur;
        this.angle = rectangle.angle;
    }

    public Rectangle(double centreX, double centreY, double angle, double largeur, double longueur) {
        this.centreX = centreX;
        this.centreY = centreY;
        this.angle = angle;
        this.largeur = largeur;
        this.longueur = longueur;
    }

    public void deplacer (double distanceX, double distanceY){
        centreX += distanceX;
        centreY += distanceY;
    }

    public boolean isCarre(){
        return longueur == largeur;
    }

    public void redimensionner (double f){
        longueur *= f;
        largeur *= f;
    }

    public void tourner(double theta){
        angle += theta;
    }

}
