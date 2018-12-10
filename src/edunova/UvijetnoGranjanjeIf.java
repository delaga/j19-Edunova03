package edunova;

import java.util.Scanner;

public class UvijetnoGranjanjeIf {
		public static void main(String[] args) {
			Scanner ulaz = new Scanner(System.in);
			
			System.out.println("Unesi cijeli broj");
			int i = ulaz.nextInt();
			
			System.out.println(i>10);
			
			if(i>10)  {
				System.out.println("OK");
			}	
			
			if(i>10) {
				System.out.println("ok");
			} else {
				System.out.println("nije ok");
			}
			//System.out.println(i);
			
			System.out.println(i>10 ? "ok": "Nije dobro");
			
			
			if(i>10 & i<15) {
				System.out.println("OK");
			
			}
			
			if(i>10 && i<15) {
				System.out.println("OK");
			
			}
			
			if(provjeriStanje() & logiraj()) {
				
				System.out.println("ok");
			}
			
			if(i>10 || i<5) {
				System.out.println("ok");
			}
			
			
			if(i==10) {
				System.out.println();
			}
			
			if(i==2) {
				System.out.println("Dovoljan");
			} else if (i==3){
				System.out.println("Dobar");
			} else {
				System.out.println("Nije dobro");
			}
			
			ulaz.close();
		}

		private static boolean logiraj() {
			System.out.println("Logiram");
			return false;
		}

		private static boolean provjeriStanje() {
			System.out.println("Provjeravam stanje");
			return false;
		}
}
