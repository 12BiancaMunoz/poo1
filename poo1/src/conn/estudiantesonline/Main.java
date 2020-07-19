package conn.estudiantesonline;



import java.util.List;

import com.cursoDAO.CursoDAOImpl;
import com.cursoDAO.EstudianteDAOImpl;

import conn.entidades.Cursos;
import conn.entidades.Estudiante;
import conn.interfa.CursosDAO;
import conn.interfa.EstudianteDAO;

public class Main {
	  static String URL = "jdbc:postgresql://localhost:5433/Alumnos";
	  static String USUARIO = "postgres";
	  static String CLAVE = "1234";
	

	  public static void main(String[] args) {
		  
		  EstudianteDAO estudianteDAO = new EstudianteDAOImpl();
		  ///tienes primarykey por eso el error
		  Estudiante estudiante = new Estudiante(9, "Leslie", "Saltos", "lesliesaltos@yahoo.es");       
		  estudianteDAO.ingresar(estudiante);		 
		  List<Estudiante> Estudiante = estudianteDAO.getEstudiante(); 
          System.out.println(Estudiante);
		  
		  
		  
		  
		  
		  
		  
		  
		  
		  
             //CursosDAO cursoDAO = new CursoDAOImpl();
            // List<Cursos> cursos = cursoDAO.getCursos(); 
            /// System.out.println(cursos);
            ///Cursos curso = new Cursos(0,"contabilidad");
          //// cursoDAO.ingresar(curso);
            //// cursoDAO.eliminar(5);
             ///cursoDAO.actualizar(curso);
       
            /// cursos= cursoDAO.getCursos();
            /// System.out.println(cursos.size());
             
          
		  
		  
		  
		  
	
	}

}
