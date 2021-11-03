package p6.e3;

public class NotAServerException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = -415179249676025650L;

	@Override
    public String getMessage(){
        return "La clase parametrizada no representa a un server web";
    }
}
