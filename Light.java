class Light{
	public static void main(String arg[]){
		int speed;
		long seconds;
		long days;
		long dist;
		//assign values
		speed=186000;
		days=Integer.parseInt(arg[0]);
		seconds=days*24*60*60;
		dist=speed*seconds;
		System.out.println("In "+days+" days light travels "+dist+" miles");
	}
}
