package epn;

public class Alumno extends Persona {
	String materias[];
	String profesores[];
	
	public Alumno(String nombre, String[] materias, String[] profesores) {
		super(nombre);
		this.materias = materias;
		this.profesores = profesores;
	}

	public String buscProfesor(Profesor profesor){
		String busqueda = "";
		
	
		return busqueda;
	}
	
	public String[] listProfesores(){
		return profesores;
	}
	
	public String[] listMaterias(){
		return materias;
	}
	

}
