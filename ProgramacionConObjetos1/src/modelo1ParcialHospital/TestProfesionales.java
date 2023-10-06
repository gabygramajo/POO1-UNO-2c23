package modelo1ParcialHospital;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestProfesionales {

	@Test
	public void HonorarioBasicoTest() {
		Medico m = new Medico("Juan", "Rojas");
		assertEquals(500000, m.getHonorarioMensual(), 0.01);
		
		Dentista d = new Dentista("Juan", "Rojas");
		assertEquals(500000, d.getHonorarioMensual(), 0.01);
	}
	
	@Test
	public void honorarioMensualTest() {
		Cirujano m = new Cirujano("Juan", "Rojas");
		assertEquals(625000, m.getHonorarioMensual(), 0.01);
		
		CirujanoCardiovascular cc = new CirujanoCardiovascular("Juan", "Rojas");
		assertEquals(781250, cc.getHonorarioMensual(), 0.01);
	
		Endodoncista ed = new Endodoncista("Juan", "Rojas");
		assertEquals(625000, ed.getHonorarioMensual(), 0.01);
	}

	@Test
	public void hospitalNotNullTest() {
		Hospital h = new Hospital();
		assertNotNull(h);
	}
	
	@Test
	public void hospitalHonorarioTotalTest() {
		Hospital h = new Hospital();
		h.agregarProfesional(new Medico("Juan", "Rojas"));
		h.agregarProfesional(new Dentista("Lucas", "Gonzales"));
		h.agregarProfesional(new Cirujano("Adriana", "Amani"));
		assertEquals(1625000, h.honorarioTotal(), 0.01);
	}
	
	@Test
	public void hospitalListarProfesionalesTest() {
		Hospital h = new Hospital();
		h.agregarProfesional(new Medico("Juan", "Rojas"));
		h.agregarProfesional(new Cirujano("Adriana", "Amani"));
		h.agregarProfesional(new CirujanoCardiovascular("Emma", "Gomez"));
		h.agregarProfesional(new Dentista("Lucas", "Gonzales"));
		h.agregarProfesional(new Endodoncista("Miguel", "Luhanes"));
		
//		h.listarProfesionales();
	}
	@Test
	public void hospitalHonorarioTotal2Test() {
		Hospital h = new Hospital();
		h.agregarProfesional(new Medico("Juan", "Rojas"));
		h.agregarProfesional(new Cirujano("Adriana", "Amani"));
		h.agregarProfesional(new CirujanoCardiovascular("Emma", "Gomez"));
		h.agregarProfesional(new Dentista("Lucas", "Gonzales"));
		h.agregarProfesional(new Endodoncista("Miguel", "Luhanes"));
		
//		System.out.println(h.honorarioTotal());
	}
	
	@Test
	public void Test() {
		Hospital h = new Hospital();
		h.agregarProfesional(new Medico("Juan", "Rojas"));
		h.agregarProfesional(new Cirujano("Adriana", "Amani"));
		h.agregarProfesional(new CirujanoCardiovascular("Emma", "Gomez"));
		h.agregarProfesional(new Dentista("Lucas", "Gonzales"));
		h.agregarProfesional(new Endodoncista("Miguel", "Luhanes"));
		
		h.listarProfesionales();
	}
	
}
