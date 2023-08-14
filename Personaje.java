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
public class Personaje {
   
    String nombre;
    private final double altura;
    double peso;
    String colorPiel;
    double porcentajePoder;
    String estado;

    public Personaje(String nombre, double altura, double peso, String colorPiel) {
        this.nombre = nombre;
        this.altura = altura;
        this.peso = peso;
        this.colorPiel = colorPiel;
        this.porcentajePoder = 0.0;
        this.estado = "Vivo";
    }

    public void atacar() {
        System.out.println(nombre + " está atacando.");
    }

    public void correr() {
        System.out.println(nombre + " está corriendo.");
    }

    public void saltar() {
        System.out.println(nombre + " está saltando.");
    }

    public void esquivar() {
        System.out.println(nombre + " está esquivando.");
    }

    public void morir() {
        estado = "Muerto";
        System.out.println(nombre + " ha muerto.");
    }
}


