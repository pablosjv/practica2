import java.io.IOException;
import java.io.FileNotFoundException;

/** Esta clase se debera encargar de probar y validar el funcionamiento completo de la clase implementada.
 * Concretamente, deberan probarse todos y cada uno de los metodos implementados en GestorTabla en todas
 * las posibles situaciones de ejecucion de los mismos, comprobando que los valores que deben devolver en cada
 * caso son los esperados. Se recomienda que por cada operacion se vuelque por consola tanto el contenido
 * del archivo de datos como el del arbol B asociado al mismo, para validar el correcto funcionamiento de todos
 * los metodos. La funcionalidad de GestorTabla debera validarse tanto para una tabla de registros de libros 
 * (con su arbol B asociado) como para una tabla de registros de bibliotecas (con su arbol B asociado).
 * 
 */

public class PruebasGestorTabla extends Object{
	/**
	 * Permite probar la clase GestorTabla.
	 */
	public PruebasGestorTabla(){
	    /**
	     * Deberan probarse los siguientes metodos en las situaciones indicadas
	     * 	- constructor de GestorTabla que CREA un archivo de registros de tipo RegistroLibro y su arbolB asociado. Situaciones:
	     * 		- ninguno de los dos ficheros existe. Validar que los crea, que el archivo de datos contiene el registro 0 completo (con todos los
	     *        campos de un registro de tipo RegistroLibro y con el campo control a -1) y que el archivo que mantiene el 
	     *        arbol B contiene el registro 0 completo (con el campo control a -1, con el orden indicado y con la pagina raiz en el 
	     *        registro 1) y el registro 1 sin claves.
	     *      - alguno de los dos ficheros existe (o los dos). Validar que borra su contenido y que el nuevo contenido es igual que en 
	     *        la situacion expuesta en el punto anterior.
	     *  - constructor de GestorTabla que ABRE un archivo de registros de tipo RegistroLibro y su arbolB asociado. Situaciones:
	     *  	- Los dos ficheros existen. Validar que su contenido es exactamente el mismo que la ultima vez que 
	     *        se trabajo con ellos.
	     *      - alguno de los dos ficheros no existe. Debe saltar la excepcion FileNotFoundException que debera capturarse e
	     *        indicar por la consola esta situacion mediante un mensaje de error
	     *  - getArbolB y getArchivoDatos se validaran al emplearlos para conseguir volcar por consola los ficheros que manejan ambos
	     *  - buscar. Situaciones:
	     *      - buscar un registro de Libro que exista (util). Validar que el contenido del registro obtenido por el metodo es el del registro buscado
	     *      - buscar un registro de Libro cuya clave no exista en ningun registro del archivo de datos (ni si quiera en los registros marcados como borrados). 
	     *        Validar que devuelve null.
	     *      - buscar un registro de Libro cuya clave exista en algun registro del archivo de datos, pero asignada a un registro marcado como borrado 
	     *        Validar que devuelve null.
	     *  - insertar. Situaciones:
	     *  	- insertar un registro de Libro que tenga asignada una clave que no exista en ningun registro del archivo de datos (ni siquiera en los marcados como borrados).
	     *        Validar que el registro se ha insertado en el archivo de Libros y que la clave se ha creado en el arbol correctamente (con los campos valor y posicion
	     *        correctos). Validar que devuelve true.
	     *      - insertar un registro de Libro que tenga asignada una clave que exista en un registro del archivo de datos, pero asignada a un registro marcado como borrado.
	     *        Validar que el registro se ha insertado en el archivo de Libros y que la clave se ha creado en el arbol correctamente (con los campos valor y posicion
	     *        correctos). Validar que devuelve true.
	     *      - insertar un registro de Libro que tenga asignada una clave que exista en un registro del archivo de datos, asignada a un registro util (no borrado).
	     *        Validar que no se realiza ninguna escritura en ninguno de los dos ficheros. Validar que devuelve false.
	     *  - borrar. Situaciones:
	     *      - borrar un registro de Libro que exista. Validar que en el archivo de registros de Libros el registro se ha aniadido a la lista de huecos. Validar que
	     *        en el archivo del arbol B se ha eliminado la clave de ese registro. Validar que devuelve true.
	     *      - borrar un registro de Libro cuya clave no exista en ningun registro del archivo de datos (ni si quiera en los registros marcados como borrados). 
	     *        Validar que devuelve false y que no se ha modificado nada en ninguno de los dos archivos.
	     *      - borrar un registro de Libro cuya clave exista en algun registro del archivo de datos, pero asignada a un registro marcado como borrado 
	     *        Validar que devuelve false y que no se ha modificado nada en ninguno de los dos archivos.
	     *  - cerrar. Llamar a este metodo y comprobar que si posteriormente se intenta realizar alguna otra operacion (buscar, insertar, borrar) salta la excepcion IOException (se debera capturar)
	     *  
	     *  Toda esta funcionalidad debera validarse tambien para un objeto de tipo GestorTabla que maneje registros de tipo RegistroBiblioteca.
	     *         
	     */
		

	}
	
	public static void main(String[] args) {
		new PruebasGestorTabla();
	}
}
