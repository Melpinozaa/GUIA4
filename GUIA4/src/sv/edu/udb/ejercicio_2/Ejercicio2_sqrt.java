package sv.edu.udb.ejercicio_2;

import javax.swing.JOptionPane;

public class Ejercicio2_sqrt {
public static void main(String[] args) {
	
	double r = Double.parseDouble(JOptionPane.showInputDialog(null, "Digite el numero al que desea sacar raiz cuadrada: ", "ROOT", 3));
	
	
	double getsqrt = Math.sqrt(r);
	
	JOptionPane.showMessageDialog(null, "la Raiz cuadrada de su numero es: "+ getsqrt, "sqrt" ,1);
	
	
}
}
