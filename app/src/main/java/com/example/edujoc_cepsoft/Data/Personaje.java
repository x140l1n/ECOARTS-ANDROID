package com.example.edujoc_cepsoft.Data;

public class Personaje
{
    private int id;
    private String nombre;
    private String idioma;
    private String rutaImagen;
    private String descripcion;

    private boolean seleccionado = false;
    private int vidas = 5; //Tienen como máximo 5 vidas.

    public Personaje(int id, String nombre, String idioma, String rutaImagen, String descripcion)
    {
        this.id = id;
        this.nombre = nombre;
        this.idioma = idioma;
        this.rutaImagen = rutaImagen;
        this.descripcion = descripcion;
    }

    public void quitarVida(int i)
    {
        this.vidas -= i;
    }

    //region Getters
    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getIdioma() {
        return idioma;
    }

    public String getRutaImagen() {
        return rutaImagen;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public boolean isSeleccionado() {
        return seleccionado;
    }

    public int getVidas() {
        return vidas;
    }

    public void setVidas(int vidas) {
        this.vidas = vidas;
    }

    public void setSeleccionado(boolean seleccionado) {
        this.seleccionado = seleccionado;
    }
    //endregion
}
