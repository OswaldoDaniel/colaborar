/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.JF_Areas;
import models.ModelArea;
import ODST.Parseos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerArea implements ActionListener{

    Parseos par = new Parseos();
    JF_Areas jfAreas;
    ModelArea modelArea;
    
    public ControllerArea(JF_Areas jfAreas, ModelArea modelArea){
        this.jfAreas = jfAreas;
        this.modelArea = modelArea;
        this.jfAreas.jb_Aceptar.addActionListener(this);
        initView();
    }
    
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource()==this.jfAreas.jb_Aceptar){
            this.modelArea.setBase(par.pDu(this.jfAreas.jtf_Base.getText()));
            this.modelArea.setLado(par.pDu(this.jfAreas.jtf_Altura.getText()));
            this.modelArea.setRadio(par.pDu(this.jfAreas.jtf_Radio.getText()));
            if(this.jfAreas.jrb_Circulo.isSelected()){
                this.jfAreas.jl_Area.setText("" +this.modelArea.areaCirculo());
            } else if(this.jfAreas.jrb_Cuadrado.isSelected()){
                this.jfAreas.jl_Area.setText("" +this.modelArea.areaCuadrado());
            } else if(this.jfAreas.jrb_Rectangulo.isSelected()){
                this.jfAreas.jl_Area.setText("" +this.modelArea.areaRectangulo());
            } else{
                this.jfAreas.jl_Area.setText("" +this.modelArea.areaTriangulo());
            }
        }
    }
    public void initView(){
        this.jfAreas.setVisible(true);
    }
}
