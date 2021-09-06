package p1.e2.e.romano;
import p1.e2.e.griego.*;

public class Delta extends Alpha {
	void unMetodoD(Alpha a, Delta d){
		// a.x=10;
		a.setX(10);
		d.setX(10);
		a.otroMetodoA();
		d.otroMetodoA();
	}
}