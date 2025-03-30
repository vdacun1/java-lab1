package com.palermo.teorico;

public class Main {
    public static void main(String[] args) {
        Padre dad = new Hijo(); //aca creo una instancia padre con el constructor Hijo (POLIMORFIMO)
        System.out.println(dad.multiplicar(3));
        System.out.println(dad.multiplicar(1.2));
        System.out.println(dad.dividir(1,2));
        //System.out.println(dad.multiply(1));  //esto no anda porque dad es una instancia de padre, padre solamente tiene el metodo multiplicar


        Hijo son = new Hijo(); //creo otra instancia
        System.out.println(son.multiply(44));
        System.out.println(son.multiply(55.3));

        System.out.println(son.multiply(4.3)); //aca imprime 22 porque hijo esta HEREDANDO el metodo MULTIPLICAR

    UnaClase.unMetodo();



    }
}



