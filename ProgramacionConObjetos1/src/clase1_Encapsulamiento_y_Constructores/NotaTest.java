package clase1_Encapsulamiento_y_Constructores;

import static org.junit.Assert.*;

import org.junit.Test;

public class NotaTest {

	@Test
	public void InicializacionTest() {
		Nota n1 = new Nota(4);
		// Chequea que el obj no sea nulo
		assertNotNull(n1);
	}
	
	@Test 
	public void ObtenerValorTest() {
		Nota n1 = new Nota(4);
		int valorEsperado = 4;
		int valorObtenido = n1.obtenerValor();
		
		assertEquals(valorEsperado, valorObtenido);	
	}
	
	@Test
	public void aprobado4Test() {
		Nota notaAprobado = new Nota(4);
		assertTrue(notaAprobado.aprobado());
	}
	
	@Test
	public void aprobadoTest() {
		for (int valorNota = 4; valorNota <= 10; valorNota++) {			
			Nota notaAprobado = new Nota(valorNota);
			assertTrue(notaAprobado.aprobado());
		}
	}

	@Test 
	public void desaprobado3Test() {
		Nota notaDesaprobado = new Nota(3);
		assertTrue(notaDesaprobado.desaprobado());
	}
	
	@Test
	public void desaprobadoTest() {
		for (int valorNota = 0; valorNota <= 3; valorNota++) {			
			Nota notaAprobado = new Nota(valorNota);
			assertTrue(notaAprobado.desaprobado());
		}
	}
	
	@Test
	public void recuperaYSubeNotaTest() {
		Nota nParcial1 = new Nota(2);
		assertTrue(nParcial1.desaprobado());
		nParcial1.recuperar(8);
		
		assertEquals(8, nParcial1.obtenerValor());
		assertTrue(nParcial1.aprobado());
	}
	
	@Test
	public void recuperaYNoSubeNotaTest() {
		Nota nParcial1 = new Nota(5);
		nParcial1.recuperar(4);
		
		assertEquals(5, nParcial1.obtenerValor());
		assertTrue(nParcial1.aprobado());
	}
	
//	Indicamos que esperamos un error
	@Test(expected = Error.class)
	public void valorIncorrectoTest() {
		Nota n = new Nota(11);
	}
	
	
}
