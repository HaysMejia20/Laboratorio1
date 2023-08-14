/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.laboratorio1;
/**
 *
 * @author haysm
 */
public class Vehiculo {


    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;

    public Vehiculo(String marca, String modelo, int año, String color, double precio) {
        this.marca = marca;
        this.modelo = modelo;
        this.año = año;
        this.color = color;
        this.precio = precio;
    }

    // Métodos get
    public String getMarca() {
        return marca;
    }

    public String getModelo() {
        return modelo;
    }

    public int getAño() {
        return año;
    }

    public String getColor() {
        return color;
    }

    public double getPrecio() {
        return precio;
    }

    // Métodos set
    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }
}

