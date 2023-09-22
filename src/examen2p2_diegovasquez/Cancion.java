/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegovasquez;

/**
 *
 * @author Diego Vasquez
 */
class Cancion {
    private String Name;
    private int Minutos;
    private int Segundos;
    private String Referencia;

    public Cancion() {
    }

    public Cancion(String Name, int Minutos, int Segundos, String Referencia) {
        this.Name = Name;
        this.Minutos = Minutos;
        this.Segundos = Segundos;
        this.Referencia = Referencia;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getMinutos() {
        return Minutos;
    }

    public void setMinutos(int Minutos) {
        this.Minutos = Minutos;
    }

    public int getSegundos() {
        return Segundos;
    }

    public void setSegundos(int Segundos) {
        this.Segundos = Segundos;
    }

    public String getReferencia() {
        return Referencia;
    }

    public void setReferencia(String Referencia) {
        this.Referencia = Referencia;
    }

    @Override
    public String toString() {
        return Name;
    }
    
}
