package trabajodelaboratorio;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author RoqueG
 */
public abstract class Empleado extends Persona {
    
    private String tipoCargo;
    private int nroLegajo;
    private LocalDate fecIngreso;
    
    private ArrayList<Familiar> familiares = new ArrayList<>();
    
    public Empleado(String nombre, String apellido,char sexo, Domicilio domicilio, int dni,LocalDate fechaNacimiento, int nro_legajo, LocalDate fec_ingreso, String tipoCargo){
            
        super(nombre,apellido,sexo,domicilio,dni,fechaNacimiento);
        this.nroLegajo=nro_legajo;
        this.fecIngreso=fec_ingreso;  
        this.tipoCargo=tipoCargo;
    }

    /**
     * @return the tipoCargo
     */
    public String getTipoCargo() {
        return tipoCargo;
    }

    /**
     * @param tipoCargo the tipoCargo to set
     */
    public void setTipoCargo(String tipoCargo) {
        this.tipoCargo = tipoCargo;
    }

    /**
     * @return the nroLegajo
     */
    public int getNroLegajo() {
        return nroLegajo;
    }

    /**
     * @param nroLegajo the nroLegajo to set
     */
    public void setNroLegajo(int nroLegajo) {
        this.nroLegajo = nroLegajo;
    }

    /**
     * @return the fecIngreso
     */
    public LocalDate getFecIngreso() {
        return fecIngreso;
    }

    /**
     * @param fecIngreso the fecIngreso to set
     */
    public void setFecIngreso(LocalDate fecIngreso) {
        this.fecIngreso = fecIngreso;
    }

     /**
      *  @param familiar el familiar a cargo a agregar
      */
    public void addFamiliar(Familiar familiar){
        familiares.add(familiar);
    }
    
    public void imprimirDatos(){
        super.imprimirDatos();
        System.out.println("DATOS DEL CARGO: Cargo: "+tipoCargo+" Legajo: "+nroLegajo+" Ingreso"+fecIngreso);
        System.out.println("FAMILIARES A CARGO: ");
        for(int i=0; i<familiares.size();i++){
            Familiar f = familiares.get(i);
            f.imprimirDatos();
        }
    }
}
