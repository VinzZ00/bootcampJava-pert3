package persegi;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.function.Consumer;

public class persegi {
	// access modifier itu ada public, protected, default, private
	
	private String id = "Testing 2 iini dari persegi";
	
	public String getId() {
		return this.id;
	}
//	[] ini adalah array
	
//	String[] siswa = new String[3];
//	String nama = "";
//	String[] siswa;
	String[] siswa = {"clarissa alverina", "muhammad rafif alhakim", "fabian"};
	
	ArrayList<String> contoh = new ArrayList<>();
	
	ArrayList<String> dSiswa;
	
	public void arraydinamis() {
		contoh.add("Elvin");
		contoh.add("Andi");
		contoh.add("budi");
		dSiswa = new ArrayList<>(contoh);
		
		System.out.println(dSiswa.size());
		
		for (int i = 0; i < contoh.size(); i++) {
			System.out.println(contoh.get(i));
		}
//		for (int i = 0; i < 10; i++) {			
			System.out.println();
//		}
		
		System.out.println(dSiswa.get(0));
		dSiswa.set(0, "fabian Putera Djaja");
		
		System.out.println();
		
		dSiswa.sort(null);
		
		HashMap<String, String> juaraLomba = new HashMap<>();
		
		juaraLomba.put("Juara 1", "Elvin");
		juaraLomba.put("Juara 2", "Theresia");
		juaraLomba.put("Juara 3", "Fabian");
		LinkedList<String> nama = new LinkedList<>();
//		nama.add
		dSiswa.forEach(c -> {
			System.out.println("ini adalah " + c);
		});
		
		System.out.println("Juara pertama adalah " + juaraLomba.get("Juara 1"));
		
		System.out.println();
		
		
		for (String string : dSiswa) {
			
			System.out.println(string);
		}
		
		
		
		dSiswa.remove(2);
		
		System.out.println(dSiswa.size());
		
		for (String string : dSiswa) {
			System.out.println(string);
		}
	}
	
//	HashMap<String, String>
	public void displayStaticArr() {
		for (String string : siswa) {
			System.out.println(string);
		}
		for (int i = 0; i < siswa.length; i++) {
			System.out.println(siswa[i]);
		}
	}
	
	public void ubahstaticarry() {
		System.out.println(siswa[0]);
		siswa[0] = "Kevin sanadi";
		System.out.println(siswa[0]);
	}
	
	public persegi() {
//		ubahstaticarry();
//		arraydinamis();
		// TODO Auto-generated constructor stub
//		System.out.println(siswa);
//		String b = nama + "elvin";
//		System.out.println("ini default dari nama " + nama);
	}
	
	public static void main(String[] args) {
		new persegi();
	}
}
