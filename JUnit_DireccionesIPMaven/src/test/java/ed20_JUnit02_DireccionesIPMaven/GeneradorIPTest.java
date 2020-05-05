package ed20_JUnit02_DireccionesIPMaven;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import ed20_JUnit02_DireccionesIP.GeneradorIP;
import junit.extensions.ActiveTestSuite;
import junit.extensions.RepeatedTest;
import junit.framework.TestCase;
import junit.framework.TestSuite; 

class GeneradorIPTest extends TestCase {

	public GeneradorIPTest(String testMethodNAme) {
		super(testMethodNAme);
	}
	GeneradorIP generador = new GeneradorIP();
	int min = 0;
	int max = 255;

	@BeforeEach
	protected
	void setUp() throws Exception {
		generador = new GeneradorIP();
	}

	@AfterEach
	protected
	void tearDown() throws Exception {
	}

	@Test
	void testGenerarNumero() {
		int num = generador.generarNumero(min, max);
		assertTrue("El numero es mayor o igual a 0",num >= min);

		assertTrue("El numero es menor a 255",num < max);
	}

	@Test
	void testGenerarIP() {
		String Ip =generador.generarIP();
		assertFalse("Empieza por 0",Ip.startsWith("0"));
	}

	@Test
	public static TestSuite suite() {
		
		//Repetir X veces, no me funciona bien.
		TestSuite mySuite = new ActiveTestSuite();
		//mySuite.addTest(new RepeatedTest(new GeneradorIP(),10));
		return null;
		
		
		
	}
}
