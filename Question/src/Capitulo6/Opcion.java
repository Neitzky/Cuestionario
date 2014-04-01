package Capitulo6;


public class Opcion {
    
    private int id;
    private String titulo;
    private Boolean valor;

    public Opcion(int id, String titulo, Boolean valor) {
        this.id = id;
        this.titulo = titulo;
        this.valor = valor;
    }

    Opcion(String el_Salvador, boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public Boolean isValor() {
        return valor;
    }

    public void setValor(Boolean valor) {
        this.valor = valor;
    }

    
}
