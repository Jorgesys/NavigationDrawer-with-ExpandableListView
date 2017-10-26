package com.jorgesys.navigationexpandablelistview.objects;

public class ElementoMenu {

    private String titulo;
    private int imagenResource;


    public ElementoMenu(String titulo, int imagenResource){
        this.titulo = titulo;
        this.imagenResource = imagenResource;
    }

    public int getImagenResource() {
        return imagenResource;
    }

    public void setImagenResource(int imagenResource) {
        this.imagenResource = imagenResource;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

}
