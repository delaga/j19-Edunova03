package edunova;

import javax.swing.JOptionPane;

public class Zadatak04 {
	public static void main(String[] args) {
		int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi 1 broj"));
		int j=Integer.parseInt(JOptionPane.showInputDialog("Unesi 2 broj"));
		int k=Integer.parseInt(JOptionPane.showInputDialog("Unesi 3 broj"));
		
		if(i>j && i>k) {
			System.out.println("1 je naj");
		} else if (j> i && j>k) {
			System.out.println("2 je naj");
		} else if (k>i && k> j) {
			System.out.println("3 je naj");
		} else if (i==j && j==k) {
			System.out.println("jedanki");
		} 
	}
}
