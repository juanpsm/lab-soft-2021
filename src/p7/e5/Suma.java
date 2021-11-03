package p7.e5;

public class Suma {
	public static void main(String[] args){
		int suma = 0;
		for(int i=0; i<args.length; i++) //con <= daba error
			 try {
				 suma += Integer.parseInt(args[i]);
			 } catch (NumberFormatException e) {
				 System.out.println("Discarded - " + e.getMessage());
			 }
		System.out.println("La suma es: " + suma);
	}
}
