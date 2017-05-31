/** 
 * Proyecto: Juego de la vida.
 * @since: prototipo1.2
 * @source: FechaTest.java 
 * @version: 2.1 - 2017.05.05
 * @author: Fran
 * @author: Grupo 3
 */
import static org.junit.Assert.*;

import java.util.Date;
import java.util.GregorianCalendar;

import org.junit.*;

public class FechaTest {
	private Fecha fecha1; 
	private Fecha fecha2 = new Fecha(2000, 02, 20);
	private Fecha fecha3 = new Fecha(2000, 02, 20, 15, 10, 5);

	/**
	 * Método que se ejecuta antes de cada @Test para preparar datos de prueba.
	 */
	@Before
	public void crearDatosPrueba() {
		// Objetos para la prueba.
		fecha1 = new Fecha(); 
	}

	/**
	 * Método que se ejecuta después de cada @Test para limpiar datos de prueba.
	 */
	@After	
	public void borrarDatosPrueba() throws ModeloException{
		fecha1 = null;

	}

	// Test CON DATOS VALIDOS
	@Test
	public void testFechaParcial()throws ModeloException {
		assertNotNull(fecha2);
		assertEquals(fecha2.getAño(), 2000);
		assertEquals(fecha2.getMes(), 2);
		assertEquals(fecha2.getDia(), 20);
	}

	@Test
	public void testFechaConvencional()throws ModeloException {
		assertNotNull(fecha3);
		assertEquals(fecha3.getAño(), 2000);
		assertEquals(fecha3.getMes(), 2);
		assertEquals(fecha3.getDia(), 20);
		assertEquals(fecha3.getHora(), 15);
		assertEquals(fecha3.getMinuto(), 10);
		assertEquals(fecha3.getSegundo(), 5);
	}

	@Test
	public void testFechaDefecto()throws ModeloException {
		assertNotNull(fecha2);
	}

	@Test
	public void testFechaCopia()throws ModeloException {
		fecha1 = new Fecha(fecha2);
		assertNotSame(fecha1, fecha2);
	}

	@Test
	public void testGetAño()throws ModeloException {
		assertEquals(fecha2.getAño(), 2000);
	}

	@Test
	public void testGetMes()throws ModeloException {
		assertEquals(fecha2.getMes(), 2);
	}

	@Test
	public void testGetDia()throws ModeloException {
		assertEquals(fecha2.getDia(), 20);
	}

	@Test
	public void testGetHora()throws ModeloException {
		assertEquals(fecha3.getHora(), 15);
	}

	@Test
	public void testGetMinuto()throws ModeloException {
		assertEquals(fecha3.getMinuto(), 10);
	}

	@Test
	public void testGetSegundo()throws ModeloException {
		assertEquals(fecha3.getSegundo(), 5);
	}

	@Test
	public void testSetAño()throws ModeloException {
		fecha1.setAño(2000);
		assertEquals(fecha1.getAño(), 2000);
	}

	@Test
	public void testSetMes()throws ModeloException {
		fecha1.setMes(2);
		assertEquals(fecha1.getMes(), 2);
	}

	@Test
	public void testSetDia()throws ModeloException {
		fecha1.setDia(20);
		assertEquals(fecha1.getDia(), 20);
	}

	@Test
	public void testSetHora()throws ModeloException {
		fecha1.setHora(15);
		assertEquals(fecha1.getHora(), 15);
	}

	@Test
	public void testSetMinuto()throws ModeloException {
		fecha1.setMinuto(10);
		assertEquals(fecha1.getMinuto(), 10);
	}

	@Test
	public void testSetSegundo()throws ModeloException {
		fecha1.setSegundo(5);
		assertEquals(fecha1.getSegundo(), 5);
	}

	@Test
	public void testDifSegundos()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		assertEquals(fecha.difSegundos(fecha2), 86400);
	}

	@Test
	public void testDifMinutos()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		assertEquals(fecha.difMinutos(fecha2), 86400/60);
	}

	@Test
	public void testDifHoras()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		assertEquals(fecha.difHoras(fecha2), 24);
	}

	@Test
	public void testDifDias()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		assertEquals(fecha.difDias(fecha2), 1);
	}

	@Test
	public void testDifSemanas()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 27);
		assertEquals(fecha.difSemanas(fecha2), 1);
	}

	@Test
	public void testDifMeses()throws ModeloException {
		Fecha fecha = new Fecha(2000, 03, 20);
		assertEquals(fecha.difMeses(fecha2), 1);
	}

	@Test
	public void testDifAños()throws ModeloException {
		Fecha fecha = new Fecha(2001, 02, 20);
		assertEquals(fecha.difAños(fecha2), 1);
	}

	@Test
	public void testAddSegundos()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		fecha.addSegundos(86400);
		assertEquals(fecha.getDia(), 20);
	}

	@Test
	public void testAddMinutos()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		fecha.addMinutos(86400/60);
		assertEquals(fecha.getDia(), 20);
	}

	@Test
	public void testAddHoras()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		fecha.addHoras(24);
		assertEquals(fecha.getDia(), 20);
	}

	@Test
	public void testAddDias()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		fecha.addDias(1);
		assertEquals(fecha.getDia(), 20);
	}

	@Test
	public void testAddSemanas()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		fecha.addSemanas(4);
		assertEquals(fecha.getMes(), 3);
	}

	@Test
	public void testAddMeses()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		fecha.addMeses(1);
		assertEquals(fecha.getMes(), 3);
	}

	@Test
	public void testAddAños()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 19);
		fecha.addAños(1);
		assertEquals(fecha.getAño(), 2001);
	}

	@Test
	public void testToDate()throws ModeloException {
		Date hoy = fecha1.toDate();
		assertNotNull(hoy);
	}

	@Test
	public void testToGregorianCalendar()throws ModeloException {
		GregorianCalendar hoy = fecha1.toGregorianCalendar();
		assertNotNull(hoy);
	}

	@Test
	public void testCompareTo()throws ModeloException {
		Fecha fecha = new Fecha(2000, 02, 21);
		assertTrue(fecha2.compareTo(fecha2) == 0);
		assertTrue(fecha.compareTo(fecha2) > 0);
		assertTrue(fecha2.compareTo(fecha) < 0);
	}

	@Test
	public void testToString()throws ModeloException {
		System.out.println(fecha3);
		assertEquals(fecha3.toString(), "2000.2.20 15:10:5");
	}

	@Test
	public void testEquals()throws ModeloException {
		fecha1 = new Fecha(2000, 02, 20);
		assertTrue(fecha1.equals(fecha2));
	}

	@Test
	public void testClone()throws ModeloException{
		fecha1 = (Fecha) fecha2.clone();
		assertNotSame(fecha1, fecha2);
	}

	@Test
	public void testHashCode()throws ModeloException {
		assertEquals(fecha2.hashCode(), -40233105);
	}
} //class
