package p1.e2.c.romano;
import p1.e2.c.griego.*;

class Beta {
	void unMetodoB(){
		Alpha a=new Alpha();
		// Accedo por un setter
		// a.x=10;
		a.setX(10);
		a.unMetodoA();
	}
}