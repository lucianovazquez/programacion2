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
}
