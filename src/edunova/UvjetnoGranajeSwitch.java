package edunova;

public class UvjetnoGranajeSwitch {
	public static void main(String[] args) {
		int ocjena=12;
//		if(ocjena==1) {
//			System.err.println("Nedovoljan");
//		} else if (ocjena==2) {
//			System.out.println("Dovoljan");
//		} else if (ocjena==3){
//			System.out.println("Dobar");
//		} else if (ocjena==4) {
//			System.out.println("Vrlo dobar");
//		} else if (ocjena==5) {
//			System.out.println("Izvrstan");
//		} else {
//			System.out.println("nije ocjena");
//		}
		switch (ocjena) {
		case 1:
			System.out.println("Nedovoljan");
			break;
		case 2:
			System.out.println("Dovoljan");
			break;
		case 3:
			System.out.println("Dobar");
			break;
		case 4:
			System.out.println("VD");
			break;
		case 5:
			System.out.println("Izv");
			break;
		default:
			System.out.println("Nije ocjena");
		}
		
	
	}
	
}

