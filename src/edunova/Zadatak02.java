package edunova;

import javax.swing.JOptionPane;

public class Zadatak02 {
	public static void main(String[] args) {
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi broj"));
		
		System.out.println("Broj je "+ (i%2==0 ? "paran" : "neparan"));
		
	}
	
	

}
