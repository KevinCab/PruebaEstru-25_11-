package epn;

public class Profesor extends Persona {
	String alumnos[];
	String materias[];
	
	
	public Profesor(String nombre, String[] alumnos, String[] materias) {
		super(nombre);
		this.alumnos = alumnos;
		this.materias = materias;
	}


	public String[] getAlumnos() {
		return alumnos;
	}

	public void setAlumnos(String[] alumnos) {
		this.alumnos = alumnos;
	}

	public String[] getMaterias() {
		return materias;
	}

	public void setMaterias(String[] materias) {
		this.materias = materias;
	}
	
	public String[] listAlumnos(){
		return alumnos;
	}
	
	public String[] listMaterias(){
		return materias;
	}

}
