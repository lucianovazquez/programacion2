package trabajodelaboratorio;

/**
 *
 * @author Roqueg
 */

//Posiblemente se cambiara la clase a clase abstracta para poder usar domicilio simple, departamento o barrio
public class Domicilio {
    private String calle;
    private int numero;
    
    public Domicilio(String calle, int numero){
        this.calle = calle;
        this.numero = numero;
    }

    /**
     * @return the calle
     */
    public String getCalle() {
        return calle;
    }

    /**
     * @param calle the calle to set
     */
    public void setCalle(String calle) {
        this.calle = calle;
    }

    /**
     * @return the numero
     */
    public int getNumero() {
        return numero;
    }

    /**
     * @param numero the numero to set
     */
    public void setNumero(int numero) {
        this.numero = numero;
    }
}
