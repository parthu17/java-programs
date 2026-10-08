class Login_manager{
	static int logincounter;
	static{
		logincounter=0;
	}
	Login_manager(){
		logincounter++;
	}
	static void display_logincount(){
		System.out.println("No. of logins till now :"+logincounter);
	}
}
class Static_demo{
	public static void main(){
		Login_manager login1=new Login_manager();
		Login_manager login2=new Login_manager();
		Login_manager login3=new Login_manager();
		Login_manager login4=new Login_manager();
		Login_manager.display_logincount();
	}
}
