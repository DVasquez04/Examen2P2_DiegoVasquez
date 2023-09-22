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
public class Cliente extends Usuario{
    private ArrayList<Cancion> CacionesFav = new ArrayList();
    private ArrayList<Cancion> PlayList = new ArrayList();
    private ArrayList<ListaReproduccion> LikedListasRep = new ArrayList();

    public Cliente() {
        super();
    }

    public Cliente(String UserName, String Password, int edad) {
        super(UserName, Password, edad);
    }

    public ArrayList<Cancion> getCacionesFav() {
        return CacionesFav;
    }

    public void setCacionesFav(ArrayList<Cancion> CacionesFav) {
        this.CacionesFav = CacionesFav;
    }

    public ArrayList<Cancion> getPlayList() {
        return PlayList;
    }

    public void setPlayList(ArrayList<Cancion> PlayList) {
        this.PlayList = PlayList;
    }

    public ArrayList<ListaReproduccion> getLikedListasRep() {
        return LikedListasRep;
    }

    public void setLikedListasRep(ArrayList<ListaReproduccion> LikedListasRep) {
        this.LikedListasRep = LikedListasRep;
    }
    
}
