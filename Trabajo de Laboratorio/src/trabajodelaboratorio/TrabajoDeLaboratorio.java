package trabajodelaboratorio;

import java.time.LocalDate;
/**
 *
 * @author Luciano
 */
public class TrabajoDeLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola maldito mundo!!!!!");
        
       /* Creacion de un empleado tipo jefe*/
        Empleado empleado1 = new Jefe("Juan","Perez",new Domicilio("Belgrano",520),24503291,LocalDate.of(1990,10,4),483838,LocalDate.of(2010,6,20),"Tecnologia");
        
        /* Creacion de un empleado tipo vendedor*/
        Empleado empleado2 = new Vendedor("Juan","Carlos",new Domicilio("Belgrano",520),24503291,LocalDate.of(1990,10,4),483838,LocalDate.of(2010,6,20),1,20.00f);
        
        Jefe jef1=(Jefe)empleado1;
        try{
            jef1.addEmpleadoANomina(empleado2);
        }catch(Exception e){
            System.out.println(e.getMessage());
        }
    }
}
