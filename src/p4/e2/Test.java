package p4.e2;

public class Test {
	public static void main(String[] args) {
//i)	Veterinaria <Animal> vet = new Veterinaria <Gato>();
//		Mal los tipos
//		Veterinaria<Gato> vet = new Veterinaria <Gato>();
//ii)	Veterinaria <Gato> vet = new Veterinaria <Animal>();
//		Mal los tipos
//		Veterinaria<Animal> vet = new Veterinaria <Animal>();
//iii)	Veterinaria <?> vet = new Veterinaria<Gato>();
//		vet.setAnimal(new Gato());
//		No va gato
//iv)	Veterinaria vet = new Veterinaria ();
//		vet.setAnimal(new Perro());
//		ok
//		Veterinaria vet = new Veterinaria ();
//		vet.setAnimal(new Perro());
//v)	Veterinaria vet = new Veterinaria <?>();
//		no se puede instanciar Veterinaria 
//		Veterinaria vet = new Veterinaria <?>();
//vi)	Veterinaria <? extends Animal> vet = new Veterinaria<Gato>();
		Veterinaria <? extends Animal> vet = new Veterinaria<Gato>();
		//ok
    }
}