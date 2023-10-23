package pilas_y_colas;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TerminalDeTeletipoTest {

	@Test
	void ejemplosTest() {
		TerminalDeTeletipo tl = new TerminalDeTeletipo();
		assertEquals("ae", tl.procesarTira("abc/d//e"));
		assertEquals("pe", tl.procesarTira("abc/d//e&pe"));
	}
	
	@Test
	void laTiraQuedaVaciaTest() {
		TerminalDeTeletipo tl = new TerminalDeTeletipo();
		assertEquals("ae", tl.procesarTira("///abc/d//e"));
	}
	
	@Test
	void comienzaConBarrasTest() {
		TerminalDeTeletipo tl = new TerminalDeTeletipo();
		assertEquals("ae", tl.procesarTira("///abc/d//e"));
	}

}
