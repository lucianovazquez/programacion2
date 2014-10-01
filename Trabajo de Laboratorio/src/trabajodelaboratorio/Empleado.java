package trabajodelaboratorio;

/**
 *
 * @author RoqueG
 */
public abstract class Empleado extends Persona {
    
    private String tipo_cargo;
    private int nro_legajo;
    private LocalDate fec_ingreso;
    
        public Empleado(String nombre, String apellido,String calle, int numero, int dni,int diaNac,int mesNac,int añoNac, String tipo_cargo, int nro_legajo, LocalDate fec_ingreso){
            
        super(nombre,apellido,calle,numero,dni,diaNac,mesNac,añoNac);
        this.tipo_cargo=tipo_cargo;
        this.nro_legajo=nro_legajo;
        this.fec_ingreso=fec_ingreso;
        
    }
    
}
