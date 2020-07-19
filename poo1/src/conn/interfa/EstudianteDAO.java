package conn.interfa;

import java.util.List;

import conn.entidades.Estudiante;

public interface EstudianteDAO {
	List<Estudiante>getEstudiante();
	public void ingresar(Estudiante estudiante);
	public void actualizar(Estudiante estudiante);
	public void eliminar(int id);
	
	

}
