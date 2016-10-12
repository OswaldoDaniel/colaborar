/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.JF_Volumenes;
import models.ModelVolumen;
import ODST.Parseos;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class ControllerVolumen implements ActionListener{
    Parseos par = new Parseos();
    JF_Volumenes jfVolumenes;
    ModelVolumen modelVolumen;
    public ControllerVolumen(JF_Volumenes jfVolumenes, ModelVolumen modelVolumen){
        this.jfVolumenes = jfVolumenes;
        this.modelVolumen = modelVolumen;
        this.jfVolumenes.jb_Aceptar.addActionListener(this);
        initView();
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == this.jfVolumenes.jb_Aceptar){
            this.modelVolumen.setRadio(par.pDu(this.jfVolumenes.jtf_radio.getText()));
            this.modelVolumen.setLado(par.pDu(this.jfVolumenes.jtf_Alto.getText()));
            this.modelVolumen.setBase(par.pDu(this.jfVolumenes.jtf_Largo.getText()));
            this.modelVolumen.setAncho(par.pDu(this.jfVolumenes.jtf_Ancho.getText()));
            if(this.jfVolumenes.jrb_Cilindro.isSelected()){
                this.jfVolumenes.jl_Volumen.setText("" + this.modelVolumen.volCilindro());
            } else if(this.jfVolumenes.jrb_Cubo.isSelected()){
                this.jfVolumenes.jl_Volumen.setText("" + this.modelVolumen.volCubo());
            } else if(this.jfVolumenes.jrb_Prisma.isSelected()){
                this.jfVolumenes.jl_Volumen.setText("" + this.modelVolumen.volPrisma());
            } else {
                this.jfVolumenes.jl_Volumen.setText("" + this.modelVolumen.volEsfera());
            }
        }
    }
    public void initView(){
        this.jfVolumenes.setVisible(true);
    }
    
}
