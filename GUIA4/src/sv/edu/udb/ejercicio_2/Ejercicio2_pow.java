package sv.edu.udb.ejercicio_2;

import javax.swing.JOptionPane;

public class Ejercicio2_pow {
public static void main(String[] args) {
	
	int n = Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese el numero que desea elevar: "));
	int pow= Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese a que potencia desea elevar su numero: "));
	
	int getpow = (int) Math.pow(n, pow);
	
	JOptionPane.showMessageDialog(null, "La elavacion de el numero "+ n + "es" + getpow + " elevado a la: " + pow + " potencia");
	
}
}
