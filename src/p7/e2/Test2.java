package p7.e2;

public class Test2 {
	public int unMetodo(){
		try {
			System.out.println("Va a retornar 1");
			return 1;
		} finally {
			// Unreachable code
			System.out.println("Va a retornar 2");
			return 2;
			// finally block does not complete normally
		}
	}
	public static void main(String[] args) {
		Test2 res = new Test2();
		System.out.println(res.unMetodo());
	}
}

//Va a retornar 1
//Va a retornar 2
//2
