package epn;

public class Materia {
	String nombMateria;
	String profesores[];
	String estudiantes[];
	
	public Materia(String nombMateria, String[] profesores, String[] estudiantes) {
		super();
		this.nombMateria = nombMateria;
		this.profesores = profesores;
		this.estudiantes = estudiantes;
	}
	
	
	public String getNombMateria() {
		return nombMateria;
	}
	public void setNombMateria(String nombMateria) {
		this.nombMateria = nombMateria;
	}
	public String[] getProfesores() {
		return profesores;
	}
	public void setProfesores(String[] profesores) {
		this.profesores = profesores;
	}
	public String[] getEstudiantes() {
		return estudiantes;
	}
	public void setEstudiantes(String[] estudiantes) {
		this.estudiantes = estudiantes;
	}
	
}
