package p1.e1;

class TestVacuna {

	public static void main(String[] args) {
		
		Vacuna[ ] vacunas = new Vacuna[5];
		
		vacunas[0] = new Vacuna("Pfizer", "Argentina", "Covid", 4);
		vacunas[1]  = new Vacuna("Generica", "Bolivia", "Peste Negra", 4);
		vacunas[2]  = new Vacuna("Moderna", "Chile", "Sarampion", 4);
		vacunas[3]  = new Vacuna("Delta", "Brazil", "Gripe", 4);
		vacunas[4]  = new Vacuna("Master", "Canada", "Viruela", 4);
		
		System.out.println(vacunas[0].toString());
		System.out.println(vacunas[1].toString());
		System.out.println(vacunas[2].toString());
		System.out.println(vacunas[3].toString());
		System.out.println(vacunas[4].toString());
	}
}
