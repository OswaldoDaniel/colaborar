package models;

import ODST.Figuras;

public class ModelArea {

    Figuras fig = new Figuras();
    private double radio;
    private double lado;
    private double base;
    private double area;

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

    public double areaCirculo() {
        area = fig.arCircul((int) radio);
        return area;
    }
    
    public double areaCuadrado(){
        area = fig.arCuadro((int) lado);
        return area;
    }
    
    public double areaRectangulo(){
        area = fig.arRect((int)lado,(int)base);
        return area;
    }
    
    public double areaTriangulo(){
        area = fig.arTriang((int) lado, (int) base);
        return area;
    }
}
