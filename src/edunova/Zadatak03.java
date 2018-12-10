package edunova;

import javax.swing.JOptionPane;

public class Zadatak03 {
public static void main(String[] args) {
	int i=Integer.parseInt(JOptionPane.showInputDialog("Unesi 1 broj"));
	int j=Integer.parseInt(JOptionPane.showInputDialog("Unesi 2 broj"));
	
	if(i==j) {
		System.out.println("Jednaki");
	} else if (i>j) {
		System.out.println("prvi");
	} else {
		System.out.println("drugi");
	}
	}
}
