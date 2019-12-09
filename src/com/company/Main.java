package com.company;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        Functions functions = new Functions();

        ArrayList<String> listaDeCodigos = new ArrayList<String>();

        listaDeCodigos.add("CRR-88578-9");
        listaDeCodigos.add("BAS-88578-9");
        listaDeCodigos.add("AAR-88578-9");
        listaDeCodigos.add("ZVR-88578-9");
        listaDeCodigos.add("RSG-88578-9");
        listaDeCodigos.add("WEF-88578-9");
        listaDeCodigos.add("AAA-88578-9");
        listaDeCodigos.add("QWE-88578-9");

        String codigo ="CCR-88578-9";

        functions.esPrioritario(codigo);

        functions.verificar(codigo);

        functions.ordenarAlfabeticamente(listaDeCodigos);

    }
}
