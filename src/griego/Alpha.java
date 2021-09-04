package griego;
class Alpha {
	protected int x;
	protected void otroMetodoA(){
		System.out.println("Un método protegido");
	}
}

class Gamma {
	void unMétodoG(){
		Alpha a = new Alpha();
		a.x=10;
		a.otroMetodoA();
	}
}