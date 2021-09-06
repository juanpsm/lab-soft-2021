package p1.e2.d.romano;
import p1.e2.c.griego.*;

class Beta extends Alpha{
	void unMetodoB(){
		Alpha a=new Alpha();
		a.setX(10);
		a.unMetodoA();
	}
}