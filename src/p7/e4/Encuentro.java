package p7.e4;

class FutbolException extends Exception{}
class Falta extends FutbolException{}
class EquipoIncompleto extends FutbolException{}
class ClimaException extends Exception{}
class Lluvia extends ClimaException{}
class Mano extends Falta{}

class Partido {
	Partido() throws FutbolException{}
	void evento() throws FutbolException{}
	void jugada() throws EquipoIncompleto,Falta{}
	void penal(){}
}

interface Tormenta {
	void evento() throws Lluvia;
	void diluvio() throws Lluvia;
}

public class Encuentro extends Partido implements Tormenta {
	Encuentro() throws Lluvia, FutbolException {}
    Encuentro (String fecha) throws Falta, FutbolException {}

//	void penal() throws Mano{} //Exception Mano is not compatible with throws clause in Partido.penal()
    void penal(){}
//	public void evento() throws Lluvia{} // Exception Lluvia is not compatible with throws clause in Partido.evento()
	public void diluvio() throws Lluvia{}
	public void evento(){}
	void jugada() throws Mano{}
	public static void main (String[] args) {
		try {
			Encuentro enc = new Encuentro();
			enc.jugada();
		} catch(Mano e) {
		} catch(Lluvia e) {
		} catch(FutbolException e2) {
			// Cambie nombre de la exepcion.
		try {
			Partido par = new Encuentro();
			par.jugada();
		} catch(EquipoIncompleto e) {
		} catch(Falta e) {
		} catch(Lluvia e) {
		} catch(FutbolException e) {}
		}
	}
}
