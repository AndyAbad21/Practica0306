/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package com.mycompany.mavenproject2.modelo;

import java.awt.Color;
import java.awt.Point;

/**
 * 
 * @author Andy Abad
 */
public class Figuras
{
    private String tipo;
    private Color color;
    private int alto;
    private int ancho;
    private Point punto;

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public int getAlto() {
        return alto;
    }

    public void setAlto(int alto) {
        this.alto = alto;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }
    
    public Point getPunto() {
        return punto;
    }

    public void setPunto(Point punto) {
        this.punto = punto;
    }
    
    

}
