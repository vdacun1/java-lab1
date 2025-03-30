package com.palermo.teorico;

public class Hijo extends Padre{    //Hijo hereda de Padre, quiere decir que se puede comparte como padre
    public  int multiply (int i){
        return 55;
    }

    public  int multiply (double i){
        return 333;

    }
}


//puedo tener una sola firma por metodo, es decir metodo=multiply puede tener una sola firma=int o firma=double