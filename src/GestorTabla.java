import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * Clase que mantiene y gestiona una tabla de registros de tipo RegistroNumReg (normalmente de cualquiera que herede de RegistroNumreg) y el arbol B asociado a la misma. 
 * @version 1.0, (c)2014
 * @author TGI-BBDD
 */

public class GestorTabla extends Object{
	
 
  /** 
    * Crea un nuevo archivo de datos en disco, cuyo nombre sera el indicado como primer parametro del metodo con extension '.dat', y 
    * un nuevo archivo de tipo arbol B, cuyo nombre sera el indicado como primer parametro del metodo con extension '.btree', asociado 
    * al archivo de datos, cuyo orden sera el indicado en orden. Ambos ficheros quedaran abiertos para lectura/escritura. Si alguno 
    * de los dos ficheros (o los dos) existe, este metodo borrara su contenido.
    * @param nombre Nombre (sin extension) que se le va a dar al fichero de registros de datos y al fichero de indices (arbol B) asociado al mismo.
    * @param orden Orden del arbol B a crear.
    * @param registro Objeto de tipo RegistroNumReg que se desea manejar en el archivo de datos 
    * @throws FileNotFoundException Si no se puede crear alguno de los dos ficheros.
    * @throws IOException Si durante la creacion de alguno de los dos ficheros se produce un error de entrada/salida.
    */		
	public GestorTabla(String nombre, int orden, RegistroNumReg registro) throws FileNotFoundException, IOException{
	 }
	
  /** 
    * Abre un archivo de datos existente en disco, cuyo nombre sera el indicado como primer parametro del metodo con extension '.dat', y 
    * un archivo de tipo arbol B existente en disco, cuyo nombre sera el indicado como primer parametro del metodo con extension '.btree', 
    * asociado al archivo de datos. Ambos ficheros deben existir y quedaran abiertos en el modo que se indique en el parametro modo ("r" o "rw"). 
    * Si alguno de los dos ficheros (o los dos) NO existe, este metodo lanzara la excepcion FileNotFoundException.
    * @param nombre Nombre (sin extension) del fichero de registros de datos y del fichero de indices (arbol B) asociado al mismo.
    * @param modo Modo de apertura de ambos ficheros (lectura - "r" - o lectura/escritura -"rw").
    * @param registro Objeto de tipo RegistroNumReg que se desea manejar en el archivo de datos 
    * @throws FileNotFoundException Si no se puede abrir alguno de los dos ficheros.
    * @throws IOException Si durante la apertura de alguno de los dos ficheros se produce un error de entrada/salida.
    */		
	public GestorTabla(String nombre, String modo, RegistroNumReg registro) throws FileNotFoundException, IOException{
	 }	

  /**
	* Recupera la referencia al arbol B gestionado por esta clase.
 	* @return ArbolB Referencia al arbol B.
	*/	
	public ArbolB getArbolB(){
	}

  /**
	* Recupera la referencia al archivo de datos gestionado por esta clase.
 	* @return ArchivoLH Referencia al archivo de datos.
	*/	
	public ArchivoLH getArchivoDatos(){
	}
	
  /**
    * Busca el registro del archivo de datos cuyo campo numReg se corresponda con valorClave, empleando para la 
    * busqueda el arbol B asociado al registro de datos. Si no existe ningun registro con numReg igual a valorClave, 
    * este metodo devolvera null.
    * @param valorClave Valor del campo numReg asociado al registros de datos cuyo contenido se desea obtener.
    * @return RegistroNumReg Contenido del registro de datos cuyo campo numReg es igual a valorClave o null si no lo encuentra
   * @throws IOException Si durante la ejecucion del metodo se produce un error de entrada/salida.
     */

	public RegistroNumReg buscar(int valorClave) throws IOException{
	}

  /** Borra el registro del archivo de datos cuyo campo numReg se corresponda con valorClave, actualiza 
    * el arbol B eliminando la clave correspondiente y devuelve true. Si no existe ningun registro con numReg 
    * igual a valorClave, este metodo devuelve false.
    * @param valorClave Valor del campo numReg asociado al registro de datos que se desea borrar
    * @return true si se encuentra el registro a borrar y false en caso contrario
    * @throws IOException Si durante la ejecucion del metodo se produce un error de entrada/salida.
    */
	public boolean borrar(int valorClave)throws IOException{
	}
	
  /** Inserta un nuevo registro en el archivo de datos. Si el campo numReg del nuevo registro ya esta 
    * asociado a alguno de los registros del archivo de datos, este metodo no tendra ningun efecto 
    * y devolvera false. En caso contrario, se creara una nueva entrada en el archivo de datos, 
    * se actualizara el arbol B convenientemente y el metodo devolvera true.
    * @param registro Registro con los datos a insertar
    * @return true si la insercion es correcta y false en caso contrario
    * @throws IOException Si durante la ejecucion del metodo se produce un error de entrada/salida.
   */
	public boolean insertar(RegistroNumReg registro)throws IOException{
	}

	 /**
	* Cierra el archivo de datos y el arbol B asociado al mismo. Despues de realizar esta operacion, cualquier
	* intento de acceso a alguno de los dos archivos asociados a este objeto a traves de los metodos implementados
	* en esta clase provocara una excepcion de tipo IOException.
           * @throws IOException Si durante la ejecucion del metodo se produce un error de entrada/salida.
	*/	
	public void cerrar()throws IOException{
	}	
	

}
