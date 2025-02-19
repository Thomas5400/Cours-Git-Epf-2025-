package org.oxyl;

public class Cercle {

    double centreX;
    double centreY;
    double rayon;

    public Cercle(){
        centreX = 0;
        centreY = 0;
        rayon = 1;
    }

    public Cercle(double centreX, double centreY, double rayon) {
        this.centreX = centreX;
        this.centreY = centreY;
        setRayon(rayon);
    }

    public Cercle(Cercle cercle){
        this.centreX = cercle.centreX;
        this.centreY = cercle.centreY;
        this.rayon = cercle.rayon;
    }

    void setRayon(double rayon){
        if (rayon<0){
            this.rayon=0;
        } else this.rayon = rayon;
    }

    public void deplacer(double distanceX, double distanceY){
    centreX += distanceX;
    centreY += distanceY;
    }

    public boolean isGrand(){
        if (rayon > 100){
            return true;
        } else {
            return false;
        }
    }
    public void redimensionner(double f){
        rayon*=f;
    }
    


}
// Dorian t'es adopté
// Dorian t'es adopté