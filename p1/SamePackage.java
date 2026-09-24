package p1;
class SamePackage{
	public SamePackage(){
		Protection p=new Protection();
		System.out.println("Same Package class");
		System.out.println("def:"+p.n);
		System.out.println("Protect"+p.n_pro);
		System.out.println("pub"+p.n_pub);
		//System.out.println("priv"+p.n_prv);					
	}
}
