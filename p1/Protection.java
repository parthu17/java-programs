package p1;
public class Protection{
	int n=10;
	private int n_prv=20;
	protected int n_pro=30;
	public int n_pub=40;
	public Protection(){
		System.out.println("base constructor");
		System.out.println("def:"+n);
		System.out.println("Protect"+n_pro);
		System.out.println("priv"+n_prv);
		System.out.println("pub"+n_pub);
	}
}
