package com.company;

import java.util.ArrayList;
import java.util.Collections;


public class Functions {


    public boolean esPrioritario(String codigo){
        char prioritario = codigo.charAt(0);
        return prioritario == 'P' || prioritario == 'W';
    }

    public boolean verificar (String codigo){

        int resultadoparcial = 0;
        int resultadoTotal = 0;

        //corto el string dado en los numeros, convierto ya que si comparo con un char compararia por numero de ASCII

        String[] arrOfStr = codigo.split("-", -2);
        String  stringNumeros = arrOfStr[1];
        int numerosInt = Integer.parseInt(stringNumeros);

        //sumatoria de numeros individuales
        while (numerosInt>0){

            resultadoparcial = resultadoparcial + numerosInt % 10;

            numerosInt = numerosInt / 10;

        }
        //sumatoria del resultado anterior
        while(resultadoparcial>0){

            resultadoTotal = resultadoTotal + resultadoparcial % 10;

            resultadoparcial = resultadoparcial / 10;

        }

        int numeroFinal= Integer.parseInt(String.valueOf(codigo.charAt(10)));

        if (resultadoTotal == numeroFinal){
            return true;
        }
        return false;
    }

    public void ordenarAlfabeticamente (ArrayList listaDeCodigos){
        Collections.sort(listaDeCodigos);
        }





















}
