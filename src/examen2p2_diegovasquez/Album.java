/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegovasquez;

import java.util.ArrayList;

/**
 *
 * @author Diego Vasquez
 */
public class Album extends Lanzamiento{
    private ArrayList<Cancion> ListaCanciones = new ArrayList();
    private int CantCanciones;

    public Album() {
        super();
    }

    public Album(int CantCanciones) {
        this.CantCanciones = CantCanciones;
    }

    public Album(int CantCanciones, String Titulo, String FechaLanzamiento, int ConteoLikes) {
        super(Titulo, FechaLanzamiento, ConteoLikes);
        this.CantCanciones = CantCanciones;
    }

    public ArrayList<Cancion> getListaCanciones() {
        return ListaCanciones;
    }

    public void setListaCanciones(ArrayList<Cancion> ListaCanciones) {
        this.ListaCanciones = ListaCanciones;
    }

    public int getCantCanciones() {
        return CantCanciones;
    }

    public void setCantCanciones(int CantCanciones) {
        this.CantCanciones = CantCanciones;
    }
    
}
