/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public class Lanzamiento {
    protected String Titulo;
    protected String FechaLanzamiento;
    protected int ConteoLikes;

    public Lanzamiento() {
    }

    public Lanzamiento(String Titulo, String FechaLanzamiento, int ConteoLikes) {
        this.Titulo = Titulo;
        this.FechaLanzamiento = FechaLanzamiento;
        this.ConteoLikes = ConteoLikes;
    }

    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String Titulo) {
        this.Titulo = Titulo;
    }

    public String getFechaLanzamiento() {
        return FechaLanzamiento;
    }

    public void setFechaLanzamiento(String FechaLanzamiento) {
        this.FechaLanzamiento = FechaLanzamiento;
    }

    public int getConteoLikes() {
        return ConteoLikes;
    }

    public void setConteoLikes(int ConteoLikes) {
        this.ConteoLikes = ConteoLikes;
    }

    @Override
    public String toString() {
        return Titulo;
    }
    
}
