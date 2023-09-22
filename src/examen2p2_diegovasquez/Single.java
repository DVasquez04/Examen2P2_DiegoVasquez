/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
public class Single extends Lanzamiento{
    private Cancion cancion;

    public Single() {
        super();
    }

    public Single(Cancion cancion, String Titulo, String FechaLanzamiento, int ConteoLikes) {
        super(Titulo, FechaLanzamiento, ConteoLikes);
        this.cancion = cancion;
    }

    public Cancion getCancion() {
        return cancion;
    }

    public void setCancion(Cancion cancion) {
        this.cancion = cancion;
    }

    @Override
    public String toString() {
        return cancion.toString();
    }
    
}
