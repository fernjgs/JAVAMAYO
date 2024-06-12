package CompararFechas;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

public class Main {

public static void main(String[] args) {
	
	
	SimpleDateFormat formatter = new SimpleDateFormat("dd-MM-yy");
	
	
	try {
		Persona p1 = new Persona("dni1", "Juan", formatter.parse("10-12-2024"));
		Persona p2 = new Persona("dni2", "Pedro", formatter.parse("24-10-1980"));
		
		Map personas = new HashMap();
		personas.put(p1.getDni(), p1);
		personas.put(p2.getDni(), p2);
		
		Persona persona = new Persona(null, null, null);
		Persona personaMasVieja = persona.getPersonaMayor(personas);
		System.out.println(p2.getNombre());

		
	
	} catch (ParseException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}

	
}
	
}
