import persegi.persegi;

public class testModifier extends persegi{

//	oop
	/*
	 * itu ada 3 konsep encapsulation, inharritance, polimorph
	 * polimorph terbagi menjadi 2 Overriding dan overloading
	 * 
	 */
	
	@Override
	public String getId() {
		// TODO Auto-generated method stub
		return ("Ini dari super tapi di overrride " + super.getId());
	}
//	public testModifier() {
//		// TODO Auto-generated constructor stub
//		this.id
//	}
	public static void main(String[] args) {
		
		System.out.println(new testModifier().getId());
		
		System.out.println(new persegi().getId());
	}
}
