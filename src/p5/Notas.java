package p5;

public enum Notas {
	LA("A"),
	SI("B"),
	DO("C"),
	RE("D"),
	MI("E"),
	FA("F"),
	SOL("G");
	private String cifradoAmericano;

	Notas(String cifradoAmericano) {
		this.cifradoAmericano = cifradoAmericano;
	}
	public String americano() { return cifradoAmericano; }
	public String toString() { return this.name(); }
}
