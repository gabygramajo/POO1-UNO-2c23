package ejerciciosDeRepaso;

public class Ejercicio5Fecha {
	
	public static String formatNumber(int num) {
		if(num < 10)
			return "0" + num;
		
		return "" + num;
	}
	
	public static String formatDate(int date) {
		int age = date / 10000;
		int month = (date % 10000) / 100;
		int day = (date % 10000) % 100;
		
		return formatNumber(day) + "/" + formatNumber(month) + "/" + age;
	}

	public static void main(String[] args) {
		int date = 20230803;
		System.out.println("date: " + formatDate(date));
	}

}
