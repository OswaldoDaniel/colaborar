package models;

import ODST.Figuras;

public class ModelVolumen {

    Figuras fig = new Figuras();
    private double radio;
    private double lado;
    private double base;
    private double ancho;
    private double volumen;

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

    public double getAncho() {
        return ancho;
    }

    public void setAncho(double ancho) {
        this.ancho = ancho;
    }
    
    public double volEsfera(){
        volumen = fig.volEsf((int) radio);
        return volumen;
    }
    
    public double volCubo(){
        volumen = fig.volCub((int) lado);
        return volumen;
    }
    
    public double volCilindro(){
        volumen = fig.volCilind((int)radio,(int) lado);
        return volumen;
    }
    
    public double volPrisma(){
        volumen = fig.volPrism((int)lado,(int)base,(int)ancho);
        return volumen;
    }
}
