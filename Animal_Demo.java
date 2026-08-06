interface Animal{
	public void sound();
}
class Dog implements Animal{
	public void sound(){
		System.out.println("Dog makes sound");
	}
	void barks(){
		System.out.println("Dog Barks");
	}
}
class Animal_Demo{
	public static void main(String args[]){
		Dog d=new Dog();
		d.sound();
		d.barks();
	}
}

	
