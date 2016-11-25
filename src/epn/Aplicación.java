package epn;

import java.util.Arrays;

public class Aplicación {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String Materias[]={"Calculo","Mates","Biologia"};
		String Profesores[]={"Juan","Maria","Segoviano"};
		String Alumnos[]={"Carlos","Juanca","Martha"};
		Materia listaMaterias[]=new Materia[3];
		Profesor listaProfesotres[]= new Profesor[5];
		Alumno listaAlumnos[]= new Alumno[5];
		
		
		
		listaAlumnos[0]= new Alumno("Carlos",Materias,Profesores);
		listaProfesotres[0]= new Profesor("Juan",Alumnos ,Materias);
		
		//Materias del Alumno 1(Posicion 0)
		System.out.println("Materias del Alumno 1:\n"+ Arrays.toString(listaAlumnos[0].listMaterias()));
		
		//Materias del profesor 1(Posición 0)
		System.out.println("Alumnos del Profesor 1\n"+Arrays.toString(listaProfesotres[0].listAlumnos()));
		


	}

}
