package epn.com;

import java.util.Arrays;

public class Materia {
	String nombreMateria;
	String [] profesor;
	String [] alumno;

	public Materia(String nombreMateria) {
		super();
		this.nombreMateria = nombreMateria;
	}

	public String getNombreMateria() {
		return nombreMateria;
	}

	public void setNombreMateria(String nombreMateria) {
		this.nombreMateria = nombreMateria;
	}

	@Override
	public String toString() {
		return "Materia [nombreMateria=" + nombreMateria + ", profesor=" + Arrays.toString(profesor) + ", alumno="
				+ Arrays.toString(alumno) + "]";
	}
		

}
