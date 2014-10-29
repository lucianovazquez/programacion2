/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package trabajodelaboratorio;

import excepciones.TipoEmpleadoNoValidoException;
import excepciones.YaTieneUnConyugeException;
import excepciones.YaTieneUnJefeException;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
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
public class GestionEmpleadosJUnitTest {
    private GestionEmpleados gestionEmpleados;
    public GestionEmpleadosJUnitTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
       gestionEmpleados = new GestionEmpleados();
    }
    
    @After
    public void tearDown() {
        GestionEmpleados.getEmpleados().clear();
    }

    // TODO add test methods here.
    // The methods must be annotated with annotation @Test. For example:
    
    @Test
    public void agregarEmpleadoAdministrativoTest() {
       Empleado administrativo1 = new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15));
       GestionEmpleados.addEmpleado(administrativo1);
       assertEquals(administrativo1,GestionEmpleados.getEmpleado(0));     
    }
    
    @Test
    public void agregarEmpleadoJefeTest() {
       Empleado jefe1 = new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Producción");
       GestionEmpleados.addEmpleado(jefe1);
       assertEquals(jefe1,GestionEmpleados.getEmpleado(0));     
    }
    
    @Test
    public void agregarEmpleadoOperarioTest() {
       Empleado operario1 = new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2));
       GestionEmpleados.addEmpleado(operario1);
       assertEquals(operario1,GestionEmpleados.getEmpleado(0));     
    }
    
    @Test
    public void agregarEmpleadoVendedorTest() {
       Empleado vendedor1 = new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f);
       GestionEmpleados.addEmpleado(vendedor1);
       assertEquals(vendedor1,GestionEmpleados.getEmpleado(0));     
    }
    
    @Test
    public void comprobarEmpleadosEnPosicionCorrectaTest() {
        Empleado[] emp = {new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Producción")
         ,new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f)
        ,new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2))
        , new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15))
        , new Operario("Sergio","Moreno",'M',new Domicilio("San Martín",454),24653293,LocalDate.of(1982,9,23),104,LocalDate.of(2013,3,12))
        , new Administrativo("Cristina","Fernandez",'F',new Domicilio("Junín",267),22578393,LocalDate.of(1982,10,23),105,LocalDate.of(2010,8,11))
        , new Jefe("Florencia","Sosa",'F',new Domicilio("Salta",570),30578393,LocalDate.of(1990,10,23),106,LocalDate.of(2012,3,14),"Dirección")
        , new Jefe("Gonzalo","Ibañez",'M',new Domicilio("Caseros",1323),23578393,LocalDate.of(1987,10,23),107,LocalDate.of(2010,2,1),"Administración")};
        for(int i=0;i<emp.length;i++){
            GestionEmpleados.addEmpleado(emp[i]);
        }        
        assertArrayEquals(emp,GestionEmpleados.getEmpleados().toArray());     
    }
    
    @Test
    public void obtenerArraySoloJefesTest() {
        Empleado[] emp = {new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Producción")
         ,new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f)
        ,new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2))
        , new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15))
        , new Operario("Sergio","Moreno",'M',new Domicilio("San Martín",454),24653293,LocalDate.of(1982,9,23),104,LocalDate.of(2013,3,12))
        , new Administrativo("Cristina","Fernandez",'F',new Domicilio("Junín",267),22578393,LocalDate.of(1982,10,23),105,LocalDate.of(2010,8,11))
        , new Jefe("Florencia","Sosa",'F',new Domicilio("Salta",570),30578393,LocalDate.of(1990,10,23),106,LocalDate.of(2012,3,14),"Dirección")
        , new Jefe("Gonzalo","Ibañez",'M',new Domicilio("Caseros",1323),23578393,LocalDate.of(1987,10,23),107,LocalDate.of(2010,2,1),"Administración")};
        for(int i=0;i<emp.length;i++){
            GestionEmpleados.addEmpleado(emp[i]);
        }  
        Empleado[] jefes={emp[0],emp[6],emp[7]};
        
        assertArrayEquals(jefes,GestionEmpleados.obtenerNuevoArrayJefes().toArray());     
    }
    
    @Test
    public void obtenerArraySoloAdministrativosYOperariosTest() {
        Empleado[] emp = {new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Producción")
         ,new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f)
        ,new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2))
        , new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15))
        , new Operario("Sergio","Moreno",'M',new Domicilio("San Martín",454),24653293,LocalDate.of(1982,9,23),104,LocalDate.of(2013,3,12))
        , new Administrativo("Cristina","Fernandez",'F',new Domicilio("Junín",267),22578393,LocalDate.of(1982,10,23),105,LocalDate.of(2010,8,11))
        , new Jefe("Florencia","Sosa",'F',new Domicilio("Salta",570),30578393,LocalDate.of(1990,10,23),106,LocalDate.of(2012,3,14),"Dirección")
        , new Jefe("Gonzalo","Ibañez",'M',new Domicilio("Caseros",1323),23578393,LocalDate.of(1987,10,23),107,LocalDate.of(2010,2,1),"Administración")};
        for(int i=0;i<emp.length;i++){
            GestionEmpleados.addEmpleado(emp[i]);
        }  
        Empleado[] operYAdmin={emp[2],emp[3],emp[4],emp[5]};
        
        assertArrayEquals(operYAdmin,GestionEmpleados.obtenerNuevoArrayOperadoresAdministradores().toArray());     
    }
    
    @Test
    public void comprobarQueExisteEmpleadoConNumeroDeLegajoTest(){
        Empleado[] emp = {new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Producción")
         ,new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f)
        ,new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2))
        , new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15))
        , new Operario("Sergio","Moreno",'M',new Domicilio("San Martín",454),24653293,LocalDate.of(1982,9,23),104,LocalDate.of(2013,3,12))
        , new Administrativo("Cristina","Fernandez",'F',new Domicilio("Junín",267),22578393,LocalDate.of(1982,10,23),105,LocalDate.of(2010,8,11))
        , new Jefe("Florencia","Sosa",'F',new Domicilio("Salta",570),30578393,LocalDate.of(1990,10,23),106,LocalDate.of(2012,3,14),"Dirección")
        , new Jefe("Gonzalo","Ibañez",'M',new Domicilio("Caseros",1323),23578393,LocalDate.of(1987,10,23),107,LocalDate.of(2010,2,1),"Administración")};
        for(int i=0;i<emp.length;i++){
            GestionEmpleados.addEmpleado(emp[i]);
        } 
        assertTrue(GestionEmpleados.existeEmpleadoConEsteLegajo(101));
    }
    
    @Test
    public void comprobarQueNoExisteEmpleadoConNumeroDeLegajoTest(){
        Empleado[] emp = {new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Producción")
         ,new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f)
        ,new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2))
        , new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15))
        , new Operario("Sergio","Moreno",'M',new Domicilio("San Martín",454),24653293,LocalDate.of(1982,9,23),104,LocalDate.of(2013,3,12))
        , new Administrativo("Cristina","Fernandez",'F',new Domicilio("Junín",267),22578393,LocalDate.of(1982,10,23),105,LocalDate.of(2010,8,11))
        , new Jefe("Florencia","Sosa",'F',new Domicilio("Salta",570),30578393,LocalDate.of(1990,10,23),106,LocalDate.of(2012,3,14),"Dirección")
        , new Jefe("Gonzalo","Ibañez",'M',new Domicilio("Caseros",1323),23578393,LocalDate.of(1987,10,23),107,LocalDate.of(2010,2,1),"Administración")};
        for(int i=0;i<emp.length;i++){
            GestionEmpleados.addEmpleado(emp[i]);
        } 
        assertFalse(GestionEmpleados.existeEmpleadoConEsteLegajo(99));
    }
    
    @Test
    public void obtenerEmpleadoExistenteConNumeroDeLegajoTest(){
        Empleado[] emp = {new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Producción")
         ,new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f)
        ,new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2))
        , new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15))
        , new Operario("Sergio","Moreno",'M',new Domicilio("San Martín",454),24653293,LocalDate.of(1982,9,23),104,LocalDate.of(2013,3,12))
        , new Administrativo("Cristina","Fernandez",'F',new Domicilio("Junín",267),22578393,LocalDate.of(1982,10,23),105,LocalDate.of(2010,8,11))
        , new Jefe("Florencia","Sosa",'F',new Domicilio("Salta",570),30578393,LocalDate.of(1990,10,23),106,LocalDate.of(2012,3,14),"Dirección")
        , new Jefe("Gonzalo","Ibañez",'M',new Domicilio("Caseros",1323),23578393,LocalDate.of(1987,10,23),107,LocalDate.of(2010,2,1),"Administración")};
        for(int i=0;i<emp.length;i++){
            GestionEmpleados.addEmpleado(emp[i]);
        } 
        assertEquals(emp[6],GestionEmpleados.getEmpleadoConEsteLegajo(106));
    }
    
    @Test
    public void obtenerEmpleadoNoExistenteConNumeroDeLegajoTest(){
        Empleado[] emp = {new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Producción")
         ,new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f)
        ,new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2))
        , new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15))
        , new Operario("Sergio","Moreno",'M',new Domicilio("San Martín",454),24653293,LocalDate.of(1982,9,23),104,LocalDate.of(2013,3,12))
        , new Administrativo("Cristina","Fernandez",'F',new Domicilio("Junín",267),22578393,LocalDate.of(1982,10,23),105,LocalDate.of(2010,8,11))
        , new Jefe("Florencia","Sosa",'F',new Domicilio("Salta",570),30578393,LocalDate.of(1990,10,23),106,LocalDate.of(2012,3,14),"Dirección")
        , new Jefe("Gonzalo","Ibañez",'M',new Domicilio("Caseros",1323),23578393,LocalDate.of(1987,10,23),107,LocalDate.of(2010,2,1),"Administración")};
        for(int i=0;i<emp.length;i++){
            GestionEmpleados.addEmpleado(emp[i]);
        } 
        assertNull(GestionEmpleados.getEmpleadoConEsteLegajo(110));
    }
    
     @Test
    public void obtenerPosicionDeEmpleadoTest(){
        Empleado[] emp = {new Jefe("Juan","Perez",'M',new Domicilio("Belgrano",520),24503279,LocalDate.of(1990,10,4),100,LocalDate.of(2010,6,20),"Producción")
         ,new Vendedor("José","Carlos",'M',new Domicilio("Maipu",120),24503291,LocalDate.of(1990,10,4),101,LocalDate.of(2006,10,4),2,3.4f)
        ,new Operario("Cristobal","Lopez",'M',new Domicilio("Sarmiento",1077),2563492,LocalDate.of(1982,3,7),102,LocalDate.of(2012,3,2))
        , new Administrativo("Marcelo","Fuentes",'M',new Domicilio("Rivadavia",44),24573293,LocalDate.of(1982,6,23),103,LocalDate.of(2012,4,15))
        , new Operario("Sergio","Moreno",'M',new Domicilio("San Martín",454),24653293,LocalDate.of(1982,9,23),104,LocalDate.of(2013,3,12))
        , new Administrativo("Cristina","Fernandez",'F',new Domicilio("Junín",267),22578393,LocalDate.of(1982,10,23),105,LocalDate.of(2010,8,11))
        , new Jefe("Florencia","Sosa",'F',new Domicilio("Salta",570),30578393,LocalDate.of(1990,10,23),106,LocalDate.of(2012,3,14),"Dirección")
        , new Jefe("Gonzalo","Ibañez",'M',new Domicilio("Caseros",1323),23578393,LocalDate.of(1987,10,23),107,LocalDate.of(2010,2,1),"Administración")};
        for(int i=0;i<emp.length;i++){
            GestionEmpleados.addEmpleado(emp[i]);
        } 
        assertEquals(1,GestionEmpleados.getPosicionEmpleadoConEsteLegajo(101));
    }
    
    @Test (expected = TipoEmpleadoNoValidoException.class)
    public void instanciarNuevoEmpleadoSiendoEsteNoValidoTest() throws TipoEmpleadoNoValidoException{
            GestionEmpleados.instanciarNuevoEmpleado("Mecanico");
            fail();
    }
    
    @Test 
    public void instanciarNuevoEmpleadoAdministrativoTest() throws TipoEmpleadoNoValidoException{
        Empleado emp = GestionEmpleados.instanciarNuevoEmpleado("Administrativo");
        assertTrue(emp instanceof Administrativo);
    }
    
    @Test 
    public void instanciarNuevoEmpleadoVendedorTest() throws TipoEmpleadoNoValidoException{
        Empleado emp = GestionEmpleados.instanciarNuevoEmpleado("Vendedor");
        assertTrue(emp instanceof Vendedor);
    }
    
    @Test 
    public void instanciarNuevoEmpleadoJefeTest() throws TipoEmpleadoNoValidoException{
        Empleado emp = GestionEmpleados.instanciarNuevoEmpleado("Jefe de Área");
        assertTrue(emp instanceof Jefe);
    }
    
    @Test 
    public void instanciarNuevoEmpleadoOperarioTest() throws TipoEmpleadoNoValidoException{
        Empleado emp = GestionEmpleados.instanciarNuevoEmpleado("Operario");
        assertTrue(emp instanceof Operario);
    }
    
}
