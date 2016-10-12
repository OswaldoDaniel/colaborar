/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;
import controllers.*;
import models.*;
import views.*;
/**
 *
 * @author WINDOWS
 */
public class Main {
    //Main
    private static ModelMain modelMain;
    private static JF_Main jfMain;
    private static ControllerMain controllerMain;
    //Area
    private static ModelArea modelArea;     
    private static JF_Areas jfArea;
    private static ControllerArea controllerArea;
    //perimetros
    private static ModelPerimetro modelPerimetros;
    private static JF_Perimetros jfPerimetros;
    private static ControllerPerimetro controllerPerimetro;
    //volumen
    private static ModelVolumen modelVolumen;
    private static JF_Volumenes jfVolumen;
    private static ControllerVolumen controllerVolumen;
    public static void main(String [] odst){
        modelVolumen = new ModelVolumen();
        jfVolumen = new JF_Volumenes();
        controllerVolumen = new ControllerVolumen(jfVolumen, modelVolumen);
        
        modelArea = new ModelArea();
        jfArea = new JF_Areas ();
        controllerArea = new ControllerArea(jfArea, modelArea);
        
        modelPerimetros = new ModelPerimetro();
        jfPerimetros = new JF_Perimetros();
        controllerPerimetro = new ControllerPerimetro(jfPerimetros, modelPerimetros);
        
        modelMain = new ModelMain();
        jfMain = new JF_Main();
        controllerMain = new ControllerMain(jfMain, jfArea, jfPerimetros, jfVolumen, modelMain, modelArea, modelPerimetros, modelVolumen);
    }
}
