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
public class Artista extends Usuario{
    private String NombreArt;
    private ArrayList<Cancion> canciones = new ArrayList();
    private ArrayList<Album> albumes = new ArrayList();

    public Artista() {
        super();
    }

    public Artista(String NombreArt) {
        this.NombreArt = NombreArt;
    }

    public Artista(String NombreArt, String UserName, String Password, int edad) {
        super(UserName, Password, edad);
        this.NombreArt = NombreArt;
    }

    public String getNombreArt() {
        return NombreArt;
    }

    public void setNombreArt(String NombreArt) {
        this.NombreArt = NombreArt;
    }

    public ArrayList<Cancion> getCanciones() {
        return canciones;
    }

    public void setCanciones(ArrayList<Cancion> canciones) {
        this.canciones = canciones;
    }

    public ArrayList<Album> getAlbumes() {
        return albumes;
    }

    public void setAlbumes(ArrayList<Album> albumes) {
        this.albumes = albumes;
    }

    @Override
    public String toString() {
        return NombreArt;
    }
    
}
