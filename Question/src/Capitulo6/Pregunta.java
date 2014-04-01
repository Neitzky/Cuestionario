/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Capitulo6;

/**
 *
 * @author T107
 */

import java.util.*;
public class Pregunta {
 
    private int id;

    public Pregunta(int id, String titulo, ArrayList<Opcion> opciones) {
        this.id = id;
        this.titulo = titulo;
        this.opciones = opciones;
    }
    private String titulo;
    private ArrayList<Opcion> opciones;

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public ArrayList<Opcion> getOpciones() {
        return opciones;
    }

    public void setOpciones(ArrayList<Opcion> opciones) {
        this.opciones = opciones;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
    
    
}
