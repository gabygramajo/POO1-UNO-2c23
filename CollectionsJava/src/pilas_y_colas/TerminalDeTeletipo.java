package pilas_y_colas;

import java.util.Stack;
//https://docs.oracle.com/en/java/javase/17/docs/api/java.base/java/util/Stack.html


/*
En una terminal de teletipo existe un carácter de retroceso que permite cancelar el último carácter. 
Por ejemplo: si el carácter de retroceso es /, entonces la línea abc/d//e será interpretada como ae. 
Existe también un carácter anulador que elimina todos los caracteres ingresados hasta el momento, suponga que ese carácter es &. 
Realice un método que dado una tira de caracteres (string), ejecute las operaciones indicadas si se encuentra con el carácter / o el &. 
Debe por último retornar la tira resultante.
*/

public class TerminalDeTeletipo {
	
	private Stack<Character> teletipo = new Stack<Character>();
	
	public String procesarTira(String tira) {
		
		for (int i = 0; i < tira.length(); i++) {
			if (tira.charAt(i) == '&') {
				teletipo.clear();
			} else {

				if (tira.charAt(i) != '/')
					teletipo.push(tira.charAt(i));

				if (tira.charAt(i) == '/' && !teletipo.empty()) 
					teletipo.pop();
				
			}
		}
		
		String nuevaTira = "";
		while (!teletipo.empty()) {
			nuevaTira = teletipo.pop() + nuevaTira;
		}
		
		return nuevaTira;
	}

}
