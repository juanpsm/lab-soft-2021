package p7.e1;

class Excepcion1 extends Exception{}
class Excepcion2 extends Excepcion1{}

public class Test1 {
    public static void main(String[] args) {
        try {
        	throw new Excepcion2();
//        } catch(Excepcion1 e1) {
//            System.out.println("Se capturó la Excepción1");
        } catch( Excepcion2 e2) { 
        	// Unreachable catch block for Excepcion2. 
        	// It is already handled by the catch block for Excepcion1
        	// Hay que poner Exepcion1 al final
            System.out.println("Se capturó la Excepción2");
        } catch(Excepcion1 e1) {
            System.out.println("Se capturó la Excepción1");
        }
    }
}

//Se capturó la Excepción2