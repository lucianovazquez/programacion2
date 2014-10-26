/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;

import java.time.LocalDate;
import java.util.ArrayList;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;
import trabajodelaboratorio.Administrativo;
import trabajodelaboratorio.Domicilio;
import trabajodelaboratorio.Empleado;
import trabajodelaboratorio.Jefe;
import trabajodelaboratorio.Operario;
import trabajodelaboratorio.Vendedor;

/**
 *
 * @author Luciano
 */
public class NewEmptyJUnitTest {
    
    public NewEmptyJUnitTest() {
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
    
    @Test
    public void agregarEmpleadosTest(){
        ArrayList<Empleado> empleados = new ArrayList<>();
        Empleado empleado1 = new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Tecnologia");
        Empleado empleado2 = new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f);
        Empleado empleado3 = new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2));
        Empleado empleado4 = new Administrativo("Marcelo","Vazquez",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,8,12));
        
        
        empleados.add(empleado1);
        empleados.add(empleado2);
        empleados.add(empleado3);
        empleados.add(empleado4);
        
        int nroLeg;
        int nroBuscar =101;
        Empleado empBuscado = null;
        
        for (int i = 0; i < empleados.size(); i++) {
            nroLeg=empleados.get(i).getNroLegajo();
            if(nroLeg==nroBuscar){
                empBuscado=empleados.get(i);
            }
        }
        
        assertEquals(empleado2,empBuscado);
   
    }
    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    //
    // @Test
    // public void hello() {}
}
