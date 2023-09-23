package examen2p2_diegovasquez;
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author Diego Vasquez
 */

import javax.swing.JProgressBar;

public class HiloAudio implements Runnable{
    private JProgressBar barra;
    private boolean avanzar;
    private boolean alaiv;

    public HiloAudio(JProgressBar bar){
        this.barra = barra;
        avanzar = true;
        alaiv = true;
    }

    public JProgressBar getBarra() {
        return barra;
    }

    public void setBarra(JProgressBar barra) {
        this.barra = barra;
    }

    public boolean isAvanzar() {
        return avanzar;
    }

    public void setAvanzar(boolean avanzar) {
        this.avanzar = avanzar;
    }

    public boolean isAlaiv() {
        return alaiv;
    }

    public void setAlaiv(boolean alaiv) {
        this.alaiv = alaiv;
    }

    @Override
    public void run() {
        while(alaiv){
            if(avanzar){
                barra.setValue(barra.getValue()+1);
                if(barra.getValue()== 120){
                    alaiv = false;
                }
            }
            try {
                Thread.sleep(2000);
            } catch (Exception e) {
            }
        }
    }
    

    
    
}