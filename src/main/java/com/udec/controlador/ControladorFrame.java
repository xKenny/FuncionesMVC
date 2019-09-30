/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.udec.controlador;
import com.udec.modelo.Logica;
import com.udec.vista.*;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JFrame;

/**
 *clase que recime los datos del frame y los envia al modelo
 * @author Duvan Poveda
 */
public class ControladorFrame implements ActionListener {
    FrameVista frame = new FrameVista();
    
    /**
 *constructor principal que recibe el frame
 * @param Frame 
 */
    public ControladorFrame(FrameVista frame){
        this.frame = frame;
        this.frame.B_Calcular.addActionListener(this);
    }

    /**
    *metodo que se dispara cuando se presiona el boton calcular y atrapa los datos ingresados por el usuario
    * @param e 
    */
    @Override
    public void actionPerformed(ActionEvent e) {
        if(e.getSource() == frame.B_Calcular){
            double angulo = Double.parseDouble(frame.TF_Angulo.getText());
            String funcion = frame.CB_Funcion.getSelectedItem().toString();
            Logica logica = new Logica(angulo,funcion);
            double resultado = logica.Calcular();
            String resultadoString = String.valueOf(resultado);
            frame.getL_Resultado().setText(resultadoString);
        }
    }
    
}
