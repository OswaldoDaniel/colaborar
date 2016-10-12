/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import models.ModelPerimetro;
import views.JF_Perimetros;
import ODST.Parseos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerPerimetro implements ActionListener{
    Parseos par = new Parseos();
    JF_Perimetros jfPerimetros;
    ModelPerimetro modelPerimetro;
    
    public ControllerPerimetro(JF_Perimetros jfPerimetros, ModelPerimetro modelPerimetro){
        this.jfPerimetros = jfPerimetros;
        this.modelPerimetro = modelPerimetro;
        this.jfPerimetros.jb_Aceptar.addActionListener(this);
        initView();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == this.jfPerimetros.jb_Aceptar){
            this.modelPerimetro.setBase(par.pDu(this.jfPerimetros.jtf_Base.getText()));
            this.modelPerimetro.setCateto(par.pDu(this.jfPerimetros.jtf_cateto.getText()));
            this.modelPerimetro.setLado(par.pDu(this.jfPerimetros.jtf_Altura.getText()));
            this.modelPerimetro.setRadio(par.pDu(this.jfPerimetros.jtf_Radio.getText()));
            if(this.jfPerimetros.jrb_Circulo.isSelected()){
                this.jfPerimetros.jl_Perimetro.setText("" + this.modelPerimetro.perimCircul());
            } else if(this.jfPerimetros.jrb_Cuadrado.isSelected()){
                this.jfPerimetros.jl_Perimetro.setText(""+this.modelPerimetro.perimCuadrado());
            } else if(this.jfPerimetros.jrb_Rectangulo.isSelected()){
                this.jfPerimetros.jl_Perimetro.setText(""+this.modelPerimetro.perimRectangulo());
            } else {
                this.jfPerimetros.jl_Perimetro.setText(""+this.modelPerimetro.perimTriangulo());
            }
        }
    }
    public void initView(){
        this.jfPerimetros.setVisible(true);
    }
}
