package com.palermo.ejercicio_computadoras;

public class Computadora {
    public String marca;
    public String modelo;
    public Integer ano;
    public String tipo;
    public Integer memoria_ram;

    public Disco disco;
    public Procesador procesador;

    public void mostrar() {

        System.out.println("Modelo: " + modelo);
        System.out.println("Ano: " + ano);
        System.out.println("Disco: " + disco.marca);
    }
}


