/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package controllers;
import views.*;
import models.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 *
 * Windows
 */
public class ControllerMain implements ActionListener{
    
    JF_Main jfMain;
    JF_Areas jfArea;
    JF_Perimetros jfPerimetros;
    JF_Volumenes jfVolumenes;
    ModelMain modelMain;
    ModelArea modelArea;
    ModelPerimetro modelPerimetro;
    ModelVolumen modelVolumen;
    
    public ControllerMain(JF_Main jfMain, JF_Areas jfArea, JF_Perimetros jfPerimetros, JF_Volumenes jfVolumenes, ModelMain modelMain, ModelArea modelArea, ModelPerimetro modelPerimetro, ModelVolumen modelVolumen){
        this.jfMain = jfMain;
        this.jfArea = jfArea;
        this.jfPerimetros = jfPerimetros;
        this.jfVolumenes = jfVolumenes;
        this.modelMain = modelMain;
        this.modelArea = modelArea;
        this.modelPerimetro = modelPerimetro;
        this.modelVolumen = modelVolumen;
        this.jfMain.jmi_Areas.addActionListener(this);
        this.jfMain.jmi_Volumenes.addActionListener(this);
        this.jfMain.jmi_Perimetros.addActionListener(this);
        initView();
    }
    
    private void initView() {
        this.jfMain.setTitle("Hola usuario :3");
        this.jfMain.setLocationRelativeTo(null);
        this.jfMain.setVisible(true);
        this.jfMain.setResizable(false);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == this.jfMain.jmi_Areas) {
            jmi_AreasActionPerformed();
        } else if (ae.getSource() == this.jfMain.jmi_Volumenes){
            jmi_PerimetrosActionPerformed();
        } else {
            jmi_VolumenesActionPerformed();
        }
    }
    
    public void jmi_AreasActionPerformed() {
        this.jfMain.setContentPane(jfArea);
        this.jfMain.revalidate();
        this.jfMain.repaint();
    }
    
    public void jmi_PerimetrosActionPerformed(){
        this.jfMain.setContentPane(jfPerimetros);
        this.jfMain.revalidate();
        this.jfMain.repaint();
    }

    public void jmi_VolumenesActionPerformed() {
        this.jfMain.setContentPane(jfVolumenes);
        this.jfMain.revalidate();
        this.jfMain.repaint();
    }
}