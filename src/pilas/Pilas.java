/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;

import java.util.Stack;

public class Pilas {

    public static void main(String[] args) {
        //Definimos la pila
        Stack<Alumno> pila = new Stack<>();
        
        //Apilamos elementos en la pila
        pila.push(new Alumno(101, "Carlitos", "Reyes", 15));
        pila.push(new Alumno(102, "Adelina", "Lopez", 14));
        pila.push(new Alumno(103, "Carolina", "King", 16));
        pila.push(new Alumno(104, "Julian", "Fedetruk", 13));
        pila.push(new Alumno(105, "Sofia", "DeBrito", 17));
        System.out.println("PILA DE ALUMNOS");
        System.out.println("*********************");
        System.out.println(pila);

        //Mostramos el último elemento Apilado
        System.out.println("*********************");
        System.out.println("ÚLTIMO ELEMENTO APILADO: " + pila.peek().getCódigo());
        System.out.println("*********************");

        //Desapilamos elementos de la pila
        System.out.println("ELEMENTOS DESAPILADOS: ");
        while (!pila.empty()) {
            System.out.println(pila.pop().getCódigo());
        }

    }

}
