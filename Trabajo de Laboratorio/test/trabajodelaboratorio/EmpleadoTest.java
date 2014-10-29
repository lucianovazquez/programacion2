/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodelaboratorio;

import excepciones.YaTieneUnConyugeException;
import excepciones.YaTieneUnJefeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;
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
public class EmpleadoTest {
    
    public EmpleadoTest() {
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
     * Test of addFamiliar method, of class Empleado.
     */
    @Test (expected = YaTieneUnConyugeException.class)
    public void testAgregarDosEsposas() throws Exception {
        System.out.println("addFamiliar");
        Familiar esposa1 = new Conyuge("Teresita","Condori",'F',new Domicilio("Av.SiempreViva",123),32405326,LocalDate.of(1993,8,4));
        Familiar esposa2= new Conyuge("Maria","Condori",'F',new Domicilio("Av.SiempreViva",123),45402326,LocalDate.of(2014,8,4));
        Empleado empleado1 = new EmpleadoImpl();
        empleado1.addFamiliar(esposa1);
        empleado1.addFamiliar(esposa2);
        fail();
    }
    
    /**
     * Test of addFamiliar method, of class Empleado.
     */
    @Test
    public void testAgregarFamiliar() throws Exception {
        System.out.println("addFamiliar");
        Familiar esposa1 = new Conyuge("Teresita","Condori",'F',new Domicilio("Av.SiempreViva",123),32405326,LocalDate.of(1993,8,4));
        Familiar hija= new Hijo("Maria","Condori",'F',new Domicilio("Av.SiempreViva",123),45402326,LocalDate.of(2014,8,4));
        Empleado empleado1 = new EmpleadoImpl();
        empleado1.addFamiliar(esposa1);
        empleado1.addFamiliar(hija);
        
        assertEquals(2,empleado1.getFamiliares().size());
    }

  

    public class EmpleadoImpl extends Empleado {
    }
    
}
