package Exception;

public class Main {
	
	public static void main(String[] args) {
		
		double precioSinIva = 90;
		
		try {
			
			double precioConIva = getPrecioConIva(precioSinIva);
			System.out.println("Precio con IVA " + precioConIva);
		
		} catch(PrecioDemasiadoAltoException e) {
			
			System.err.println(e.getMessage());
		}
		
	}
	
	public static double getPrecioConIva(double precioSinIva) throws PrecioDemasiadoAltoException{
		
		double iva = 1.21;
		double precioConIva = precioSinIva * iva;
		
		if(precioConIva > 100) {
			throw new PrecioDemasiadoAltoException(precioConIva);
		}
		
		return precioConIva;
		
	}

}
