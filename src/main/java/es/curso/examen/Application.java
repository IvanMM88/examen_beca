package es.curso.examen;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import es.curso.examen.dao.EmpleadoDAO;
import es.curso.examen.dao.IEmpleadoDAO;
import es.curso.examen.logs.FicherosLog;
import es.curso.examen.modelo.Empleado;

public class Application {
	

	public static void main(String[] args) {
		ejemploGrabarEnElLog();
		
		pruebaConXML();
		//pruebaConAnotaciones();
	}
		

	private static void ejemploGrabarEnElLog() {
		// Codigo de prueba para ver como se utiliza el metodo grabarLog de la clase FicherosLog
		
		// Grabamos una linea en el fichero de Log:
		FicherosLog.grabarLog("contenido de la linea de log", "src/logs/mi_log.txt");
		FicherosLog.grabarLog("Otra linea de log", "src/logs/mi_log.txt");
		FicherosLog.grabarLog("Una tercera linea de log", "src/logs/mi_log.txt");
	}

	private static void pruebaConAnotaciones() {
		// Cargar el contexto para anotaciones.
		
	}

	private static void pruebaConXML() {
		// Cargar el contexto para XML
		ApplicationContext context;

		context = new ClassPathXmlApplicationContext("contexto.xml");

		Empleado emp = (Empleado) context.getBean("empleado");

		IEmpleadoDAO empDAO = (IEmpleadoDAO) context.getBean("empleadoDAO");
		empDAO.create(emp);
		empDAO.delete(emp.getCodigo());
		empDAO.update(emp);

		((ClassPathXmlApplicationContext)context).close();

		}

}
