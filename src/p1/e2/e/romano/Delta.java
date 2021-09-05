package p1.e2.e.romano;
import p1.e2.e.griego.*;

public class Delta extends Alpha {
	void unMetodoD(Alpha a, Delta d){
		a.x=10;
		d.x=10;
		a.otroMetodoA();
		d.otroMetodoA();
	}
}