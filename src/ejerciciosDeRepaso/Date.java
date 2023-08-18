package ejerciciosDeRepaso;

// Ejercicio 5 de  Fecha Con Constructor
public class Date {

	int date;
	
	// El constructo del objeto, el cual sirve para crear instancias de él.
	public Date(int d) {
		date = d;
		// recibimos por parámetro el valor de la fecha y lo asignamos a la variable privada del objeto
	}
	
	int showDay() {
		return date % 100;
	}
	
	int showMonth() {
		return (date / 1000) % 100;
	}

	int showAge() {
		return date / 1000;
	}


	// método del objeto
	public String showDate() {
		
		return ("dia " + showDay() + ", mes " + showMonth() + ", año " + showAge());
	}
	
	
	public static void main(String[] args) {
		Date today = new Date(20220813);
		
		System.out.println(today.showDate());
		// alt+shift+r para refactor de nombre
		
		System.out.println("Day: " + today.showDay());
		System.out.println("Month: " + today.showMonth());
		System.out.println("Age: " + today.showAge());
	}

}
