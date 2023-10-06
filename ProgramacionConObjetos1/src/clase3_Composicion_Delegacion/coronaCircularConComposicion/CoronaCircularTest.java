package clase3_Composicion_Delegacion.coronaCircularConComposicion;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

import clase3_Composicion_Delegacion.coronaCircularSinComposicion.CoronaCircular;

public class CoronaCircularTest {

	private CoronaCircular coronita;
	
	@Before
	public void setUp() throws Exception {
		coronita = new CoronaCircular(1, 2);
	}

	@Test
	public void coronaTest() {
		assertEquals(1, coronita.getRadioInterior(), 0.001);
		assertEquals(2, coronita.getRadioExterior(), 0.001);
		assertEquals(9.4247, coronita.getSuperficie(), 0.001);
		assertEquals(18.8495, coronita.getPerimetro(), 0.001);
	}
	
	@Test(expected = Error.class)
	public void radioInteriorNegativoTest() {
		coronita = new CoronaCircular(-4, 6);
	}
	
	@Test(expected = Error.class)
	public void radioExteriorNegativoTest() {
		coronita = new CoronaCircular(-4, -5);
	}
	
	@Test(expected = Error.class)
	public void radioEXteriorCeroTest() {
		coronita = new CoronaCircular(1, 0);
	}
	
	@Test(expected = Error.class)
	public void radioInteriorCeroTest() {
		coronita = new CoronaCircular(0, 6);
	}
	
	@Test(expected = Error.class)
	public void radioInteriorMayorRadioExteriorTest() {
		coronita = new CoronaCircular(6, 5);
	}
	
}
