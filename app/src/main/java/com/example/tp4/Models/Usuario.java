package com.example.tp4.Models;

public class Usuario {
    private String Nombre;
    private String Apellido;
    private String Mail;
    private String Pasw;

    public Usuario(String nombre, String apellido, String mail, String pasw) {
        Nombre = nombre;
        Apellido = apellido;
        Mail = mail;
        Pasw = pasw;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public String getApellido() {
        return Apellido;
    }

    public void setApellido(String apellido) {
        Apellido = apellido;
    }

    public String getMail() {
        return Mail;
    }

    public void setMail(String mail) {
        Mail = mail;
    }

    public String getPasw() {
        return Pasw;
    }

    public void setPasw(String pasw) {
        Pasw = pasw;
    }
}
