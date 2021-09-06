package p1.e5;

public class PoolConexiones {
	private static PoolConexiones single_instance = null;
	
	String msg;
	
	private PoolConexiones()
    {
        msg="Hello I am a string part of Singleton class";
        
    }
	
	public static PoolConexiones getInstance()
    {
        if (single_instance == null)
            single_instance = new PoolConexiones();
 
        return single_instance;
    }
}

class TestPoolConexiones {
    // Main driver method
    public static void main(String args[])
    {
        // Instantiating Singleton class with variable x
    	PoolConexiones x = PoolConexiones.getInstance();
 
        // Instantiating Singleton class with variable y
    	PoolConexiones y = PoolConexiones.getInstance();
 
        // Instantiating Singleton class with variable z
    	PoolConexiones z = PoolConexiones.getInstance();
 
        // Printing the hash code for above variable as
        // declared
        System.out.println("Hashcode of x is "
                           + x.hashCode());
        System.out.println("Hashcode of y is "
                           + y.hashCode());
        System.out.println("Hashcode of z is "
                           + z.hashCode());
 
        // Condition check
        if (x == y && y == z) {
 
            // Print statement
            System.out.println(
                "Three objects point to the same memory location on the heap i.e, to the same object");
        }
 
        else {
            // Print statement
            System.out.println(
                "Three objects DO NOT point to the same memory location on the heap");
        }
    }
}
