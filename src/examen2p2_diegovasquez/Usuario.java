/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen2p2_diegovasquez;

import java.io.Serializable;

/**
 *
 * @author Diego Vasquez
 */
public class Usuario implements Serializable{
    protected String UserName;
    protected String Password;
    protected int edad;//debe de ser mayor de 12 si es usuario, y 18 si es artista
    
    private static final Long serialVersionUID = 696L;

    public Usuario() {
    }

    public Usuario(String UserName, String Password, int edad) {
        this.UserName = UserName;
        this.Password = Password;
        this.edad = edad;
    }

    public String getUserName() {
        return UserName;
    }

    public void setUserName(String UserName) {
        this.UserName = UserName;
    }

    public String getPassword() {
        return Password;
    }

    public void setPassword(String Password) {
        this.Password = Password;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return UserName;
    }
    
}
