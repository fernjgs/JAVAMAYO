package CompararFechas;

import java.util.Collection;
import java.util.Date;
import java.util.Iterator;
import java.util.Map;

public class Persona {

	private String dni, nombre;
	private Date fechaNacimiento;
	
	public Persona(String dni, String nombre, Date fechaNacimiento) {
		super();
		this.dni = dni;
		this.nombre = nombre;
		this.fechaNacimiento = fechaNacimiento;
	
	}
	
	
	public String getDni() {
		return dni;
	}
	public void setDni(String dni) {
		this.dni = dni;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Date getFechaNacimiento() {
		return fechaNacimiento;
	}
	public void setFechaNacimiento(Date fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	public Persona getPersonaMayor(Map personas) {
		
		Persona personaDevuelta = null;
		Collection<Persona> collection = personas.values();
		Iterator<Persona> it = collection.iterator();
		while(it.hasNext()) {
			if(personaDevuelta == null) {
				personaDevuelta = it.next();
			}else  {
				
				Persona p = it.next();
				if(personaDevuelta.getFechaNacimiento().getTime()<p.getFechaNacimiento().getTime()) {
					personaDevuelta = p;
				}
			}
		}
		
		return personaDevuelta;
		
	}
	
	
	
	
	
	
	
	@Override
	public boolean equals(Object o) {	
		if (!(o instanceof Persona)) return false;
		Persona persona = (Persona) o;
		return (dni == persona.getDni());
	}

	
	
	}


