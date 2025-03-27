package com.santiago;

public class Persona {

    private String nombre;
    private int edad;

    /**
     * Constructor de Persona
     * @param nombre de la persona
     * @param edad la edad que tiene la persona
     */
    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }
    /**
     * Getter do atributo nombre
     * @return devolve o nombre 
     */
    public String getNombre() {
        return nombre;
    }
    /**
     * Setter do atributo nombre 
     * @param nombre
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    /**
     * Getter da idade da persoa 
     * @return devolve a idade da persoa
     */
    public int getEdad() {
        return edad;
    }
    /**
     * Setter do atributo da idade da persoa
     * @param edad
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    /**
     * Un método que imprime o nombre e idade da persoa
     */
    public void imprimirDetalles() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
    }
}
