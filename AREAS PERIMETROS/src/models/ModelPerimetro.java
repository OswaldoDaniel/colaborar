package models;

import ODST.Figuras;


public class ModelPerimetro {
Figuras fig = new Figuras();
    private double radio;
    private double lado;
    private double base;
    private double cateto;
    private double perimetro;

    public double getRadio() {
        return radio;
    }

    public void setRadio(double radio) {
        this.radio = radio;
    }

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        this.lado = lado;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double base) {
        this.base = base;
    }

    public double getCateto() {
        return cateto;
    }

    public void setCateto(double cateto) {
        this.cateto = cateto;
    }
    
    public double perimCircul(){
        perimetro = fig.periCircul((int) radio);
        return perimetro;
    }
    public double perimCuadrado(){
        perimetro = fig.periCuadro((int) lado);
        return perimetro;
    }
    
    public double perimRectangulo(){
        perimetro = fig.periRectang((int)lado, (int)base);
        return perimetro;
    }
    
    public double perimTriangulo(){
        perimetro = fig.periTriang((int)base, (int)cateto);
        return perimetro;
    }
} 

