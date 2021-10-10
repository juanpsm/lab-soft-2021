package p6.e1;

public class TestAnotaciones {
	public static void main(String arg[]) throws Exception {
		new TestAnotaciones().testearYa();
	}
//	@SuppressWarnings({"deprecation"})
	public void testearYa() {
		TestDeprecated t2 = new TestDeprecated();
		t2.hacer();
	}
	
	/*
    a) Cuando se ejecuta TestAnotaciones, se imprime "Testeando: 'Deprecated'".
    b) Cuando se elimina @SuppressWarnings({"deprecation"}), da una advertencia que el metodo hacer()
    esta deprecado, pero el resultado de la ejecución es el mismo.
    c) La diferencia está en que cuando anotamos el método testearYa, podemos trabajar en dicho método
    con métodos deprecados sin warnings. Si anotamos la clase, podemos usar métodos deprecados sin warnings 
    en toda la clase.
    */
}