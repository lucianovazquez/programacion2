package trabajodelaboratorio;

import excepciones.TipoEmpleadoNoValidoException;
import java.util.ArrayList;

/**
 * @author Luciano
 * @author Roque
 */
public class GestionEmpleados {
    private static ArrayList<Empleado> empleados = new ArrayList<>();
    
    /**
     * Metodo que retorna arraylist con los empleados
     * @return ArrayList<Empleado>
     */
    public static ArrayList<Empleado> getEmpleados(){
        return empleados;
    }
    
    /**
     * Metodo que retorna el empleado en la posicion i
     * @param i posicion del empleado en el arraylist
     * @return Empledo
     */
    public static Empleado getEmpleado(int i){
        return empleados.get(i);
    }
    
    /**
     * Metodo que agrega un nuevo empleado al arraylist "empleados"
     * @param empleado empleado a agregar
     */
    public static void addEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    /**
     * Metodo que retorna un nuevo arraylist de empleados solo con los operadores y administradores
     * que se encuentran en "empleados".
     * @return ArrayList<Empleado> arraylist de empleados solo con operadores y administradores
     */
    public static ArrayList<Empleado> obtenerNuevoArrayOperadoresAdministradores(){
        /* Crear array con los operadores y administradores sin jefe a partir del array de empleados */
        ArrayList<Empleado> arrayOperadoresAdministradores = new ArrayList<>();
        for (int i = 0; i < empleados.size(); i++) {
            if(empleados.get(i)instanceof Operario||empleados.get(i) instanceof Administrativo){
                EmpleadoNominaJefe empleadoNominaJefe =(EmpleadoNominaJefe)empleados.get(i);
                if(empleadoNominaJefe.getJefe()==null){
                    arrayOperadoresAdministradores.add(empleados.get(i));
                }
            }
        }
        return arrayOperadoresAdministradores;
    }
    
    /**
     * Metodo que retorna un nuevo arraylist de jefes solo con los jefes que se encuentran en "empleados".
     * @return ArrayList<Empleado> arraylist de jefes
     */
    public static ArrayList<Jefe> obtenerNuevoArrayJefes(){
        /* Crear array con los operadores y administradores sin jefe a partir del array de empleados */
        ArrayList<Jefe> arrayJefes = new ArrayList<>();
        for (int i = 0; i < empleados.size(); i++) {
            if(empleados.get(i)instanceof Jefe){
                    arrayJefes.add((Jefe)empleados.get(i));
            }
        }
        return arrayJefes;
    }
    
    /**
     * Devuelve true si ya existe un empleado con el numero de legajo enviado
     * @param legajo
     * @return true si existe un empleado con ese legajo y false en caso contrario
     */
    public static boolean existeEmpleadoConEsteLegajo(int legajo){
        /* Comprobar si ya existe un empleado con ese legajo*/
        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).getNroLegajo()==legajo){
                return true;
            }
        }
        return false;
    }
    
    /**
     * Retorna el empleado con el numero de legajo enviado
     * @param legajo del empleado
     * @return empleado
     */
    public static Empleado getEmpleadoConEsteLegajo(int legajo){
        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).getNroLegajo()==legajo){
                return empleados.get(i);
            }
        }
        return null;
    }
    
    public static int getPosicionEmpleadoConEsteLegajo(int legajo){
        for(int i=0;i<empleados.size();i++){
            if(empleados.get(i).getNroLegajo()==legajo){
                return i;
            }
        }
        return -1;
    }
    
    public static Empleado instanciarNuevoEmpleado(String cargo) throws TipoEmpleadoNoValidoException{
        Empleado emp;
        switch(cargo) {
            case "Vendedor":
                    emp = new Vendedor();
                break;
            case "Jefe de Área":
                    emp = new Jefe();
                break;
            case "Administrativo":
                    emp = new Administrativo();
                break;
            case "Operario":
                    emp = new Operario();
                break;
            case "Gerente":
                    emp = new Gerente();
                break;
            default:
                    throw new TipoEmpleadoNoValidoException("El tipo de empleado no exsite");
        }
        return emp;
    }
}
