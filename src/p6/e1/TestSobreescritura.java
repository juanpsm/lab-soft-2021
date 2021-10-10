package p6.e1;

public class TestSobreescritura {
//	@SuppressWarnings({"deprecation"})
//	public String tostring() { este metodo no existe
	public String toString() {
		return super.toString() + " Testeando: 'Override'";
	}
	public static void main(String[] args) {
		TestSobreescritura a = new TestSobreescritura();
		System.out.println(a);
	}
}
