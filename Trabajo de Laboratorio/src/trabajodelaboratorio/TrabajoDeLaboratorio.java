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
        System.out.printf("Hola maldito mundo!!!!!");
        Empleado empleado1 = new Jefe("Juan","Perez",new Domicilio("Belgrano",520),24503291,LocalDate.of(10,8,1990),483838,LocalDate.of(2010,6,20),"Tecnologia");
    }
}
