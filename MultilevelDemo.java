interface Animal{
	public void sound();
}
class Dog implements Animal{
	public void sound(){
		System.out.println("Animal makes sound");
	}
	void bark(){
		System.out.println("Dog barks");
	}
}
class puppy extends Dog{
	void weeps(){
		System.out.println("puppy weeps");
	}
}
class MultilevelDemo{
	public static void main(String args[]){
		puppy p=new puppy();
		p.sound();
		p.bark();
		p.weeps();
	}
}
