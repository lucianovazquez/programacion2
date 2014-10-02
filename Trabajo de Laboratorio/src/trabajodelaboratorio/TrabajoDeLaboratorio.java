package trabajodelaboratorio;

import Excepciones.TipoEmpleadoNoValidoException;
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
        
        Empleado empleado1 = new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Tecnologia");
        Empleado empleado2 = new Vendedor("Juan","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2010,6,20),1,20.00f);
        Empleado empleado3 = new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2));
        Empleado empleado4 = new Administrativo("Marcelo","Vazquez",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,8,12));
        
        empleado1.addFamiliar(new Familiar("Teresita","Condori",'F',new Domicilio("Av.SiempreViva",123),32405326,LocalDate.of(1993,8,4),"Esposa"));
        Jefe jef1=(Jefe)empleado1;
        
        try{
            jef1.addEmpleadoANomina(empleado2);
        }catch(TipoEmpleadoNoValidoException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        try{
            jef1.addEmpleadoANomina(empleado3);
        }catch(TipoEmpleadoNoValidoException e){
            System.out.println("Error: "+e.getMessage());
        }
        
        empleado1.imprimirDatos();
        
    }
}
