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
class ListaReproduccion {
    private String nombre;
    private int ContLikes;
    private ArrayList<Cancion> canciones = new ArrayList();

    public ListaReproduccion() {
    }

    public ListaReproduccion(String nombre, int ContLikes) {
        this.nombre = nombre;
        this.ContLikes = ContLikes;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getContLikes() {
        return ContLikes;
    }

    public void setContLikes(int ContLikes) {
        this.ContLikes = ContLikes;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
}
