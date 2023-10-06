package clase2_Referencias_Arrrays;

import static org.junit.Assert.*;

import org.junit.Test;

public class CirculoTest {

	@Test
	public void creaCirculoParametrizadoTest() {
		Circulo c = new Circulo(2);
		assertNotNull(c);
	}
	@Test
	public void creaCirculoPorDefectoTest() {
		Circulo c = new Circulo();
		assertNotNull(c);
	}
	@Test
	public void creaCirculoParametrizadoYpidoRadioTest() {
		Circulo c = new Circulo(2);
		assertEquals(2, c.getRadio(), 0.001);
	}
	@Test
	public void referenciasIgualesTest() {
		Circulo c1 = new Circulo();
		Circulo c2 = c1;
		
		assertTrue(c2 == c1);
		assertTrue(c1.equals(c2));		
	}
	@Test
	public void referenciasDistintasTest() {
		Circulo c1 = new Circulo();
		Circulo c2 = new Circulo();
		
//		Dede dar falso xq estan en diferente memoria en stack
		assertFalse(c2 == c1);
//		Pero su valor en el Heap es igual
		assertTrue(c1.equals(c2));		
	}
	@Test(expected=Error.class) 
	public void radioInvalidoTest(){
		Circulo c = new Circulo(-2);
	}
}
