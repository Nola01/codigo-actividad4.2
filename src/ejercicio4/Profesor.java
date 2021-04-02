package ejercicio4;

import java.util.List;

/**
 * Clase que crea dos objetos: nombre de tipo String, edad de tipo int, con sus
 * respectivos getter y setter. También contiene dos métodos que devuelven los valores
 * de estos objetos
 * @author Juan Maria Nolasco
 * @Version 1.0.0
 */
public class Profesor extends Persona{
    String nombre;
    int edad;
    List<Prestamo> prestamos;

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public List<Prestamo> getPrestamos() {
        return prestamos;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public void setPrestamos(List<Prestamo> prestamos) {
        this.prestamos = prestamos;
    }

    public Profesor(String numeroDeTelefono, String numeroDeTelefono1) {

        super(numeroDeTelefono);
    }

    /**
     * Método que muestra en pantalla los valores de los objetos nombre, edad, numeroDeTelefono
     */
    public void printInformacionPersonal(){
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Teléfono: " + numeroDeTelefono);
    }

    /**
     * Método que muestra en pantalla el contenido del método printInformacionPersonal, y en prestamo
     */
    public void printTodaLaInformacion(){
        this.printInformacionPersonal();
        for (Prestamo p: prestamos) {
            System.out.println(p);
        }
    }

}
