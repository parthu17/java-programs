class book{
	int bookid;
	String name;
	double price;
	Boolean isexist=true;
	book(int id,String bookname,double price){
		this.bookid=id;
		this.name=bookname;
		this.price=price;
	}
	void display(){
		System.out.println("Id: "+this.bookid+" name: "+this.name+" price  "+this.price+" present -"+this.isexist+"\n");
	}
};
class book_demo{
	public static void main(String args[]){
		book b1=new book(2234555,"XYZ",538.02d);
		b1.display();
		book b2=new book(2234556,"XYZ-2",602.34d);
		b2.display();
	}
}
