package edunova;

import javax.swing.JOptionPane;

public class Zadatak05 {
	public static void main(String[] args) {
		int a=Integer.parseInt(JOptionPane.showInputDialog("Unesi 1 broj"));
		int b=Integer.parseInt(JOptionPane.showInputDialog("Unesi 2 broj"));
		int c=Integer.parseInt(JOptionPane.showInputDialog("Unesi 3 broj"));
		int d=Integer.parseInt(JOptionPane.showInputDialog("Unesi 3 broj"));
		
		if(a==d) {
			System.out.println(b+c);
			return;
		} 
		

	}
}
