import java.util.Iterator;
import java.util.Scanner;

public class Main {

	Scanner sc = new Scanner(System.in);
//	String a;
	int panjang, lebar;
	int luas = 0;
	
	public void initPersegi() {
		System.out.println("masukan panjang persegi");
		panjang = sc.nextInt(); sc.nextLine();
		System.out.println("masukan lebar persegi");
		lebar = sc.nextInt(); sc.nextLine();
		
		for (int j = 0; j < panjang; j++) {
			for (int j2 = 0; j2 < lebar; j2++) {
				System.out.print("#");
			}
			System.out.println();
		}
		System.out.println("press Enter to continue");
		sc.nextLine();
		
	}
	
	public void menu() {
		
		int i = 0;
		System.out.println("Welcome to this program");
		System.out.println("1. Init persegi");
		System.out.println("2. Cari Luas persegi");
		System.out.println("3. history inisialisasi");
		System.out.println("4. Exit");
		System.out.print("Choose >> ");
		i = sc.nextInt(); sc.nextLine();
		
			switch (i) {
			case 1: {
				initPersegi();
				menu();
				break;
			}
			
			case 2: {
				if (panjang > 0 && lebar > 0) {
					luas = panjang * lebar;
					System.out.println("luas dari persegi adalah " + luas);
					System.out.println("Press enter key to continue");
					sc.nextLine();
				} else {
					System.out.println("Please Init persegi dlu");
					sc.nextLine();
				}
				menu();
				break;
			} 
			
			case 3: {
				System.out.println("Menu history segera datang");
				menu();
				break;
			}
			
			case 4: {
				System.out.println("Terima kasih!!");
				System.exit(0);
				break;
			}
			default:
				System.out.println("Tolong masukan angka diantara 1 - 4");
				menu();
			}
	}
	public Main() {
		// TODO Auto-generated constructor stub	
		menu();
	}
	

	
	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Main();
	}

}
