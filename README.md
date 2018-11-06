# Tarea para PSP01 (adicional)
## Detalles de la tarea de esta unidad.

Propongo como tarea adicional realizar el mismo ejemplo que se realiza en el apartado 3.6 pero simplificándolo, y prescindiendo como digo de interface gráfica y facilitando la portabilidad entre diferentes máquinas (Linux, Windows y MacOS).


![image](https://user-images.githubusercontent.com/44543081/47952969-1b7bca80-df77-11e8-9aa8-8f3a79c8b607.png)  
*Creo una aplicación de ejemplo desde Netbeans para lanzar los procesos.*


![image](https://user-images.githubusercontent.com/44543081/47953003-95ac4f00-df77-11e8-9ad9-233868f5cb53.png)  
*Copio el jar generado desde Netbeans a la carpeta "prueba" dentro del usuario.*


```Java
public static void main(String[] args) {
  int procesos = 1;//Nº de ejecuciones por defecto
```
*Creo una nueva clase en Eclipse llamada CreaProcesosView que incluya el método main.*

```Java
if (System.getProperty("os.name").toUpperCase().contains("WIN")) {
  slash = "\\";
}else {
  slash = "/";
}
```
*Identifico el sistema operativo, (aunque en mi ejemplo no sería necesario ya que Windows reconoce las rutas de archivo con los dos tipos de barra oblicua).

```Java
if (!archivo.exists()){
  System.out.println("ERROR: La aplicacion "+ archivo.getName()+ " debe estar ubicada en: " +archivo.getParent());
  return;
}
```
*Compruebo que la aplicación exista en la ubicación preestablecida (identificando la carpeta home evito problemas para diferenciar rutas para distintos sistemas operativos, por lo que podria decir que es multiplataforma (por lo menos Windows, Linux y Mac))*


```Java
if (args.length == 1 && args[0].matches("\\d+")) { //Comprueba que los parámetros introducidos sean correctos
  procesos = Integer.parseInt(args[0]);
}else {
  System.out.println("No se especificó el nº de procesos, se ejecutará el valor por defecto: " + procesos);
  System.out.println("Parámetros: Java -jar CreaProcesosView.jar <n> nº de procesos simultaneos");
}
```
*Identifico los parámetros de ejecución. En caso de no introducirlos se ejecutará con los parámetros por defecto.

```Java
for (int i=0 ;i<procesos;i++) { //Inicio el bucle que abrirá los procesos
  Runtime.getRuntime().exec("java -jar "+ archivo);
}
```
*Inicio el bucle de ejecución*


![image](https://user-images.githubusercontent.com/44543081/47953167-efae1400-df79-11e8-9182-2c0f2bbd33eb.png)  
```
java -jar CreaProcesosView.jar 4
```
*Pruebo la ejecución en Windows*


![image](https://user-images.githubusercontent.com/44543081/47953371-0b66e980-df7d-11e8-8deb-30b3a8883aad.png)
*Realizo prueba en una máquina linux mediante ssh (para comprobar las rutas de acceso)*

**Se incluyen los archivos jar dentro de la carpeta build**
