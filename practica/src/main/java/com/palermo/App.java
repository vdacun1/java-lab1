package com.palermo;

import com.palermo.ejercicio_computadoras.Computadora;
import com.palermo.ejercicio_computadoras.Disco;
import com.palermo.ejercicio_computadoras.Procesador;

public class App
{
    public static void main( String[] args )
    {
    Disco disco = new Disco();
    disco.marca = "SeaGate";
    disco.velocidad = 10;
    Procesador procesador = new Procesador();
    Computadora computadora = new Computadora();
    computadora.disco = disco;
    computadora.mostrar();
    }
}
