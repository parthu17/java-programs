package p1;
public class Derived extends Protection{
	public Derived(){
		System.out.println("derived constructor");
		System.out.println("def:"+n);
		System.out.println("Protect"+n_pro);
		//System.out.println("priv"+n_prv);
		System.out.println("pub"+n_pub);
	}
}
