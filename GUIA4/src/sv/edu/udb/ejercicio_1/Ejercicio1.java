package sv.edu.udb.ejercicio_1;

import javax.swing.JOptionPane;

public class Ejercicio1 { 
public static void main(String[] args) {
	
	
	
	double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Ingrese el radio de su circulo", "Obtener area de un circulo", 3));
	
	JOptionPane.showMessageDialog(null, "El area de su circulo es: "+ getarea(r));
}

public static double getarea (double r) {
	
	
	double area = (Math.PI)*Math.pow(r, 2) ;
	
	return area; 
	
}

}
