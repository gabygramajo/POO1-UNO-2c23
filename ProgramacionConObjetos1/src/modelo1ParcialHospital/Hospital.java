package modelo1ParcialHospital;

import java.util.ArrayList;
import java.util.Collections;

public class Hospital {
	private ArrayList<Profesional> profesionales;
	
	public Hospital() {
		this.profesionales = new ArrayList<>();
	}
	
	public ArrayList<Profesional> getProfesionales() {
		return profesionales;
	}

	public void agregarProfesional(Profesional p) {
		this.profesionales.add(p);
	}
	
	public double honorarioTotal() {
		double total = 0;
		
		for (Profesional p : profesionales) {
			total += p.getHonorarioMensual();
		}
		
		return total;
	}
	
	public void listarProfesionales() {
		Collections.sort(profesionales);
		
		System.out.println("Nombre y Apellido \tHonorario Mensual");
		for (Profesional p : profesionales) {
			System.out.println(p.toString());
		}
	}	
}
