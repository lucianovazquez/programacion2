package trabajodelaboratorio;

/**
 * @author Luciano
 * @author Roqueg
 */

//Posiblemente se cambiara la clase a clase abstracta para poder usar domicilio simple, departamento o barrio
public class Domicilio {
    private String calle;
    private int numero;
    private int piso;
    private String departamento;

    public int getPiso() {
        return piso;
    }

    public void setPiso(int piso) {
        this.piso = piso;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public Domicilio(String calle, int numero){
        this.calle = calle;
        this.numero = numero;
        this.piso=0;
        this.departamento="";
    }
    public Domicilio(String calle, int numero, int piso,String departamento){
        this.calle = calle;
        this.numero = numero;
        this.piso=piso;
        this.departamento=departamento;
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
