package EjercicioExtra;
import java.io.File;
import java.io.IOException;

public class CreaProcesosView {
	
	public static void main(String[] args) {
		int procesos = 1;//Nº de ejecuciones por defecto
		String slash;
		//Esta parte no sería necesaria, ya que Windows reconoce las rutas con / en lugar de \, lo incorporo simplemente como ejemplo.
		if (System.getProperty("os.name").toUpperCase().contains("WIN")) {
			slash = "\\";
		}else {
			slash = "/";
		}
		String proces = System.getProperty("user.home")+ slash +"prueba" + slash + "HTMLEditorApp.jar";
		File archivo = new File(proces);
		if (!archivo.exists()){
			System.out.println("ERROR: La aplicacion "+ archivo.getName()+ " debe estar ubicada en: " +archivo.getParent());
			return;
		}
		if (args.length == 1 && args[0].matches("\\d+")) { //Comprueba que los parámetros introducidos sean correctos
			procesos = Integer.parseInt(args[0]);
		}else {
			System.out.println("No se especificó el nº de procesos, se ejecutará el valor por defecto: " + procesos);
			System.out.println("Parámetros: Java -jar CreaProcesosView.jar <n> nº de procesos simultaneos");
		}
		try {
			for (int i=0 ;i<procesos;i++) { //Inicio el bucle que abrirá los procesos
				Runtime.getRuntime().exec("java -jar "+ archivo);
			}
		} catch (SecurityException ex) {
			System.out.println("No se ha podido crear el proceso por falta de permisos.");
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}
