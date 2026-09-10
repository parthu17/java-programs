interface Animal{
	void sound();
}
class Dog implements Animal{
	public void sound(){
		System.out.println("Animal makes sound");
	}
	void barks(){
		System.out.println("Dog Barks");
	}
}
class puppy extends Dog{
	void weeps(){
		System.out.println("Puppy weeps");

	}
}
class Multilevel_Inheritence{
	public static void main(String args[]){
		puppy p = new puppy();
		p.sound();
		p.barks();
		p.weeps();
	}
}
	
