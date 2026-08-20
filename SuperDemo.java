class Animal{
	int x=100;
	Animal(){
		System.out.println("Animal constructor");
	}
	public void sound(){
		System.out.println("Animal makes sound");
	}
	
}
class Dog extends Animal{
	int x=200;
	Dog(){
		super();
	}
	void Demo(){
		System.out.println("Super "+super.x);
		System.out.println("Child "+this.x);
		super.sound();
		this.sound();
	}
	
	public void sound(){
		System.out.println("Dog makes sound");
	}
}
class SuperDemo{
	public static void main(String args[]){
		Dog d = new Dog();
		d.Demo();

	}
}
