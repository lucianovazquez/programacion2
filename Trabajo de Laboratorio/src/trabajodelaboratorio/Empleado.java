package trabajodelaboratorio;

/**
 *
 * @author RoqueG
 */
public class Empleado {
    private DatosPersonales datosPersonales;
        
    public Empleado(String nombre, String apellido,String calle, int numero, int dni,int diaNac,int mesNac,int añoNac){
        this.datosPersonales = new DatosPersonales(nombre, apellido,calle,numero,dni,diaNac,mesNac,añoNac);
    }
    
}
