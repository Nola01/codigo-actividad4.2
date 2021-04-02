package ejercicio4;

/**
 * Clase Persona que crea el objeto numerodeTelefono de tipo String, junto a su constructor,
 * su getter y su setter
 * @author Juan Maria Nolasco
 * @version 1.0.0
 */
public class Persona {
    protected String numeroDeTelefono;
    public Persona(String numeroDeTelefono){
        super();
        this.numeroDeTelefono = numeroDeTelefono;
    }

    public String getNumeroDeTelefono() {

        return numeroDeTelefono;
    }

    public void setNumeroDeTelefono(String numeroDeTelefono) {

        this.numeroDeTelefono = numeroDeTelefono;
    }
}
