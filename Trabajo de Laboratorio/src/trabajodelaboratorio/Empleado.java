package trabajodelaboratorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RoqueG
 */
public abstract class Empleado extends Persona {
    
    private String tipo_cargo;
    private int nro_legajo;
    private LocalDate fec_ingreso;
    
    private ArrayList <Familiar> familiares = new ArrayList();
    
        public Empleado(String nombre, String apellido,String calle, int numero, int dni,int diaNac,int mesNac,int añoNac, String tipo_cargo, int nro_legajo, LocalDate fec_ingreso){
            
        super(nombre,apellido,calle,numero,dni,diaNac,mesNac,añoNac);
        this.tipo_cargo=tipo_cargo;
        this.nro_legajo=nro_legajo;
        this.fec_ingreso=fec_ingreso;
        
    }

    /**
     * @return the tipo_cargo
     */
    public String getTipo_cargo() {
        return tipo_cargo;
    }

    /**
     * @param tipo_cargo the tipo_cargo to set
     */
    public void setTipo_cargo(String tipo_cargo) {
        this.tipo_cargo = tipo_cargo;
    }

    /**
     * @return the nro_legajo
     */
    public int getNro_legajo() {
        return nro_legajo;
    }

    /**
     * @param nro_legajo the nro_legajo to set
     */
    public void setNro_legajo(int nro_legajo) {
        this.nro_legajo = nro_legajo;
    }

    /**
     * @return the fec_ingreso
     */
    public LocalDate getFec_ingreso() {
        return fec_ingreso;
    }

    /**
     * @param fec_ingreso the fec_ingreso to set
     */
    public void setFec_ingreso(LocalDate fec_ingreso) {
        this.fec_ingreso = fec_ingreso;
    }
    
}
