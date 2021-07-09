package interceptar;

import es.curso.examen.logs.FicherosLog;
import es.curso.examen.modelo.Empleado;

public class Interceptar {
	
	private Empleado empleado;
	
	public void crearIntercep(Empleado e) {
		FicherosLog.grabarLog("Crear "+e, "src/logs/mi_log.txt");
	}
	
	public void borrarIntercep(int numero) {
		FicherosLog.grabarLog("Borrar con codigo "+numero, "src/logs/mi_log.txt");
	}
	public void actualizarIntercep(Empleado e) {
		FicherosLog.grabarLog("Crear "+e, "src/logs/mi_log.txt");
	}
	
	public Empleado get_empleado() {
		return empleado;
	}
	
	public void set_empleado(Empleado empleado) {
		this.empleado = empleado;
	}
}
