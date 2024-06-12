package Exception;

public class PrecioDemasiadoAltoException extends Exception {

	public PrecioDemasiadoAltoException(double precioConIva) {
        super("El precio con IVA es demasiado alto: " + precioConIva);
    }
	
	
	public PrecioDemasiadoAltoException() {
		// TODO Auto-generated constructor stub
	}

	public PrecioDemasiadoAltoException(String message) {
		super(message);
		// TODO Auto-generated constructor stub
	}

	public PrecioDemasiadoAltoException(Throwable cause) {
		super(cause);
		// TODO Auto-generated constructor stub
	}

	public PrecioDemasiadoAltoException(String message, Throwable cause) {
		super(message, cause);
		// TODO Auto-generated constructor stub
	}

	public PrecioDemasiadoAltoException(String message, Throwable cause, boolean enableSuppression,
			boolean writableStackTrace) {
		super(message, cause, enableSuppression, writableStackTrace);
		// TODO Auto-generated constructor stub
	}

}
