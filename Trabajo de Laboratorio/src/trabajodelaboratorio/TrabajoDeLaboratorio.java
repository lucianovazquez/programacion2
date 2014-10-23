package trabajodelaboratorio;

import excepciones.TipoEmpleadoNoValidoException;
import excepciones.YaTieneUnConyugeException;
import excepciones.YaTieneUnJefeException;
import interfacesGraficas.VentanaPrincipal;
import java.time.LocalDate;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author Luciano
 */
public class TrabajoDeLaboratorio {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        Empleado empleado1 = new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Tecnologia");
        Empleado empleado2 = new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f);
        Empleado empleado3 = new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2));
        Empleado empleado4 = new Administrativo("Marcelo","Vazquez",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,8,12));
        
        try {
            empleado1.addFamiliar((Familiar)new Conyuge("Teresita","Condori",'F',new Domicilio("Av.SiempreViva",123),32405326,LocalDate.of(1993,8,4)));
            empleado1.addFamiliar((Familiar)new Hijo("Maria","Condori",'F',new Domicilio("Av.SiempreViva",123),45402326,LocalDate.of(2014,8,4)));
        } catch (YaTieneUnConyugeException ex) {
            System.out.println(ex.getMessage());
        }
        
        Jefe emp=(Jefe)empleado1;
        try{    
            emp.addEmpleadoANomina(empleado3);
            emp.addEmpleadoANomina(empleado4);
        } catch (TipoEmpleadoNoValidoException ex) {
            System.out.print(ex);
        } catch (YaTieneUnJefeException ex) {
            System.out.print(ex);
        }
        VentanaPrincipal vp = new VentanaPrincipal();
        vp.setVisible(true);
    }
}
