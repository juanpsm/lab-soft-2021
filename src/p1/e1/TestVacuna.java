package p1.e1;

class TestVacuna {

	public static void main(String[] args) {
		
		Vacuna[] vacunas = {
				new Vacuna("Pfizer", "Argentina", "Covid", 4),
				new Vacuna("Generica", "Bolivia", "Peste Negra", 4),
				new Vacuna("Moderna", "Chile", "Sarampion", 4),
				new Vacuna("Delta", "Brazil", "Gripe", 4),
				new Vacuna("Master", "Canada", "Viruela", 4),
		};
		
		for (int i = 0; i < vacunas.length; i++) {
            System.out.println(vacunas[i]);
        }
		
		Vacuna v1 = new Vacuna("Nombre", "Pais", "Enfermedad", 1);
		Vacuna v2 = new Vacuna("Nombre", "Pais", "Enfermedad", 1);

        System.out.println("\n--------------------- Comparación ---------------------");
        System.out.println("v1.equals(v2): " + v1.equals(v2));
        System.out.println("v1 == v2:      " + (v1 == v2));
        System.out.println("v1.hashCode(): " + v1.hashCode());
        System.out.println("v2.hashCode(): " + v2.hashCode());

	}
}
