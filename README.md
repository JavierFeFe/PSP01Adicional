# Tarea para PSP01 (adicional)
## Detalles de la tarea de esta unidad.

Propongo como tarea adicional realizar el mismo ejemplo que se realiza en el apartado 3.6 pero simplificándolo, y prescindiendo como digo de interface gráfica y facilitando la portabilidad entre diferentes máquinas (Linux, Windows y MacOS).


![image](https://user-images.githubusercontent.com/44543081/47952969-1b7bca80-df77-11e8-9aa8-8f3a79c8b607.png)  
*Creo una aplicación de ejemplo desde Netbeans para lanzar los procesos.*


![image](https://user-images.githubusercontent.com/44543081/47953003-95ac4f00-df77-11e8-9ad9-233868f5cb53.png)  
*Copio el jar generado desde Netbeans a la carpeta "prueba" dentro del usuario.*


![image](https://user-images.githubusercontent.com/44543081/47953072-431f6280-df78-11e8-9664-e7113a083f66.png)  
*Creo una nueva clase en Eclipse llamada CreaProcesosView que incluya el método main.*


![image](https://user-images.githubusercontent.com/44543081/47953080-8083f000-df78-11e8-84e0-55e05886c587.png)  
*Identifico el sistema operativo, aunque en mi ejemplo no sería necesario ya que Windows reconoce las rutas de archivo con los dos tipos de barra oblicua.

![image](https://user-images.githubusercontent.com/44543081/47953100-cd67c680-df78-11e8-808b-9984d170f5b4.png)  
*Compruebo que la aplicación exista en la ubicación preestablecida (identificando la carpeta home evito problemas para diferenciar rutas para distintos sistemas operativos, por lo que podria decir que es multiplataforma (por lo menos Windows, Linux y Mac))*


![image](https://user-images.githubusercontent.com/44543081/47953113-fdaf6500-df78-11e8-944a-1412e2be4eff.png)  
*Identifico los parámetros de ejecución, en caso de no introducirlos se ejecutará con los parámetros por defecto.


![image](https://user-images.githubusercontent.com/44543081/47953118-29cae600-df79-11e8-8f90-df9c4a50f91f.png)  
*Inicio el bucle de ejecución*


![image](https://user-images.githubusercontent.com/44543081/47953167-efae1400-df79-11e8-9182-2c0f2bbd33eb.png)  
*Pruebo la ejecución en Windows*


![image](https://user-images.githubusercontent.com/44543081/47953371-0b66e980-df7d-11e8-8deb-30b3a8883aad.png)
*Realizo prueba en una máquina linux mediante ssh (para comprobar las rutas de acceso)*

**Se incluyen los archivos jar dentro de la carpeta build**
