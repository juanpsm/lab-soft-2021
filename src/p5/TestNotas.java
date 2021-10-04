package p5;

public class TestNotas {
	public static void main(String[] args) {
		for (Notas n : Notas.values() )
			System.out.println("La nota " + n + " se corresponde con la letra " + n.americano());
		}
}
