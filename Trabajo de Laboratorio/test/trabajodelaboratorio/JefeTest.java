/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodelaboratorio;

import excepciones.TipoEmpleadoNoValidoException;
import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Roque
 */
public class JefeTest {
    
    public JefeTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of addEmpleadoANomina method, of class Jefe.
     */
    @Test (expected = TipoEmpleadoNoValidoException.class)
    public void testAgregarEmpleadoNoValidoANomina() throws Exception {
        Empleado emp1 = new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f);
        Jefe jefe1 = new Jefe();
        jefe1.addEmpleadoANomina(emp1);
    }

    @Test 
    public void testAgregarEmpleadoValidoANomina() throws Exception {
        Empleado emp1 = new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2));
        Empleado emp2 = new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15));

        Jefe jefe1 = new Jefe();
        jefe1.addEmpleadoANomina(emp1);
        jefe1.addEmpleadoANomina(emp2);

        assertEquals(emp2,jefe1.getNominaEmpleados().get(1));
    }
    
    /**
     * Test of eliminarEmpleadoDeNomina method, of class Jefe.
     */
    @Test
    public void testEliminarEmpleadoDeNomina()throws Exception {
        Empleado emp1 = new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2));
        Empleado emp2 = new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15));
        Jefe jefe1 = new Jefe();
        jefe1.addEmpleadoANomina(emp1);
        jefe1.addEmpleadoANomina(emp2);
        jefe1.eliminarEmpleadoDeNomina(emp1);
        jefe1.eliminarEmpleadoDeNomina(emp2);
        assertTrue(jefe1.getNominaEmpleados().isEmpty());
    }
}
