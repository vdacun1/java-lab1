package com.palermo.teorico;

public class Padre implements IPadre {
    public int multiplicar (double i) {
        return 22;
    }

    @Override
    public float dividir(int a, int b) {
        return (a/b);
    }

    @Override
    public int sumar(int a, int b) {
        return 0;
    }

    @Override
    public int multiplicar(int a, int b) {
        return 0;
    }

    @Override
    public int restar(int a, int b) {
        return 0;
    }
}


