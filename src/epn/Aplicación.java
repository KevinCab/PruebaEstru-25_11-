package epn;

import java.util.Arrays;

public class Aplicación {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Materias[]={"Calculo","Mates","Biologia"};
		String Profesores[]={"Juan","Maria","Segoviano"};
		Materia listaMaterias[]=new Materia[3];
		Profesor listaProfesotres[]= new Profesor[5];
		Alumno listaAlumnos[]= new Alumno[5];
		
		listaAlumnos[0]= new Alumno("Carlos",Materias,Profesores);
		
		
		//Materias del Alumno 1(Posicion 0)
		System.out.println(Arrays.toString(listaAlumnos[0].listMaterias()));
		
		
		
		

	}

}
