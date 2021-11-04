/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pilas;


public class Alumno {
   private int código;
   private String nombre;
   private String apellido;
   private int edad;

    public Alumno() {
        this.código = 0;
        this.nombre = "";
        this.apellido = "";
        this.edad = 0;
    }

    public Alumno(int código, String nombre, String apellido, int edad) {
        this.código = código;
        this.nombre = nombre;
        this.apellido = apellido;
        this.edad = edad;
    }

    public int getCódigo() {
        return código;
    }

    public void setCódigo(int código) {
        this.código = código;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "\nCódigo: " + código + "\nNombre: " + nombre + "\nApellido: " + apellido + "\nEdad: " + edad + "\n";
    }
    
   
}
