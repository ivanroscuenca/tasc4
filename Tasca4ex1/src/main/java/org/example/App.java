package org.example;

import java.util.ArrayList;
import java.util.Collections;

//Crea una classe Java que insereixi en una llista ordenada
//        els noms dels mesos de l'any.
public class App {
    //Constructor
    public static ArrayList<String> metodeMesos() {
        ArrayList<String> mesos = new ArrayList<String>();
        Collections.addAll(mesos, "Gener", "Febrer", "Març","Abril", "Maig",
                "Juny", "Juliol","Agost", "Setembre", "Octubre", "Novembre", "Desembre");
        return mesos;
    }


}
