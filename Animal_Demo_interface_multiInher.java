interface Animal{
	public void sound();
}
interface Canine{
	public void barks();
}
class Dog implements Animal,Canine{
	public void sound(){
		System.out.println("Dog makes sound");
	}
	public void barks(){
		System.out.println("Dog Barks");
	}
	void eats(){
		System.out.println("Dog eats");
	}
}
class Animal_Demo{
	public static void main(String args[]){
		Dog d=new Dog();
		d.sound();
		d.barks();
		d.eats();
	}
}

	
