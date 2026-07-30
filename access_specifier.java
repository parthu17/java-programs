class user{
	public String social_handle;
	protected String name;
	private long phonenum;
	user(String handle,String name,long number){
		this.social_handle=handle;
		this.name=name;
		this.phonenum=number;
	}
	public long get_phno(){
		return phonenum;
	}
}
class person extends user{
	person(String handle,String name,long num){
	super(handle,name,num);
	}
	void showaccess(){
		System.out.println("Handle: "+social_handle);
		System.out.println("Name: "+name);
		System.out.println("phone number: "+get_phno());
	}
}
class access_specifier{
	public static void main(String args[]){
		person pr=new person("!random@handle","XYZ",5368424253L);
		System.out.println(pr.social_handle);
		System.out.println(pr.name);
		System.out.println(pr.get_phno());
		pr.showaccess();
	}
}

	
