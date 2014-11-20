import java.io.FileNotFoundException;
import java.io.IOException;


/**
 * Clase que amplia la funcionalidad del GestorTabla basico, incorporando el listado de todos los registros de la tabla de datos 
 * ordenados por el campo numReg, asi como un listado acotado de los registros de la tabla de datos ordenados por el 
 * campo numReg
 * @version 1.0, (c)2014
 * @author TGI-BBDD
 */

public class GestorTablaExtendido extends GestorTabla{
	
	
  /** 
    * Crea un nuevo archivo de datos  en disco, de nombre "nombre.dat", y un nuevo archivo de tipo arbol B, de nombre
    * "nombre.btree", asociado al archivo de datos , cuyo orden sera el indicado en <code>orden</code>. 
    * Ambos ficheros quedaran abiertos para lectura/escritura. Si alguno de los dos ficheros (o los dos) existe, este metodo 
    * borrara su contenido.
    * @param nombre Nombre (sin extension) que se le va a dar al fichero de registros de datos y al fichero de indices (arbol B) asociado al mismo.
    * @param orden Orden del arbol B a crear.
    * @param registro Objeto de tipo RegistroNumReg que se desea manejar en el archivo de datos 
    * @throws FileNotFoundException Si no se puede crear alguno de los dos ficheros.
    * @throws IOException Si durante la creacion de alguno de los dos ficheros se produce un error de entrada/salida.
    */		
	public GestorTablaExtendido(String nombre, int orden, RegistroNumReg registro) throws FileNotFoundException, IOException{
	 }
	
  /** 
    * Abre un archivo de datos existente en disco, de nombre "nombre.dat", y un archivo de tipo arbol B, de nombre 
    * "nombre.btree", asociado al archivo de datos. Ambos ficheros deben existir y quedaran abiertos en el modo que 
    * se indique en el parametro modo ("r" o "rw"). 
    * @param nombre Nombre (sin extension) del fichero de registros de datos y del fichero de indices (arbol B) asociado al mismo.
    * @param modo Modo de apertura de ambos ficheros (lectura - "r" - o lectura/escritura -"rw").
    * @param registro Objeto de tipo RegistroNumReg que se desea manejar en el archivo de datos 
    * @throws FileNotFoundException Si no se puede abrir alguno de los dos ficheros.
    * @throws IOException Si durante la apertura de alguno de los dos ficheros se produce un error de entrada/salida.
    */			
	public GestorTablaExtendido(String nombre, String modo, RegistroNumReg registro) throws FileNotFoundException, IOException{
	 }	
	
	
  /** Vuelca por salida estandar el contenido completo del archivo de registros de datos ordenados por el campo
    * numReg.
    * @throws IOException Si durante la ejecucion del metodo se produce un error de entrada/salida.
    */	
	public void listar()throws IOException{
	}


	 /** Vuelca por salida estandar el contenido de los registros del archivo de datos cuyo campo numReg este entre clave1 y clave2 
     * (incluidos ambos), ordenados por el campo numReg. 
     * @param valorClave1 Valor menor del campo numReg a considerar en el listado ordenado
     * @param valorClave2 Valor mayor del campo numReg a considerar en el listado ordenado
     * @throws IOException Si durante la ejecucion del metodo se produce un error de entrada/salida.
     */	
        public void listar(int valorClave1, int valorClave2)throws IOException{
        }
		

}
